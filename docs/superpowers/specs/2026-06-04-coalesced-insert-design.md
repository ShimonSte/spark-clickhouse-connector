# Design: Parallel-Convert / Coalesced-Write for ClickHouse Inserts

> Status: approved design, ready for implementation planning.
> Target branch: `clickbench-load-test`.
> Scope (this effort): all phases (0–10), with Phase 6 (off-heap Arrow) built **last and
> behind a disabled flag + leak tests**, gated on a profiling decision before it is ever enabled.
> This document supersedes the original proposal by grounding every claim in the actual code
> (paths + line numbers verified 2026-06-04) and adding the execution/agent/testing strategy.

---

## 1. Problem & motivation

A ClickHouse write does two things per Spark task:

1. **Convert** `InternalRow` → Arrow (`ArrowStream`) — CPU-bound, wants **maximum parallelism**.
2. **Insert** the Arrow bytes into ClickHouse — network/server-bound, wants **coalescing**
   (fewer, larger inserts → fewer parts, less background-merge pressure).

Today both stages are welded into one `DataWriter`: the task that converts is the task that
inserts, so `write parallelism == convert parallelism == part count`. Each task also builds its
own `NodeClient` (HTTP pool/TLS), so we also pay connection churn.

Established facts:

- **Connection pooling alone does not reduce parts.** Parts ≈
  `(#tasks) × (#CH partitions/task) × (flushes/partition)` — no connection term.
- **Parts floor (client-side)** = `#tasks` (with large `batchSize` and one partition/task).
  Going lower requires coalescing data living in *different* tasks.
- **Coalescing safely happens in two places:** the server (`async_insert`, global) or an
  **executor-local coordinator** (this design — deterministic block sizing, no server-setting dep).
- **ArrowStream is concatenable:** `[schema][recordBatch]…[EOS]`; many record batches sharing one
  schema can be sent as one insert. This is the technical enabler.

## 2. Goals / non-goals

**Goals**
- Keep `InternalRow → Arrow` conversion fully parallel (one converter per task).
- Coalesce the *insert* step so multiple tasks' Arrow batches become one larger insert.
- Share the `NodeClient` (HTTP pool/TLS) per executor — kill connection churn.
- Eliminate the redundant byte copy in `NodeClient.syncInsert`.
- Preserve at-least-once; offer stronger/weaker dedup modes explicitly.

**Non-goals**
- Exactly-once via staging tables / `MOVE PARTITION` (ClickLoad) — orthogonal, later track.
- Changing the read path.

---

## 3. Code-grounding corrections (verified against the tree)

These correct the original proposal's snippets to match reality.

### 3.1 Insert path & the double-read
`clickhouse-core/.../client/NodeClient.scala`:
- Client API is **v2** (`com.clickhouse.client.api.Client.Builder`), version `0.9.5`
  (`gradle.properties: clickhouse_client_v2_version=0.9.5`).
- The insert is `syncInsert[OUT]` (lines 155–187), reached via
  `syncInsertOutputJSONEachRow(database, table, inputFormat, data, settings)` (lines 127–142).
- **Double-read** at lines 164–181: `IOUtils.toByteArray(data)` → `new ByteArrayInputStream(payload)`
  passed to `client.insert(...)`, plus a throwaway `new ByteArrayInputStream("".getBytes())` fed to
  the deserializer (an insert has no meaningful row output).
- The client builder is at lines 97–104; `close()` at 106–107 closes the client.

**New API (Phase 0a):**
```scala
def insertArrowStream(
  table: String,
  payload: InputStream,        // single-use; caller rebuilds for retries
  database: String,
  settings: Map[String, String] = Map.empty
): Either[CHException, Unit] = {
  val is = new InsertSettings()
  settings.foreach { case (k, v) => is.setOption(k, v) }
  is.setDatabase(database)
  is.compressClientRequest(true)            // wire compression stays on; payload is uncompressed Arrow
  Try(client.insert(table, payload, ClickHouseFormat.ArrowStream, is).get()) match {
    case Success(_: InsertResponse)   => Right(())
    case Failure(se: ServerException) => Left(CHServerException(se.getCode, se.getMessage, Some(nodeSpec), Some(se)))
    case Failure(ex)                  => Left(CHClientException(ex.getMessage, Some(nodeSpec), Some(ex)))
  }
}
```
Note `client.insert` takes `table` (not `db.table`); database is set on `InsertSettings`. The
existing `syncInsert` can delegate to a private streaming core to remove its own double-read too.

### 3.2 Client cache sits ABOVE NodesClient/ClusterClient
- `NodesClient.scala` and `ClusterClient.scala` already cache `NodeClient` per spec / per
  `(shard, replica)` — but **per client instance, i.e. per task**, so each task still builds its own
  pool today.
- The writer chooses `Either[ClusterClient, NodeClient]` at `ClickHouseWriter.scala:103–115` and
  closes it at `close()` (lines 294–300).
- **Phase 0b:** introduce `NodeClientCache` (executor-scoped). `ClusterClient`/`NodesClient`
  construct `NodeClient` via `NodeClientCache.get(spec)` instead of `new NodeClient(spec)`, and their
  `close()` (and `ClickHouseWriter.close()`) must **stop closing** cached clients — only per-task
  resources (Arrow root/allocator/buffers) get closed. Cache lifetime ends at executor shutdown hook.
- `NodeSpec` is a case class with value equality → safe map key. Caveat: its `options: java.util.Map`
  participates in `hashCode` — treat immutable after construction.

### 3.3 doFlush anchor
`ClickHouseWriter.scala:247–285`: today `serialize(): Array[Byte]` →
`syncInsertOutputJSONEachRow(new ByteArrayInputStream(data))` inside
`Utils.retry[Unit, RetryableCHException](maxRetry, retryInterval){…}`, then `reset()` on success.
`Utils.retry` signature: `retry[R, T <: Throwable: ClassTag](retryTimes: Int, interval: Duration)(f: => R): Try[R]`
(`clickhouse-core/.../Utils.scala:97–110`).

### 3.4 Writers are duplicated per Spark version
Writers live under `spark-{3.3,3.4,3.5,4.0}/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/`:
`ClickHouseWriter.scala` (abstract base), `ClickHouseWrite.scala` (DSv2 wiring),
`format/ClickHouseArrowStreamWriter.scala`, `format/ClickHouseJsonEachRowWriter.scala`,
`WriteJobDescription.scala`. Config: `org/apache/spark/sql/clickhouse/ClickHouseSQLConf.scala`,
`SparkOptions.scala` (the `WriteOptions.eval(key, entry)` pattern). spark-4.0's Arrow writer has extra
**Variant → JSON string** handling. ⇒ shared machinery goes in `clickhouse-core`; thin wiring +
config keys are mirrored 4×.

### 3.5 Arrow serialization detail
`ClickHouseArrowStreamWriter.doSerialize()` builds a full `ArrowStreamWriter(root, null, output)` and
returns `serializedBuffer.toByteArray`. To make batches concatenable we serialize **only the
record-batch message** via `VectorUnloader.getRecordBatch` + `MessageSerializer.serialize(WriteChannel, ArrowRecordBatch)`;
the assembler writes the schema header once. Arrow comes transitively from Spark (3.5.x vs 4.0.x) —
confirm `VectorUnloader`/`MessageSerializer`/`TransferPair` API per version before Phase 6.

---

## 4. New shared machinery (all in `clickhouse-core/.../spark/`)

| File | Responsibility |
|---|---|
| `client/NodeClientCache.scala` | executor-scoped `ConcurrentHashMap[NodeSpec, NodeClient]` + shutdown hook |
| `write/coalesce/BatchHandle.scala` | transferable payload + `Promise[Unit]` ack; `ShardKey`, `BatchId` |
| `write/coalesce/BatchPayload.scala` | `BytesPayload` now; `OffHeapPayload` (Phase 6) |
| `write/coalesce/ArrowStreamAssembler.scala` | schema header + batches + EOS → lazy `SequenceInputStream` (zero concat copy) |
| `write/coalesce/DedupToken.scala` | stable per-group dedup token |
| `write/coalesce/InsertBucket.scala` | per-`ShardKey` buffer, byte threshold + hard cap (backpressure), linger, seal |
| `write/coalesce/InsertCoordinator.scala` | executor singleton: bucket registry + dedicated sender pool |

`NodeClient.insertArrowStream` (Phase 0a) is the only change inside the existing client file.

---

## 5. Phases (with code anchors)

### Phase 0 — Safe prep (ships standalone, no behavior change)
- **0a** `insertArrowStream` streaming insert; remove the double-read (and refactor `syncInsert` to
  share the streaming core). Returns `Either[CHException, Unit]`.
- **0b** `NodeClientCache`; rewire `ClusterClient`/`NodesClient`/writer to `get(spec)`; stop closing
  cached clients in `close()`. Set pool sizing on the builder
  (`setMaxConnections` ≈ `2 × executor.cores`, connect/connection-request timeouts) from `nodeSpec.options`.
- **Done:** existing IT suites pass unchanged with cache on; one shared client per (executor, node).

### Phase 1 — Split convert from flush
- `ClickHouseArrowStreamWriter.doSerialize()` → emit only the record-batch message bytes (`BytesPayload`).
- `ClickHouseWriter.doFlush` → build `BatchHandle` → `coordinator.submit(handle)`; track returned
  futures in a per-task `pendingAcks`.
- **Done:** with coalescing disabled (group size 1, linger 0), behavior is byte-identical to today.

### Phase 2 — `InsertCoordinator` + bucket + assembler + dedup `coalesced`
- `submit(h)` enqueues into `bucket(h.bucket)`, **blocks if bucket full** (backpressure).
- `InsertBucket` flushes on `bufferedBytes ≥ targetBytes` OR `seal()` OR `lingerMs`. **Flush always
  runs on the sender pool, never on a Spark task thread** (deadlock/starvation guard).
- `flush(group)`: `token = DedupToken.forGroup(group)`; `mkStream = () => ArrowStreamAssembler.lazyStream(schema, group)`
  (rebuildable per retry); `Utils.retry` around `client.insertArrowStream`; all-or-nothing —
  on success every `payload.close()` + `promise.success`, on final failure every `promise.failure`.
- `ShardKey = (database, table, shardNum)`; routes to `NodeClientCache.get(shardSpec.node)`.
- **Done:** N concurrent tasks → `⌈Σbytes/targetBytes⌉` inserts (verify `system.query_log`); parts drop;
  no flush on a task thread (thread-name assertion in test).

### Phase 3 — Commit / abort / lifecycle + dedup `deterministic`
- `commit()`: flush local buffer → `coordinator.seal(bucket)` → `Await` this task's `pendingAcks` →
  return `CommitMessage`.
- `abort()`: fail/drop this task's pending handles; do **not** close shared client.
- `close()`: close Arrow root/allocator + per-task buffers only.
- Executor shutdown hook: stop sender pool, flush nothing uncommitted (Spark retries those tasks),
  `NodeClientCache.closeAll()`.
- Pitfall guarded: a batch whose task hasn't committed is never acked durable.

### Phase 7 — `async_insert` passthrough (A/B baseline)
- Add `spark.clickhouse.write.settings` (mirror of `READ_SETTINGS` plumbing) injected into every insert →
  enables `async_insert=1, wait_for_async_insert={0,1}, async_insert_deduplicate=1, async_insert_max_data_size=…`
  with no code changes. Gives global cross-executor coalescing as benchmark baseline.

### Phase 6 — Off-heap Arrow (GATED: build last, flag default off, leak-tested)
- Decision gate: only enable after profiling shows IPC serialize is hot OR holding serialized bytes
  doubles resident memory. Build it behind `coalesce.offHeap=false`.
- `OffHeapPayload` holds a transferred `ArrowRecordBatch` (moved out of the reusable root via
  `TransferPair`/`VectorUnloader.getRecordBatch` into a coordinator-owned allocator before `reset()`).
- Deterministic `close()` on **all** paths (commit/abort/failure/shutdown/retry-exhausted); off-heap
  byte budget + backpressure separate from heap; release each batch only after ack.
- Leak test: allocator balance == 0 after commit/abort/failure.

---

## 6. Deduplication (`spark.clickhouse.write.dedup.mode`)
ClickHouse dedup is **per-insert-block**; coalescing mixes tasks into one block.

- `none` — no token; pure at-least-once.
- `coalesced` *(default)* — `insert_deduplication_token = sha1(group.map(_.batchId.stable).join("|"))`,
  stable across retries of the same group. Makes **coordinator-level retries exactly-once**
  (ack-loss safe) on `Replicated*`/`SharedMergeTree` within the dedup window. Still at-least-once under
  Spark task re-runs (re-grouping changes the block → different token). No weaker than today.
- `deterministic` — **disables cross-task coalescing**; each insert = one task's batches grouped by
  `(stageId, partitionId, blockSeqWithinPartition)` (no attempt number), token = same tuple →
  exactly-once on `Replicated`/`Shared`, at the cost of the coalescing parts-win.

Also expose `async_insert_deduplicate` via Phase 7 passthrough. Doc guidance: true exactly-once at
scale ⇒ `deterministic` or staging-table pattern; `coalesced` is the throughput/parts default.

## 7. Retry & failure
- **In-executor:** reuse `WriteOptions` (`maxRetry`, `retryInterval`, `retryableErrorCodes`) via
  `Utils.retry[_, RetryableCHException]`; rebuild `SequenceInputStream` per attempt; stable token ⇒
  no dupes on success-after-ack-loss; all-or-nothing group completion; backpressure pauses draining
  during retry (bounded by `maxBufferedBytes`).
- **Spark task retry:** failed group → failed tasks → re-convert deterministically → re-submit;
  dedup per mode. **Speculative execution** can double-insert under `coalesced` → recommend disabling
  `spark.speculation` for CH writes or use `deterministic`.
- **Poison/non-retryable:** fail the group immediately → stage fails fast.

## 8. Config surface (`ClickHouseSQLConf` + `WriteOptions`, mirrored per version)

| Key | Default | Meaning |
|---|---|---|
| `spark.clickhouse.write.coalesce.enabled` | `false` | master switch (flip after bench) |
| `spark.clickhouse.write.coalesce.targetBytes` | `64m` | flush size threshold |
| `spark.clickhouse.write.coalesce.maxBufferedBytes` | `256m` | backpressure cap per bucket |
| `spark.clickhouse.write.coalesce.lingerMs` | `300` | tail flush timer |
| `spark.clickhouse.write.coalesce.senderThreads` | `2` | per-executor sender pool |
| `spark.clickhouse.write.coalesce.offHeap` | `false` | Phase 6 gate |
| `spark.clickhouse.write.dedup.mode` | `coalesced` | `none`/`coalesced`/`deterministic` |
| `spark.clickhouse.write.settings` | `""` | server-setting passthrough (async_insert etc.) |
| `spark.clickhouse.write.client.maxConnections` | `2×cores` | shared client pool size |

Read via `eval(key, entry)`; ride to executors inside `WriteJobDescription.writeOptions` (already serialized).
The coalesce internals living in `clickhouse-core` read config through a small serializable
`CoalesceOptions` carried on `WriteJobDescription` so core has no Spark-config dependency.

---

## 9. Execution strategy (agents, order, checkpoints)

Critical path is TDD by the orchestrator; the 4 Spark versions are the natural parallel fan-out.

| Stage | Work | Agents | Parallel |
|---|---|---|---|
| A | Phase 0 core: `insertArrowStream` + `NodeClientCache` + rewire ClusterClient/NodesClient/writer close | orchestrator (TDD) | serial foundation |
| B | Leaf units: `ArrowStreamAssembler`, `DedupToken` | 2 | ✅ independent, unit-tested |
| C | `BatchHandle`/`BatchPayload` → `InsertBucket` → `InsertCoordinator` + `CoalesceOptions` | orchestrator (TDD) | serial (needs B) |
| D | **Reference wiring on spark-3.5** (writer split + DSv2 + config keys) + IT suite green | orchestrator | serial — proving ground |
| **CHECKPOINT** | user reviews spark-3.5 diff + IT output before fan-out | — | — |
| E | Mirror to spark-3.3, spark-3.4, spark-4.0 (4.0 = Variant) + config per version | 3 | ✅ after D green |
| F | Phase 7 async passthrough; Phase 6 off-heap (flag off, leak tests, profiling gate) | 1–2 | mostly serial |

- Peak concurrency 3 agents (stages B, E). Orchestration via `subagent-driven-development`, not the
  heavyweight `Workflow` tool.
- Everything behind `coalesce.enabled=false`; Phase 0 mergeable on its own.
- Hard checkpoint after Stage D (user requested) before replicating wiring 3×.

## 10. Testing matrix
- **Unit (clickhouse-core):** `ArrowStreamAssembler` round-trips through `ArrowStreamReader`
  (0/1/N batches; assert no dictionary messages or handle them); `DedupToken` stable-across-retry,
  distinct-across-groups; `InsertBucket` backpressure (submit blocks at cap), flush-on-seal, linger;
  sender-thread starvation test (saturate "task threads", assert sender still flushes).
- **Concurrency:** many threads → one coordinator; insert count `== ⌈bytes/target⌉`; no lost/dup batches.
- **Integration (testcontainers, `maxParallelForks=1`, all versions):** append correctness vs JSON/Arrow
  baselines (`ClickHouseWriterTestBase`); `ReplicatedMergeTree` ack-loss → 0 dupes in
  `coalesced`/`deterministic`; distributed-convert-local sharded routing; off-heap leak test (if built).
- **Failure injection:** retryable → retried same token; non-retryable → fail-fast; executor shutdown
  mid-flight → Spark retry yields correct row count.
- Gradle: `test` (unit, excludes Slow/Cloud), `slowTest` (IT). Docker required for IT.

## 11. Risks
1. Arrow off-heap leaks → strict close-on-all-paths + leak tests; default off, profiling-gated.
2. Speculative-exec dupes under `coalesced` → document + recommend disable / `deterministic`.
3. Memory blow-up (coalesce × oversubscription) → enforce `maxBufferedBytes` backpressure.
4. Pre-sort benefit lost under coalescing → documented mode tradeoff (`deterministic` preserves it).
5. Per-version Arrow API drift (3.5 vs 4.0) → verify `VectorUnloader`/`MessageSerializer` per version;
   spark-4.0 Variant handling preserved in the split.

## 12. Build order
```
Phase 0  (client cache + insertArrowStream + double-read removal)   <- ship standalone
Phase 1  (split convert from flush)
Phase 2  (InsertCoordinator + bucket + assembler + dedup coalesced)
Phase 3  (commit/abort/lifecycle + dedup deterministic)
-- spark-3.5 IT green: CHECKPOINT --
Phase 8  (config surface, mirrored per version) + fan-out 3.3/3.4/4.0
Phase 7  (async_insert passthrough for A/B)
Phase 9/10 (test matrix + benchmark hooks)
Phase 6  (off-heap Arrow, flag off, profiling-gated, leak-tested)
```
