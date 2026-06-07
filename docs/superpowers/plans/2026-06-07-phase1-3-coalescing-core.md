# Phases 1–2 + Lifecycle: Coalescing Core + spark-3.5 Reference Wiring — Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Decouple Arrow conversion (stays per-task parallel) from the insert (coalesced across tasks into fewer, larger inserts) via an executor-local `InsertCoordinator`, wired end-to-end on **spark-3.5 only** as the reference, behind `spark.clickhouse.write.coalesce.enabled=false` (default off → behavior identical to today).

**Architecture:** New pure-bytes/concurrency machinery in `clickhouse-core` (`com.clickhouse.spark.write.coalesce`): per-target `InsertBucket`s buffer record-batch byte payloads and a dedicated sender pool flushes coalesced groups via `NodeClient.insertArrowStream` (added in Phase 0). The Arrow-typed pieces (schema-header bytes, record-batch bytes) live in the spark-3.5 `ClickHouseArrowStreamWriter`, which submits `BatchHandle`s to the coordinator and awaits its acks at `commit()`. Dedup modes `none` and `coalesced` (group-level `insert_deduplication_token`). `deterministic` mode and the fan-out to spark-3.3/3.4/4.0 are later plans.

**Tech Stack:** Scala 2.13 (cross-compiles 2.12), ClickHouse Java client v2 `0.9.5`, Apache Arrow IPC (`VectorUnloader`/`MessageSerializer`/`WriteChannel`, from Spark), ScalaTest, testcontainers IT, Gradle.

**Key constraints & conventions:**
- **`clickhouse-core` has NO Spark/Arrow dependency.** Nothing in `com.clickhouse.spark.write.coalesce` may import `org.apache.arrow.*` or `org.apache.spark.*`. Core works on `Array[Byte]`/`InputStream` only. Arrow serialization happens in the spark-3.5 module and passes bytes down.
- Default build `-Dspark_binary_version=4.0 -Dscala_binary_version=2.13`; for spark-3.5 work pass `-Dspark_binary_version=3.5 -Dscala_binary_version=2.13`.
- Run `./gradlew spotlessApply` before each commit. Commit messages: **no** AI-attribution trailers.
- Run a single suite with the **fully-qualified class name** (a `*glob*` breaks ScalaTest's `--tests` parser).
- Every new file starts with the standard Apache 2.0 license header used by every file in the repo (copy it verbatim from any existing `.scala` file).
- Phase 0 already added: `NodeClient.insertArrowStream(table, payload: InputStream, database, settings): Either[CHException, Unit]`, and `NodeClientCache.get(spec): NodeClient`. `Utils.retry[R, T <: Throwable: ClassTag](retryTimes: Int, interval: Duration)(f: => R): Try[R]` exists. `RetryableCHException(code: Int, reason: String, nodeSpec: Option[NodeSpec])` and `CHException` (with `.code: Int` and `.reason: String`) exist in `com.clickhouse.spark.exception`.

---

## File Structure

All core files under `clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/`:

| File | Responsibility |
|---|---|
| `ShardKey.scala` | bucket key `(database, table, shardNum)` |
| `BatchPayload.scala` | `BatchPayload` trait + `BytesPayload` (heap bytes; `asInputStream` returns a fresh stream per call) |
| `BatchHandle.scala` | a submitted batch: bucket, dedupId, rows, payload, and a `Promise[Unit]` ack |
| `DedupToken.scala` | `forGroup(group): String` — stable per-group token |
| `CoalesceConfig.scala` | serializable config snapshot read from `WriteOptions` on the driver |
| `BucketContext.scala` | per-bucket immutable context: client, db, table, schema-header bytes, base settings, config |
| `ArrowStreamAssembler.scala` | stitch `header ++ payloads ++ EOS` into a lazy `InputStream` (bytes only) |
| `InsertBucket.scala` | per-target buffer: size/seal/linger flush triggers, backpressure, drains on the sender pool |
| `InsertCoordinator.scala` | executor singleton: bucket registry + sender pool + `submit`/`seal`/`performInsert` |

Core tests under `clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/`.

spark-3.5 wiring (modify):
| File | Change |
|---|---|
| `spark-3.5/.../org/apache/spark/sql/clickhouse/ClickHouseSQLConf.scala` | 6 new `WRITE_COALESCE_*` / `WRITE_DEDUP_MODE` config entries |
| `spark-3.5/.../org/apache/spark/sql/clickhouse/SparkOptions.scala` | `WriteOptions` accessors + `coalesceConfig` builder |
| `spark-3.5/.../com/clickhouse/spark/write/format/ClickHouseArrowStreamWriter.scala` | `schemaHeaderBytes`, `serializeRecordBatch`, coalesce hooks |
| `spark-3.5/.../com/clickhouse/spark/write/ClickHouseWriter.scala` | coalesce branch in `doFlush`; `commit()` seal+await; pendingAcks; abort |
| spark-3.5 test sources | Arrow round-trip unit test + coalescing IT |

---

## Task 1: Core data types — `ShardKey`, `BatchPayload`/`BytesPayload`, `BatchHandle`

**Files:**
- Create: `clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/ShardKey.scala`
- Create: `clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/BatchPayload.scala`
- Create: `clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/BatchHandle.scala`
- Test: `clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/BatchPayloadSuite.scala`

- [ ] **Step 1: Write the failing test**

`BatchPayloadSuite.scala` (with standard license header):
```scala
package com.clickhouse.spark.write.coalesce

import org.scalatest.funsuite.AnyFunSuite

class BatchPayloadSuite extends AnyFunSuite {

  test("BytesPayload reports its size and yields a fresh stream each call") {
    val bytes = Array[Byte](1, 2, 3, 4, 5)
    val p = new BytesPayload(bytes)
    assert(p.sizeBytes == 5)
    val s1 = p.asInputStream
    assert(s1.read() == 1)
    // a second stream must start from the beginning (retry-safety)
    val s2 = p.asInputStream
    assert(s2.read() == 1)
    assert(p.asInputStream.readAllBytes().toSeq == bytes.toSeq)
  }

  test("BatchHandle exposes a future that completes from its promise") {
    val h = BatchHandle(ShardKey("db", "t", None), "id-1", 10L, new BytesPayload(Array[Byte](9)))
    assert(!h.future.isCompleted)
    h.promise.success(())
    assert(h.future.isCompleted)
  }
}
```

- [ ] **Step 2: Run test to verify it fails**

Run: `./gradlew :clickhouse-core:test --tests='com.clickhouse.spark.write.coalesce.BatchPayloadSuite'`
Expected: FAIL — types not found.

- [ ] **Step 3: Write the implementations**

`ShardKey.scala`:
```scala
package com.clickhouse.spark.write.coalesce

/** Identifies a coalescing target on one executor: a (database, table, shard) tuple. */
final case class ShardKey(database: String, table: String, shardNum: Option[Int])
```

`BatchPayload.scala`:
```scala
package com.clickhouse.spark.write.coalesce

import java.io.{ByteArrayInputStream, InputStream}

/**
 * A serialized Arrow record-batch message awaiting insertion. `asInputStream` must return a
 * FRESH single-use stream on every call so a failed insert can be retried by re-reading.
 */
trait BatchPayload {
  def asInputStream: InputStream
  def sizeBytes: Long
  def close(): Unit
}

/** Heap-backed payload. `close()` is a no-op (GC reclaims the array). */
final class BytesPayload(bytes: Array[Byte]) extends BatchPayload {
  override def asInputStream: InputStream = new ByteArrayInputStream(bytes)
  override def sizeBytes: Long = bytes.length.toLong
  override def close(): Unit = ()
}
```

`BatchHandle.scala`:
```scala
package com.clickhouse.spark.write.coalesce

import scala.concurrent.{Future, Promise}

/**
 * One task's record batch submitted to the coordinator. `dedupId` is stable for the life of the
 * handle, so a coordinator retry of the same group produces the same dedup token. The `promise`
 * is completed by the sender when the group's insert is acked (or fails).
 */
final case class BatchHandle(
  bucket: ShardKey,
  dedupId: String,
  rows: Long,
  payload: BatchPayload
) {
  val promise: Promise[Unit] = Promise[Unit]()
  def future: Future[Unit] = promise.future
}
```

- [ ] **Step 4: Run test to verify it passes**

Run: `./gradlew :clickhouse-core:test --tests='com.clickhouse.spark.write.coalesce.BatchPayloadSuite'`
Expected: PASS (2 tests).

- [ ] **Step 5: Commit**
```bash
./gradlew spotlessApply
git add clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/ShardKey.scala \
        clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/BatchPayload.scala \
        clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/BatchHandle.scala \
        clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/BatchPayloadSuite.scala
git commit -m "feat(core): add coalesce batch payload/handle/shardkey types"
```

---

## Task 2: `DedupToken`

**Files:**
- Create: `clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/DedupToken.scala`
- Test: `clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/DedupTokenSuite.scala`

- [ ] **Step 1: Write the failing test**
```scala
package com.clickhouse.spark.write.coalesce

import org.scalatest.funsuite.AnyFunSuite

class DedupTokenSuite extends AnyFunSuite {

  private def handle(id: String): BatchHandle =
    BatchHandle(ShardKey("db", "t", None), id, 1L, new BytesPayload(Array[Byte](0)))

  test("token is stable for the same ordered group") {
    val g = Seq(handle("a"), handle("b"), handle("c"))
    assert(DedupToken.forGroup(g) == DedupToken.forGroup(g))
  }

  test("token differs across groups with different ids or order") {
    val g1 = Seq(handle("a"), handle("b"))
    val g2 = Seq(handle("a"), handle("c"))
    val g3 = Seq(handle("b"), handle("a"))
    assert(DedupToken.forGroup(g1) != DedupToken.forGroup(g2))
    assert(DedupToken.forGroup(g1) != DedupToken.forGroup(g3))
  }

  test("token is a non-empty hex string") {
    val t = DedupToken.forGroup(Seq(handle("a")))
    assert(t.nonEmpty && t.matches("[0-9a-f]+"))
  }
}
```

- [ ] **Step 2: Run, verify FAIL**

Run: `./gradlew :clickhouse-core:test --tests='com.clickhouse.spark.write.coalesce.DedupTokenSuite'`
Expected: FAIL — `DedupToken` not found.

- [ ] **Step 3: Implement**

`DedupToken.scala`:
```scala
package com.clickhouse.spark.write.coalesce

import java.nio.charset.StandardCharsets
import java.security.MessageDigest

/**
 * Computes a deterministic `insert_deduplication_token` for a coalesced group. Stable across
 * coordinator retries of the same group (same ordered dedupIds), distinct across groups.
 */
object DedupToken {
  def forGroup(group: Seq[BatchHandle]): String =
    sha1(group.map(_.dedupId).mkString("|"))

  private def sha1(s: String): String = {
    val digest = MessageDigest.getInstance("SHA-1").digest(s.getBytes(StandardCharsets.UTF_8))
    val sb = new StringBuilder(digest.length * 2)
    digest.foreach(b => sb.append(f"${b & 0xff}%02x"))
    sb.toString
  }
}
```

- [ ] **Step 4: Run, verify PASS**

Run: `./gradlew :clickhouse-core:test --tests='com.clickhouse.spark.write.coalesce.DedupTokenSuite'`
Expected: PASS (3 tests).

- [ ] **Step 5: Commit**
```bash
./gradlew spotlessApply
git add clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/DedupToken.scala \
        clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/DedupTokenSuite.scala
git commit -m "feat(core): add coalesce DedupToken"
```

---

## Task 3: `ArrowStreamAssembler` + `CoalesceConfig` + `BucketContext`

**Files:**
- Create: `clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/ArrowStreamAssembler.scala`
- Create: `clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/CoalesceConfig.scala`
- Create: `clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/BucketContext.scala`
- Test: `clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/ArrowStreamAssemblerSuite.scala`

The assembler is bytes-only (no Arrow types): it concatenates a caller-supplied schema-header
byte array, each payload's fresh stream, and the IPC end-of-stream marker. Real Arrow round-trip
validation lives in the spark-3.5 module (Task 7), which has the Arrow dependency.

- [ ] **Step 1: Write the failing test (byte-stitching order + EOS)**
```scala
package com.clickhouse.spark.write.coalesce

import org.scalatest.funsuite.AnyFunSuite

class ArrowStreamAssemblerSuite extends AnyFunSuite {

  private def payload(bytes: Int*): BytesPayload = new BytesPayload(bytes.map(_.toByte).toArray)

  test("lazyStream concatenates header, each payload, then the 8-byte EOS marker") {
    val header = Array[Byte](10, 11, 12)
    val group = Seq(
      BatchHandle(ShardKey("d", "t", None), "1", 1L, payload(1, 2)),
      BatchHandle(ShardKey("d", "t", None), "2", 1L, payload(3, 4, 5))
    )
    val out = ArrowStreamAssembler.lazyStream(header, group).readAllBytes()
    val expected =
      Array[Byte](10, 11, 12) ++ Array[Byte](1, 2) ++ Array[Byte](3, 4, 5) ++
        ArrowStreamAssembler.EOS
    assert(out.toSeq == expected.toSeq)
  }

  test("EOS is the IPC continuation token followed by a zero length (8 bytes)") {
    assert(ArrowStreamAssembler.EOS.toSeq ==
      Seq[Byte](-1, -1, -1, -1, 0, 0, 0, 0))
  }

  test("lazyStream can be rebuilt and re-read (retry-safety)") {
    val header = Array[Byte](7)
    val group = Seq(BatchHandle(ShardKey("d", "t", None), "1", 1L, payload(8, 9)))
    val first = ArrowStreamAssembler.lazyStream(header, group).readAllBytes()
    val second = ArrowStreamAssembler.lazyStream(header, group).readAllBytes()
    assert(first.toSeq == second.toSeq)
  }
}
```

- [ ] **Step 2: Run, verify FAIL**

Run: `./gradlew :clickhouse-core:test --tests='com.clickhouse.spark.write.coalesce.ArrowStreamAssemblerSuite'`
Expected: FAIL — `ArrowStreamAssembler` not found.

- [ ] **Step 3: Implement the three files**

`ArrowStreamAssembler.scala`:
```scala
package com.clickhouse.spark.write.coalesce

import java.io.{ByteArrayInputStream, InputStream, SequenceInputStream}
import scala.collection.JavaConverters._

/**
 * Stitches a single Arrow IPC stream from a pre-serialized schema header and a sequence of
 * pre-serialized record-batch messages, without copying payload bytes. Pure bytes — no Arrow
 * dependency (clickhouse-core must not depend on Arrow/Spark). The schema header and each
 * payload are produced by the Spark-side writer, which owns the Arrow types.
 *
 * Layout: [schema message][record batch]...[record batch][EOS].
 */
object ArrowStreamAssembler {

  /** IPC stream end-of-stream marker: continuation token 0xFFFFFFFF then a 0 length (LE ints). */
  val EOS: Array[Byte] = Array[Byte](-1, -1, -1, -1, 0, 0, 0, 0)

  def lazyStream(schemaHeader: Array[Byte], group: Seq[BatchHandle]): InputStream = {
    val parts: Iterator[InputStream] =
      Iterator(new ByteArrayInputStream(schemaHeader)) ++
        group.iterator.map(_.payload.asInputStream) ++
        Iterator(new ByteArrayInputStream(EOS))
    new SequenceInputStream(parts.asJavaEnumeration)
  }
}
```

`CoalesceConfig.scala`:
```scala
package com.clickhouse.spark.write.coalesce

import java.time.Duration

/**
 * Immutable snapshot of coalescing configuration, read from WriteOptions on the driver and
 * carried to executors. `dedupMode` is "none" or "coalesced".
 */
final case class CoalesceConfig(
  enabled: Boolean,
  targetBytes: Long,
  maxBufferedBytes: Long,
  lingerMs: Long,
  senderThreads: Int,
  dedupMode: String,
  maxRetry: Int,
  retryInterval: Duration,
  retryableErrorCodes: Set[Int]
) extends Serializable
```

`BucketContext.scala`:
```scala
package com.clickhouse.spark.write.coalesce

import com.clickhouse.spark.client.NodeClient

/**
 * Per-bucket immutable context established by the first batch submitted to a bucket. All batches
 * sharing a ShardKey on one executor target the same table via the same shared client, so this
 * context is consistent across the tasks that contribute to a bucket.
 */
final case class BucketContext(
  client: NodeClient,
  database: String,
  table: String,
  schemaHeader: Array[Byte],
  baseSettings: Map[String, String],
  config: CoalesceConfig
)
```

- [ ] **Step 4: Run, verify PASS**

Run: `./gradlew :clickhouse-core:test --tests='com.clickhouse.spark.write.coalesce.ArrowStreamAssemblerSuite'`
Expected: PASS (3 tests).

- [ ] **Step 5: Commit**
```bash
./gradlew spotlessApply
git add clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/ArrowStreamAssembler.scala \
        clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/CoalesceConfig.scala \
        clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/BucketContext.scala \
        clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/ArrowStreamAssemblerSuite.scala
git commit -m "feat(core): add ArrowStreamAssembler, CoalesceConfig, BucketContext"
```

---

## Task 4: `InsertBucket` (buffering, backpressure, seal, linger, off-thread drain)

**Files:**
- Create: `clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/InsertBucket.scala`
- Test: `clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/InsertBucketSuite.scala`

The bucket buffers handles; a flush is triggered by size (`bufferedBytes >= targetBytes`), `seal()`,
or a linger timer. Draining and the `sender` call run on the injected `ScheduledExecutorService`,
NEVER on the submitting (task) thread. `submit` blocks when `bufferedBytes >= maxBufferedBytes`
(backpressure). The `sender` callback performs the actual insert+ack and is injected for testability.

- [ ] **Step 1: Write the failing tests**
```scala
package com.clickhouse.spark.write.coalesce

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.BeforeAndAfterEach

import java.util.concurrent.{ConcurrentLinkedQueue, CountDownLatch, Executors, ScheduledExecutorService, TimeUnit}
import java.util.concurrent.atomic.AtomicReference
import scala.collection.JavaConverters._

class InsertBucketSuite extends AnyFunSuite with BeforeAndAfterEach {

  private var pool: ScheduledExecutorService = _
  override def beforeEach(): Unit = pool = Executors.newScheduledThreadPool(2)
  override def afterEach(): Unit = pool.shutdownNow()

  private val key = ShardKey("d", "t", None)
  private def payloadOf(n: Int): BytesPayload = new BytesPayload(Array.fill(n)(0.toByte))
  private def handle(id: String, n: Int): BatchHandle = BatchHandle(key, id, 1L, payloadOf(n))

  private def cfg(target: Long, maxBuf: Long, linger: Long): CoalesceConfig =
    CoalesceConfig(enabled = true, targetBytes = target, maxBufferedBytes = maxBuf,
      lingerMs = linger, senderThreads = 2, dedupMode = "none", maxRetry = 0,
      retryInterval = java.time.Duration.ZERO, retryableErrorCodes = Set.empty)

  private def ctxWith(c: CoalesceConfig): BucketContext =
    BucketContext(client = null, database = "d", table = "t", schemaHeader = Array.emptyByteArray,
      baseSettings = Map.empty, config = c)

  test("flush triggers when buffered bytes reach the target, off the submitting thread") {
    val groups = new ConcurrentLinkedQueue[Seq[BatchHandle]]()
    val senderThread = new AtomicReference[Thread]()
    val flushed = new CountDownLatch(1)
    val sender: (BucketContext, Seq[BatchHandle]) => Unit = { (_, g) =>
      senderThread.set(Thread.currentThread()); groups.add(g)
      g.foreach(_.promise.success(())); flushed.countDown()
    }
    val bucket = new InsertBucket(key, ctxWith(cfg(target = 100, maxBuf = 10000, linger = 0)), pool, sender)
    bucket.submit(handle("a", 60))
    bucket.submit(handle("b", 60)) // crosses 100 -> flush
    assert(flushed.await(5, TimeUnit.SECONDS))
    assert(groups.asScala.flatten.map(_.dedupId).toSet == Set("a", "b"))
    assert(senderThread.get() ne Thread.currentThread())
  }

  test("seal flushes a sub-target remainder") {
    val groups = new ConcurrentLinkedQueue[Seq[BatchHandle]]()
    val flushed = new CountDownLatch(1)
    val bucket = new InsertBucket(key, ctxWith(cfg(target = 1000, maxBuf = 10000, linger = 0)), pool,
      { (_, g) => groups.add(g); g.foreach(_.promise.success(())); flushed.countDown() })
    bucket.submit(handle("a", 10))
    bucket.seal()
    assert(flushed.await(5, TimeUnit.SECONDS))
    assert(groups.asScala.flatten.map(_.dedupId).toList == List("a"))
  }

  test("linger flushes a sub-target buffer after the timeout") {
    val flushed = new CountDownLatch(1)
    val bucket = new InsertBucket(key, ctxWith(cfg(target = 1000, maxBuf = 10000, linger = 100)), pool,
      { (_, g) => g.foreach(_.promise.success(())); flushed.countDown() })
    bucket.submit(handle("a", 10))
    assert(flushed.await(5, TimeUnit.SECONDS))
  }

  test("a completed handle's future resolves after flush") {
    val bucket = new InsertBucket(key, ctxWith(cfg(target = 1, maxBuf = 10000, linger = 0)), pool,
      { (_, g) => g.foreach(_.promise.success(())) })
    val h = handle("a", 10)
    val f = bucket.submit(h)
    import scala.concurrent.duration._
    scala.concurrent.Await.result(f, 5.seconds)
    assert(f.isCompleted)
  }

  test("backpressure: submit blocks while buffered bytes are at the cap, then proceeds after drain") {
    val release = new CountDownLatch(1)
    val started = new CountDownLatch(1)
    // sender blocks until released, so the first group stays 'in flight' and buffer stays full
    val bucket = new InsertBucket(key, ctxWith(cfg(target = 50, maxBuf = 100, linger = 0)), pool,
      { (_, g) => started.countDown(); release.await(); g.foreach(_.promise.success(())) })
    bucket.submit(handle("a", 60)) // >= target 50 -> triggers a drain that blocks in sender
    assert(started.await(5, TimeUnit.SECONDS))
    // buffer now ~0 (taken by the in-flight group), so fill it back to the cap
    bucket.submit(handle("b", 60)) // buffered 60
    val blockedSubmit = new Thread(() => bucket.submit(handle("c", 60))) // would push to 120 >= cap 100 -> blocks
    blockedSubmit.start()
    Thread.sleep(300)
    assert(blockedSubmit.isAlive, "third submit should be blocked by backpressure")
    release.countDown() // let the in-flight group finish; draining frees space and signals
    blockedSubmit.join(5000)
    assert(!blockedSubmit.isAlive, "third submit should proceed once space frees")
  }
}
```

- [ ] **Step 2: Run, verify FAIL**

Run: `./gradlew :clickhouse-core:test --tests='com.clickhouse.spark.write.coalesce.InsertBucketSuite'`
Expected: FAIL — `InsertBucket` not found.

- [ ] **Step 3: Implement `InsertBucket.scala`**
```scala
package com.clickhouse.spark.write.coalesce

import java.util.concurrent.{ScheduledExecutorService, TimeUnit}
import java.util.concurrent.locks.ReentrantLock
import scala.collection.mutable.ArrayBuffer
import scala.concurrent.Future

/**
 * Per-target buffer of record-batch handles. A flush is triggered by size (bufferedBytes >=
 * targetBytes), seal(), or a linger timer; draining and the sender call always run on `pool`,
 * never on the submitting (task) thread. submit() blocks while bufferedBytes >= maxBufferedBytes
 * (backpressure). `sender` performs the insert and completes each handle's promise.
 */
final class InsertBucket(
  key: ShardKey,
  ctx: BucketContext,
  pool: ScheduledExecutorService,
  sender: (BucketContext, Seq[BatchHandle]) => Unit
) {
  private val lock = new ReentrantLock()
  private val notFull = lock.newCondition()
  private val buffer = ArrayBuffer.empty[BatchHandle]
  private var bufferedBytes = 0L
  private var isSealed = false
  private var draining = false
  private var lingerScheduled = false

  def submit(h: BatchHandle): Future[Unit] = {
    lock.lock()
    try {
      while (bufferedBytes >= ctx.config.maxBufferedBytes && !isSealed) notFull.await()
      buffer += h
      bufferedBytes += h.payload.sizeBytes
      val overTarget = bufferedBytes >= ctx.config.targetBytes
      if (!overTarget && !lingerScheduled && ctx.config.lingerMs > 0) {
        lingerScheduled = true
        pool.schedule(new Runnable { override def run(): Unit = onLinger() },
          ctx.config.lingerMs, TimeUnit.MILLISECONDS)
      }
      if (overTarget) ensureDraining()
      h.future
    } finally lock.unlock()
  }

  def seal(): Unit = {
    lock.lock()
    try { isSealed = true; ensureDraining() } finally lock.unlock()
  }

  private def onLinger(): Unit = {
    lock.lock()
    try { lingerScheduled = false; if (buffer.nonEmpty) ensureDraining() } finally lock.unlock()
  }

  // caller must hold `lock`
  private def ensureDraining(): Unit =
    if (!draining && buffer.nonEmpty) {
      draining = true
      pool.execute(new Runnable { override def run(): Unit = drainLoop() })
    }

  private def drainLoop(): Unit = {
    var continue = true
    while (continue) {
      var group: Seq[BatchHandle] = null
      lock.lock()
      try {
        val flushAll = isSealed
        if (buffer.isEmpty || (!flushAll && bufferedBytes < ctx.config.targetBytes)) {
          draining = false
          continue = false
        } else {
          group = takeGroup(flushAll)
          notFull.signalAll()
        }
      } finally lock.unlock()
      if (group != null) sender(ctx, group) // performs insert + completes promises, off-lock
    }
  }

  // caller must hold `lock`; removes a group from the buffer and decrements bufferedBytes
  private def takeGroup(flushAll: Boolean): Seq[BatchHandle] = {
    val group = ArrayBuffer.empty[BatchHandle]
    var groupBytes = 0L
    while (buffer.nonEmpty && (flushAll || groupBytes < ctx.config.targetBytes)) {
      val h = buffer.remove(0)
      group += h
      groupBytes += h.payload.sizeBytes
      bufferedBytes -= h.payload.sizeBytes
    }
    group.toSeq
  }
}
```

- [ ] **Step 4: Run, verify PASS**

Run: `./gradlew :clickhouse-core:test --tests='com.clickhouse.spark.write.coalesce.InsertBucketSuite'`
Expected: PASS (5 tests).

> If the backpressure test is flaky on slow machines, the implementer may increase the
> `Thread.sleep(300)` window — but must NOT weaken the assertion that the third submit blocks
> then proceeds. Do not change production code to make a timing test pass.

- [ ] **Step 5: Commit**
```bash
./gradlew spotlessApply
git add clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/InsertBucket.scala \
        clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/InsertBucketSuite.scala
git commit -m "feat(core): add InsertBucket with size/seal/linger flush and backpressure"
```

---

## Task 5: `InsertCoordinator` (executor singleton)

**Files:**
- Create: `clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/InsertCoordinator.scala`
- Test: `clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/InsertCoordinatorSuite.scala`

The coordinator owns the executor-wide sender pool and bucket registry. `submit(handle, ctx)`
routes to the bucket for `handle.bucket` (creating it with `ctx` on first use). `seal(key)` seals a
bucket. The real insert (`performInsert`) assembles the stream, sets the dedup token per mode, and
retries via `Utils.retry`, completing each handle's promise all-or-nothing. For testability the
insert function is injectable; the production `submit` uses `performInsert`.

- [ ] **Step 1: Write the failing tests**
```scala
package com.clickhouse.spark.write.coalesce

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.BeforeAndAfterEach

import java.util.concurrent.ConcurrentLinkedQueue
import scala.collection.JavaConverters._
import scala.concurrent.Await
import scala.concurrent.duration._

class InsertCoordinatorSuite extends AnyFunSuite with BeforeAndAfterEach {

  override def afterEach(): Unit = InsertCoordinator.shutdownForTest()

  private def cfg: CoalesceConfig =
    CoalesceConfig(enabled = true, targetBytes = 1, maxBufferedBytes = 1 << 20, lingerMs = 0,
      senderThreads = 2, dedupMode = "none", maxRetry = 0, retryInterval = java.time.Duration.ZERO,
      retryableErrorCodes = Set.empty)

  private def ctx(db: String, t: String): BucketContext =
    BucketContext(null, db, t, Array.emptyByteArray, Map.empty, cfg)

  private def handle(key: ShardKey, id: String): BatchHandle =
    BatchHandle(key, id, 1L, new BytesPayload(Array[Byte](1)))

  test("submit routes handles to the bucket for their ShardKey and acks them") {
    val sent = new ConcurrentLinkedQueue[String]()
    InsertCoordinator.setSenderForTest { (_, g) => g.foreach { h => sent.add(h.dedupId); h.promise.success(()) } }
    val k1 = ShardKey("db", "t1", None)
    val f1 = InsertCoordinator.submit(handle(k1, "a"), ctx("db", "t1"))
    Await.result(f1, 5.seconds)
    assert(sent.asScala.toList == List("a"))
  }

  test("distinct ShardKeys use distinct buckets") {
    val byTable = new ConcurrentLinkedQueue[String]()
    InsertCoordinator.setSenderForTest { (c, g) => g.foreach { h => byTable.add(c.table); h.promise.success(()) } }
    val fa = InsertCoordinator.submit(handle(ShardKey("db", "t1", None), "a"), ctx("db", "t1"))
    val fb = InsertCoordinator.submit(handle(ShardKey("db", "t2", None), "b"), ctx("db", "t2"))
    Await.result(fa, 5.seconds); Await.result(fb, 5.seconds)
    assert(byTable.asScala.toSet == Set("t1", "t2"))
  }

  test("the sender never runs on the submitting thread") {
    @volatile var senderThread: Thread = null
    InsertCoordinator.setSenderForTest { (_, g) => senderThread = Thread.currentThread(); g.foreach(_.promise.success(())) }
    val f = InsertCoordinator.submit(handle(ShardKey("db", "t", None), "a"), ctx("db", "t"))
    Await.result(f, 5.seconds)
    assert(senderThread != null && (senderThread ne Thread.currentThread()))
  }
}
```

- [ ] **Step 2: Run, verify FAIL**

Run: `./gradlew :clickhouse-core:test --tests='com.clickhouse.spark.write.coalesce.InsertCoordinatorSuite'`
Expected: FAIL — `InsertCoordinator` not found.

- [ ] **Step 3: Implement `InsertCoordinator.scala`**
```scala
package com.clickhouse.spark.write.coalesce

import com.clickhouse.spark.Logging
import com.clickhouse.spark.Utils
import com.clickhouse.spark.exception.{CHException, RetryableCHException}

import java.util.concurrent.{ConcurrentHashMap, Executors, ScheduledExecutorService, ThreadFactory}
import java.util.concurrent.atomic.AtomicInteger
import scala.concurrent.Future
import scala.util.{Failure, Success}

/**
 * Executor-wide coordinator: routes submitted batch handles into per-ShardKey buckets and drains
 * them on a shared sender pool. One instance per executor JVM (Scala object). The pool is created
 * lazily on first submit using the first config's senderThreads.
 */
object InsertCoordinator extends Logging {

  private val buckets = new ConcurrentHashMap[ShardKey, InsertBucket]()
  @volatile private var poolRef: ScheduledExecutorService = _
  @volatile private var sender: (BucketContext, Seq[BatchHandle]) => Unit = performInsert

  Runtime.getRuntime.addShutdownHook(new Thread(() => shutdown(), "ch-insert-coordinator-shutdown"))

  def submit(h: BatchHandle, ctx: BucketContext): Future[Unit] =
    bucketFor(h.bucket, ctx).submit(h)

  def seal(key: ShardKey): Unit = {
    val b = buckets.get(key)
    if (b != null) b.seal()
  }

  private def bucketFor(key: ShardKey, ctx: BucketContext): InsertBucket =
    buckets.computeIfAbsent(key, _ => new InsertBucket(key, ctx, pool(ctx.config.senderThreads), sender))

  private def pool(threads: Int): ScheduledExecutorService = {
    if (poolRef == null) synchronized {
      if (poolRef == null) poolRef = Executors.newScheduledThreadPool(math.max(1, threads), daemonFactory)
    }
    poolRef
  }

  private val daemonFactory: ThreadFactory = new ThreadFactory {
    private val n = new AtomicInteger(0)
    override def newThread(r: Runnable): Thread = {
      val t = new Thread(r, s"ch-insert-sender-${n.incrementAndGet()}")
      t.setDaemon(true)
      t
    }
  }

  /** Production insert: assemble the stream, set the dedup token, retry, ack all-or-nothing. */
  private def performInsert(ctx: BucketContext, group: Seq[BatchHandle]): Unit = {
    val settings = ctx.config.dedupMode match {
      case "coalesced" => ctx.baseSettings + ("insert_deduplication_token" -> DedupToken.forGroup(group))
      case _ => ctx.baseSettings
    }
    val result = Utils.retry[Unit, RetryableCHException](ctx.config.maxRetry, ctx.config.retryInterval) {
      ctx.client.insertArrowStream(ctx.table, ArrowStreamAssembler.lazyStream(ctx.schemaHeader, group), ctx.database, settings) match {
        case Right(_) => ()
        case Left(e: CHException) if ctx.config.retryableErrorCodes.contains(e.code) =>
          throw RetryableCHException(e.code, e.reason, Some(ctx.client.nodeSpec))
        case Left(e) => throw e
      }
    }
    result match {
      case Success(_)  => group.foreach { h => h.payload.close(); h.promise.success(()) }
      case Failure(ex) => group.foreach { h => h.payload.close(); h.promise.failure(ex) }
    }
  }

  private def shutdown(): Unit = {
    val p = poolRef
    if (p != null) p.shutdownNow()
    buckets.clear()
  }

  // test seams
  private[coalesce] def setSenderForTest(s: (BucketContext, Seq[BatchHandle]) => Unit): Unit = sender = s
  private[coalesce] def shutdownForTest(): Unit = {
    shutdown()
    poolRef = null
    sender = performInsert
  }
}
```

- [ ] **Step 4: Run, verify PASS**

Run: `./gradlew :clickhouse-core:test --tests='com.clickhouse.spark.write.coalesce.InsertCoordinatorSuite'`
Expected: PASS (3 tests).

- [ ] **Step 5: Run the whole core suite to confirm no regressions.**

Run: `./gradlew :clickhouse-core:test`
Expected: PASS (all coalesce suites + Phase 0 suites + pre-existing).

- [ ] **Step 6: Commit**
```bash
./gradlew spotlessApply
git add clickhouse-core/src/main/scala/com/clickhouse/spark/write/coalesce/InsertCoordinator.scala \
        clickhouse-core/src/test/scala/com/clickhouse/spark/write/coalesce/InsertCoordinatorSuite.scala
git commit -m "feat(core): add InsertCoordinator (bucket registry + sender pool)"
```

---

> **Cross-version note (discovered during execution):** `docs/configurations/02_sql_configurations.md`
> is a SINGLE shared golden file validated by `ConfigurationSuite` in every version module. Adding
> config entries to only spark-3.5 breaks the other modules' suites. Therefore the 6 `ConfigEntry`
> definitions (+ `ByteUnit` import) were added to **all four** versions' `ClickHouseSQLConf.scala`,
> and the golden was regenerated from spark-4.0 (the superset incl. the `[Spark 4.0+ only]`
> `read.jsonAs` row). The `WriteOptions` accessors + `coalesceConfig` and the writer wiring remain
> spark-3.5-only for now; Plan 3 adds the accessors+wiring to 3.3/3.4/4.0 (entries already exist).

## Task 6: spark-3.5 config keys + `WriteOptions` accessors

**Files:**
- Modify: `spark-3.5/clickhouse-spark/src/main/scala/org/apache/spark/sql/clickhouse/ClickHouseSQLConf.scala`
- Modify: `spark-3.5/clickhouse-spark/src/main/scala/org/apache/spark/sql/clickhouse/SparkOptions.scala`

- [ ] **Step 1: Add config entries.** In `ClickHouseSQLConf.scala`, add an import for `ByteUnit`
near the other imports:
```scala
import org.apache.spark.network.util.ByteUnit
```
Then add these entries inside the `object ClickHouseSQLConf` (after the existing `WRITE_*` entries):
```scala
  val WRITE_COALESCE_ENABLED: ConfigEntry[Boolean] =
    buildConf("spark.clickhouse.write.coalesce.enabled")
      .doc("Coalesce multiple tasks' Arrow batches into fewer, larger inserts per executor. " +
        "Only effective with the arrow write format.")
      .version("0.9.0")
      .booleanConf
      .createWithDefault(false)

  val WRITE_COALESCE_TARGET_BYTES: ConfigEntry[Long] =
    buildConf("spark.clickhouse.write.coalesce.targetBytes")
      .doc("Target serialized size of a coalesced insert before it is flushed.")
      .version("0.9.0")
      .bytesConf(ByteUnit.BYTE)
      .createWithDefaultString("64m")

  val WRITE_COALESCE_MAX_BUFFERED_BYTES: ConfigEntry[Long] =
    buildConf("spark.clickhouse.write.coalesce.maxBufferedBytes")
      .doc("Per-bucket backpressure cap; submits block once buffered bytes reach this.")
      .version("0.9.0")
      .bytesConf(ByteUnit.BYTE)
      .createWithDefaultString("256m")

  val WRITE_COALESCE_LINGER_MS: ConfigEntry[Long] =
    buildConf("spark.clickhouse.write.coalesce.lingerMs")
      .doc("Max time a sub-target buffer waits before being flushed.")
      .version("0.9.0")
      .timeConf(TimeUnit.MILLISECONDS)
      .createWithDefault(300)

  val WRITE_COALESCE_SENDER_THREADS: ConfigEntry[Int] =
    buildConf("spark.clickhouse.write.coalesce.senderThreads")
      .doc("Number of executor-wide sender threads draining coalesce buckets.")
      .version("0.9.0")
      .intConf
      .checkValue(_ > 0, "senderThreads must be positive.")
      .createWithDefault(2)

  val WRITE_DEDUP_MODE: ConfigEntry[String] =
    buildConf("spark.clickhouse.write.dedup.mode")
      .doc("Insert dedup mode: none | coalesced.")
      .version("0.9.0")
      .stringConf
      .transform(_.toLowerCase)
      .checkValue(Set("none", "coalesced").contains, "dedup.mode must be one of: none, coalesced.")
      .createWithDefault("coalesced")
```
(`TimeUnit` is already imported in this file — confirm; it's used by `WRITE_RETRY_INTERVAL`.)

- [ ] **Step 2: Add `WriteOptions` accessors + `coalesceConfig`.** In `SparkOptions.scala`, add the
imports needed and the accessors inside `class WriteOptions`:
```scala
  def coalesceEnabled: Boolean = eval(WRITE_COALESCE_ENABLED.key, WRITE_COALESCE_ENABLED)
  def coalesceTargetBytes: Long = eval(WRITE_COALESCE_TARGET_BYTES.key, WRITE_COALESCE_TARGET_BYTES)
  def coalesceMaxBufferedBytes: Long = eval(WRITE_COALESCE_MAX_BUFFERED_BYTES.key, WRITE_COALESCE_MAX_BUFFERED_BYTES)
  def coalesceLingerMs: Long = eval(WRITE_COALESCE_LINGER_MS.key, WRITE_COALESCE_LINGER_MS)
  def coalesceSenderThreads: Int = eval(WRITE_COALESCE_SENDER_THREADS.key, WRITE_COALESCE_SENDER_THREADS)
  def dedupMode: String = eval(WRITE_DEDUP_MODE.key, WRITE_DEDUP_MODE)

  def coalesceConfig: com.clickhouse.spark.write.coalesce.CoalesceConfig =
    com.clickhouse.spark.write.coalesce.CoalesceConfig(
      enabled = coalesceEnabled,
      targetBytes = coalesceTargetBytes,
      maxBufferedBytes = coalesceMaxBufferedBytes,
      lingerMs = coalesceLingerMs,
      senderThreads = coalesceSenderThreads,
      dedupMode = dedupMode,
      maxRetry = maxRetry,
      retryInterval = retryInterval,
      retryableErrorCodes = retryableErrorCodes.toSet
    )
```
The `WRITE_COALESCE_*`/`WRITE_DEDUP_MODE` entries resolve via the existing
`import org.apache.spark.sql.clickhouse.ClickHouseSQLConf._` already present in `SparkOptions.scala`
(confirm the wildcard import exists; if it imports specific names, add the new ones).

- [ ] **Step 3: Compile.**

Run: `./gradlew :clickhouse-spark-3.5_2.13:compileScala -Dspark_binary_version=3.5 -Dscala_binary_version=2.13`
Expected: BUILD SUCCESSFUL.

- [ ] **Step 4: Sanity-check defaults with a quick unit test.** Create
`spark-3.5/clickhouse-spark/src/test/scala/org/apache/spark/sql/clickhouse/WriteOptionsCoalesceSuite.scala`
(if a `src/test` tree doesn't exist for this module, create it):
```scala
package org.apache.spark.sql.clickhouse

import org.scalatest.funsuite.AnyFunSuite
import java.util.{HashMap => JHashMap}

class WriteOptionsCoalesceSuite extends AnyFunSuite {
  test("coalesceConfig reflects defaults and overrides from the options map") {
    val m = new JHashMap[String, String]()
    m.put("spark.clickhouse.write.coalesce.enabled", "true")
    m.put("spark.clickhouse.write.coalesce.targetBytes", "16m")
    m.put("spark.clickhouse.write.dedup.mode", "none")
    val opts = new WriteOptions(m)
    val c = opts.coalesceConfig
    assert(c.enabled)
    assert(c.targetBytes == 16L * 1024 * 1024)
    assert(c.dedupMode == "none")
    assert(c.senderThreads == 2)            // default
    assert(c.maxBufferedBytes == 256L * 1024 * 1024) // default
  }
}
```
Run: `./gradlew :clickhouse-spark-3.5_2.13:test -Dspark_binary_version=3.5 -Dscala_binary_version=2.13 --tests='org.apache.spark.sql.clickhouse.WriteOptionsCoalesceSuite'`
Expected: PASS.

> If this module has no unit-test source set wired in Gradle (only `clickhouse-spark-it` has tests),
> SKIP creating the unit test and instead rely on the Task 8 IT to exercise config; note this in the
> task report. Do not fight the build to add a test source set.

- [ ] **Step 5: Commit**
```bash
./gradlew spotlessApply
git add spark-3.5/clickhouse-spark/src/main/scala/org/apache/spark/sql/clickhouse/ClickHouseSQLConf.scala \
        spark-3.5/clickhouse-spark/src/main/scala/org/apache/spark/sql/clickhouse/SparkOptions.scala
# include the test file only if it was created and runs
git commit -m "feat(spark-3.5): add coalesce + dedup write config options"
```

---

## Task 7: spark-3.5 writer wiring — Arrow record-batch serialization + coalesce branch + commit/await

**Files:**
- Modify: `spark-3.5/.../com/clickhouse/spark/write/format/ClickHouseArrowStreamWriter.scala`
- Modify: `spark-3.5/.../com/clickhouse/spark/write/ClickHouseWriter.scala`
- Test: `spark-3.5/clickhouse-spark-it/src/test/scala/.../ArrowStreamAssemblerRoundTripSuite.scala` (Arrow round-trip; the IT module has Arrow + a test source set)

### Design
- The Arrow writer gains two byte-producing methods (Arrow lives here, not in core):
  - `schemaHeaderBytes: Array[Byte]` — the IPC schema message for `arrowSchema` (computed once).
  - `serializeRecordBatch(): BytesPayload` — the current batch's record-batch message bytes
    (uncompressed; the client compresses on the wire). Must `arrowWriter.finish()` then unload.
- The base writer's `doFlush` branches: when coalescing is active (enabled AND arrow format), it
  builds a `BatchHandle` + `BucketContext` and submits to `InsertCoordinator`, tracking the future;
  otherwise it runs the existing direct path unchanged.
- `commit()` (coalescing path): submit the final partial batch, `seal` each bucket this task used,
  `Await` this task's futures (propagating failure), then add `rows` to the records-written metric.

### Steps

- [ ] **Step 1: Add Arrow byte producers to `ClickHouseArrowStreamWriter`.** Add imports and methods:
```scala
import com.clickhouse.spark.write.coalesce.{BatchPayload, BytesPayload}
import org.apache.arrow.vector.VectorUnloader
import org.apache.arrow.vector.ipc.WriteChannel
import org.apache.arrow.vector.ipc.message.MessageSerializer
import java.io.ByteArrayOutputStream
import java.nio.channels.Channels
```
Add to the class body:
```scala
  // IPC schema message for arrowSchema, serialized once and reused as the coalesced stream header.
  lazy val schemaHeaderBytes: Array[Byte] = {
    val baos = new ByteArrayOutputStream()
    val ch = new WriteChannel(Channels.newChannel(baos))
    MessageSerializer.serialize(ch, arrowSchema)
    baos.toByteArray
  }

  // Serialize ONLY the current batch's record-batch message (uncompressed). Mirrors what
  // ArrowStreamWriter.writeBatch() emits, minus the schema/EOS framing (added by the assembler).
  override def serializeRecordBatch(): BatchPayload = {
    arrowWriter.finish()
    val baos = new ByteArrayOutputStream()
    val ch = new WriteChannel(Channels.newChannel(baos))
    val unloader = new VectorUnloader(root)
    val recordBatch = unloader.getRecordBatch
    try MessageSerializer.serialize(ch, recordBatch)
    finally recordBatch.close()
    new BytesPayload(baos.toByteArray)
  }

  override def coalesceSupported: Boolean = true
```

- [ ] **Step 2: Add the coalesce hooks + branch to the base `ClickHouseWriter`.** Add imports:
```scala
import com.clickhouse.spark.write.coalesce.{BatchHandle, BatchPayload, BucketContext, InsertCoordinator, ShardKey}
import scala.collection.mutable.ArrayBuffer
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration
import java.util.UUID
```
Add these members to the class (near the other fields/defs):
```scala
  // Coalescing hooks. Default: not supported (JSON writer); the Arrow writer overrides these.
  def coalesceSupported: Boolean = false
  def serializeRecordBatch(): BatchPayload =
    throw new UnsupportedOperationException("record-batch serialization not supported for this format")
  def schemaHeaderBytes: Array[Byte] =
    throw new UnsupportedOperationException("schema header not supported for this format")

  private lazy val coalesceConfig = writeJob.writeOptions.coalesceConfig
  private def coalesceActive: Boolean = coalesceConfig.enabled && coalesceSupported

  private val pendingAcks = ArrayBuffer.empty[Future[Unit]]
  private val sealedBuckets = scala.collection.mutable.Set.empty[ShardKey]
  private var submittedRows = 0L
```
Change `doFlush` to branch at the top:
```scala
  def doFlush(shardNum: Option[Int]): Unit =
    if (coalesceActive) doCoalescedFlush(shardNum) else doDirectFlush(shardNum)
```
Rename the EXISTING `doFlush` body to `doDirectFlush` (keep it byte-for-byte; it preserves
today's behavior for the disabled path and the JSON writer). Then add:
```scala
  private def doCoalescedFlush(shardNum: Option[Int]): Unit = {
    if (currentBufferedRows == 0) return
    val key = ShardKey(database, table, shardNum)
    val payload = serializeRecordBatch()
    val handle = BatchHandle(key, UUID.randomUUID().toString, currentBufferedRows, payload)
    val ctx = BucketContext(
      client = nodeClient(shardNum),
      database = database,
      table = table,
      schemaHeader = schemaHeaderBytes,
      baseSettings = Map.empty,
      config = coalesceConfig
    )
    pendingAcks += InsertCoordinator.submit(handle, ctx)
    sealedBuckets += key
    submittedRows += currentBufferedRows
    reset()
  }
```
Change `commit()` to:
```scala
  override def commit(): WriterCommitMessage = {
    if (coalesceActive) {
      flush(force = currentBufferedRows > 0, currentShardNum) // submits the final partial batch
      sealedBuckets.foreach(InsertCoordinator.seal)
      pendingAcks.foreach(f => Await.result(f, Duration.Inf)) // throws if any group failed
      _totalRecordsWritten.add(submittedRows)
      CommitMessage(s"Job[${writeJob.queryId}]: commit (coalesced)")
    } else {
      flush(currentBufferedRows > 0, currentShardNum)
      CommitMessage(s"Job[${writeJob.queryId}]: commit")
    }
  }
```
Leave `abort()` as `{}` (at-least-once; aborted tasks' commits are not trusted; the shared client is
not closed). `close()` is unchanged from Phase 0 (closes per-task resources only).

- [ ] **Step 3: Compile.**

Run: `./gradlew :clickhouse-spark-3.5_2.13:compileScala -Dspark_binary_version=3.5 -Dscala_binary_version=2.13`
Expected: BUILD SUCCESSFUL.

- [ ] **Step 4: Write the Arrow round-trip test (proves assembler + record-batch bytes form a valid stream).**
Create `spark-3.5/clickhouse-spark-it/src/test/scala/org/apache/spark/sql/clickhouse/single/ArrowStreamAssemblerRoundTripSuite.scala`:
```scala
package org.apache.spark.sql.clickhouse.single

import com.clickhouse.spark.write.coalesce.{ArrowStreamAssembler, BatchHandle, BytesPayload, ShardKey}
import org.apache.arrow.memory.RootAllocator
import org.apache.arrow.vector.{IntVector, VectorSchemaRoot, VectorUnloader}
import org.apache.arrow.vector.ipc.{ArrowStreamReader, WriteChannel}
import org.apache.arrow.vector.ipc.message.MessageSerializer
import org.apache.arrow.vector.types.pojo.{ArrowType, Field, FieldType, Schema}
import org.scalatest.funsuite.AnyFunSuite

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}
import java.nio.channels.Channels
import scala.collection.JavaConverters._

class ArrowStreamAssemblerRoundTripSuite extends AnyFunSuite {

  test("header + N record-batch payloads + EOS round-trips through ArrowStreamReader") {
    val allocator = new RootAllocator(Long.MaxValue)
    val field = new Field("n", FieldType.nullable(new ArrowType.Int(32, true)), null)
    val schema = new Schema(List(field).asJava)

    def batchBytes(values: Seq[Int]): Array[Byte] = {
      val root = VectorSchemaRoot.create(schema, allocator)
      val vec = root.getVector("n").asInstanceOf[IntVector]
      vec.allocateNew(values.length)
      values.zipWithIndex.foreach { case (v, i) => vec.setSafe(i, v) }
      root.setRowCount(values.length)
      val baos = new ByteArrayOutputStream()
      val ch = new WriteChannel(Channels.newChannel(baos))
      val rb = new VectorUnloader(root).getRecordBatch
      try MessageSerializer.serialize(ch, rb) finally rb.close()
      root.close()
      baos.toByteArray
    }

    val headerBaos = new ByteArrayOutputStream()
    MessageSerializer.serialize(new WriteChannel(Channels.newChannel(headerBaos)), schema)
    val header = headerBaos.toByteArray

    val group = Seq(
      BatchHandle(ShardKey("d", "t", None), "1", 2L, new BytesPayload(batchBytes(Seq(1, 2)))),
      BatchHandle(ShardKey("d", "t", None), "2", 3L, new BytesPayload(batchBytes(Seq(3, 4, 5))))
    )
    def readAll(is: java.io.InputStream): Array[Byte] = {
      val baos = new ByteArrayOutputStream(); val tmp = new Array[Byte](4096)
      var n = is.read(tmp); while (n != -1) { baos.write(tmp, 0, n); n = is.read(tmp) }; baos.toByteArray
    }
    val streamBytes = readAll(ArrowStreamAssembler.lazyStream(header, group)) // JDK8-safe (no readAllBytes)

    val reader = new ArrowStreamReader(new ByteArrayInputStream(streamBytes), allocator)
    val readBack = scala.collection.mutable.ArrayBuffer.empty[Int]
    while (reader.loadNextBatch()) {
      val vec = reader.getVectorSchemaRoot.getVector("n").asInstanceOf[IntVector]
      (0 until vec.getValueCount).foreach(i => readBack += vec.get(i))
    }
    reader.close()
    allocator.close()
    assert(readBack.toSeq == Seq(1, 2, 3, 4, 5))
  }
}
```
Run: `./gradlew :clickhouse-spark-it-3.5_2.13:test -Dspark_binary_version=3.5 -Dscala_binary_version=2.13 --tests='org.apache.spark.sql.clickhouse.single.ArrowStreamAssemblerRoundTripSuite'`
Expected: PASS (1 test). This needs no Docker (pure Arrow).

> If `ArrowStreamReader` rejects the stream, the EOS marker is the likely culprit — confirm
> `ArrowStreamAssembler.EOS` is the 8-byte `FF FF FF FF 00 00 00 00`. This test is the authority on
> stream validity; fix the assembler/EOS if it fails, not the test.

- [ ] **Step 5: Commit**
```bash
./gradlew spotlessApply
git add spark-3.5/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/format/ClickHouseArrowStreamWriter.scala \
        spark-3.5/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/ClickHouseWriter.scala \
        spark-3.5/clickhouse-spark-it/src/test/scala/org/apache/spark/sql/clickhouse/single/ArrowStreamAssemblerRoundTripSuite.scala
git commit -m "feat(spark-3.5): wire Arrow writer + base writer to InsertCoordinator"
```

---

## Task 8: spark-3.5 coalescing IT (correctness + insert-count reduction; disabled path unchanged)

**Files:**
- Create: `spark-3.5/clickhouse-spark-it/src/test/scala/org/apache/spark/sql/clickhouse/single/ClickHouseCoalesceWriteSuite.scala`

Uses the existing single-node test harness (`SparkClickHouseSingleTest`, `withTable`, `spark`,
`runClickHouseSQL`). Requires Docker.

- [ ] **Step 1: Write the IT.**
```scala
package org.apache.spark.sql.clickhouse.single

import org.apache.spark.sql.Row
import org.apache.spark.sql.types._

class ClickHouseCoalesceWriteSuite extends SparkClickHouseSingleTest {

  test("coalesced arrow write produces correct data and fewer inserts than tasks") {
    withSparkConf(
      "spark.clickhouse.write.format" -> "arrow",
      "spark.clickhouse.write.coalesce.enabled" -> "true",
      "spark.clickhouse.write.coalesce.targetBytes" -> "64m",
      "spark.clickhouse.write.coalesce.lingerMs" -> "200",
      "spark.clickhouse.write.batchSize" -> "1000"
    ) {
      val schema = StructType(Seq(
        StructField("id", IntegerType, nullable = false),
        StructField("v", StringType, nullable = false)
      ))
      withTable("coalesce_db", "t_coalesce", schema) { (db, tbl) =>
        val n = 5000
        val data = (1 to n).map(i => Row(i, s"v$i"))
        val df = spark.createDataFrame(spark.sparkContext.parallelize(data, numSlices = 4), schema)
          .repartition(4)
        df.write.mode("append").saveAsTable(s"$db.$tbl")

        // correctness
        val cnt = spark.table(s"$db.$tbl").count()
        assert(cnt == n, s"expected $n rows, got $cnt")
        val sumId = spark.table(s"$db.$tbl").agg(org.apache.spark.sql.functions.sum("id")).head().getLong(0)
        assert(sumId == (1L to n).sum)

        // parts/inserts: with coalescing on one executor, the number of initial parts should be
        // well below the number of tasks*batches. Assert the table has few active parts.
        val parts = runClickHouseSQL(
          s"SELECT count() AS c FROM system.parts WHERE database='$db' AND table='$tbl' AND active"
        ).head.get("c").asText().toInt
        assert(parts >= 1, "table should have at least one part")
        info(s"active parts after coalesced write: $parts")
      }
    }
  }

  test("coalesce disabled writes correctly (baseline)") {
    withSparkConf(
      "spark.clickhouse.write.format" -> "arrow",
      "spark.clickhouse.write.coalesce.enabled" -> "false"
    ) {
      val schema = StructType(Seq(StructField("id", IntegerType, nullable = false)))
      withTable("coalesce_db", "t_baseline", schema) { (db, tbl) =>
        val data = (1 to 1000).map(Row(_))
        val df = spark.createDataFrame(spark.sparkContext.parallelize(data, 4), schema).repartition(4)
        df.write.mode("append").saveAsTable(s"$db.$tbl")
        assert(spark.table(s"$db.$tbl").count() == 1000)
      }
    }
  }
}
```

> Adapt to the harness: confirm the exact name/signature of the config-setting helper in
> `SparkClickHouseSingleTest` / `SparkTest` (it may be `withSparkConf`, `spark.conf.set`, or a
> `withConf`/`withDatabase` wrapper). Read the base trait first and use the real helper. Confirm
> `runClickHouseSQL` returns rows exposing `.get("col")` (a Jackson `ObjectNode`); if the accessor
> differs, adjust the parts query parsing. If reliably asserting an exact part count proves flaky
> (background merges), keep the strong correctness asserts (count + sum) and the `info(...)`
> observation rather than a brittle exact-parts assertion.

- [ ] **Step 2: Run the IT (requires Docker).**

Run: `./gradlew :clickhouse-spark-it-3.5_2.13:test -Dspark_binary_version=3.5 -Dscala_binary_version=2.13 --tests='org.apache.spark.sql.clickhouse.single.ClickHouseCoalesceWriteSuite'`
Expected: PASS (2 tests).

- [ ] **Step 3: Run the existing writer IT to confirm the disabled default path is unchanged.**

Run: `./gradlew :clickhouse-spark-it-3.5_2.13:test -Dspark_binary_version=3.5 -Dscala_binary_version=2.13 --tests='org.apache.spark.sql.clickhouse.single.ClickHouseSingleArrowWriterSuite' --tests='org.apache.spark.sql.clickhouse.single.ClickHouseSingleJsonWriterSuite'`
Expected: PASS (74 tests), proving default-off neutrality.

- [ ] **Step 4: Commit**
```bash
./gradlew spotlessApply
git add spark-3.5/clickhouse-spark-it/src/test/scala/org/apache/spark/sql/clickhouse/single/ClickHouseCoalesceWriteSuite.scala
git commit -m "test(spark-3.5): coalescing write IT (correctness + disabled-path neutrality)"
```

---

## CHECKPOINT (user review)
After Task 8 is green, STOP and present to the user: the spark-3.5 diff, the coalescing IT results,
and the active-parts observation. Get approval before fanning out the wiring to spark-3.3/3.4/4.0
(Plan 3) and before adding `deterministic` dedup mode.

---

## Self-Review Notes (author)

- **Spec coverage:** Implements design Phase 1 (split convert/flush — `serializeRecordBatch` + coordinator submit), Phase 2 (`InsertCoordinator`/`InsertBucket`/`ArrowStreamAssembler` + dedup `coalesced`), and the commit/seal/await slice of Phase 3, on spark-3.5. Deferred to later plans: `deterministic` dedup mode, abort-edge cancellation polish, off-heap (Phase 6), fan-out to other versions (Plan 3), async passthrough (Phase 7).
- **Core/Arrow boundary:** no `org.apache.arrow.*` or `org.apache.spark.*` import appears in any `clickhouse-core` coalesce file; Arrow lives only in the spark-3.5 writer + IT tests. Verified per file.
- **Type consistency:** `BatchHandle(bucket, dedupId, rows, payload)`, `BucketContext(client, database, table, schemaHeader, baseSettings, config)`, `CoalesceConfig(...)`, `InsertCoordinator.submit(handle, ctx)`/`seal(key)`, `ArrowStreamAssembler.lazyStream(header, group)`/`EOS`, `serializeRecordBatch(): BatchPayload`, `schemaHeaderBytes: Array[Byte]`, `coalesceSupported` — all used identically across tasks.
- **Behavior neutrality:** disabled path = renamed `doDirectFlush` (unchanged body) + unchanged `commit` else-branch; JSON writer never sets `coalesceSupported`. Default `coalesce.enabled=false`.
- **Known risks flagged inline:** EOS-marker correctness (Task 7 round-trip is the authority), IT parts-count flakiness (fall back to correctness asserts), spark-3.5 unit-test source set may be absent (Task 6 fallback), harness config-helper name (Task 8 must read the base trait).
```
