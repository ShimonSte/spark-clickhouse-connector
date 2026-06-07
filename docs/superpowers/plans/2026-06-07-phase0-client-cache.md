# Phase 0: Executor-Scoped Client Cache + Streaming Insert — Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Share one `NodeClient` (HTTP pool/TLS) per executor instead of per Spark task, and remove the double byte-copy in `NodeClient.syncInsert`, with no change to insert behavior.

**Architecture:** Add an executor-scoped `NodeClientCache` (a global `ConcurrentHashMap[NodeSpec, NodeClient]` with a JVM shutdown hook) in `clickhouse-core`. Route every `NodeClient` creation — `NodesClient`, `ClusterClient`, and the writer's single-node branch — through the cache, and make their `close()` stop closing cached clients (the cache owns lifetime). Add a streaming `insertArrowStream` and refactor `syncInsert` to a single-read streaming core. This is Phase 0 of the coalesced-insert design (`docs/superpowers/specs/2026-06-04-coalesced-insert-design.md`); it ships standalone behind no flag because it is behavior-neutral.

**Tech Stack:** Scala 2.13, ClickHouse Java client v2 `0.9.5` (`com.clickhouse.client.api.Client`), ScalaTest (`com.github.maiflai.scalatest`), Gradle, testcontainers IT.

**Conventions:**
- Default build is `-Dspark_binary_version=4.0 -Dscala_binary_version=2.13` (from `gradle.properties`).
- Run `./gradlew spotlessApply` before each commit (project formatting gate).
- Per repo convention, commit messages have **no** Co-Authored-By / attribution trailers.

---

## File Structure

| File | Create/Modify | Responsibility |
|---|---|---|
| `clickhouse-core/src/main/scala/com/clickhouse/spark/client/NodeClientCache.scala` | Create | Executor-scoped `NodeSpec → NodeClient` cache + shutdown hook |
| `clickhouse-core/src/test/scala/com/clickhouse/spark/client/NodeClientCacheSuite.scala` | Create | Unit tests for cache semantics |
| `clickhouse-core/src/main/scala/com/clickhouse/spark/client/NodeClient.scala` | Modify | Add `insertArrowStream`; single-read streaming `syncInsert`; pool sizing on builder |
| `clickhouse-core/src/main/scala/com/clickhouse/spark/client/NodesClient.scala` | Modify | `node` pulls from `NodeClientCache`; `close()` no longer closes cached clients |
| `clickhouse-core/src/main/scala/com/clickhouse/spark/client/ClusterClient.scala` | Modify | `node` pulls from `NodeClientCache`; `close()` no longer closes cached clients |
| `spark-3.5/.../write/ClickHouseWriter.scala` (and 3.3, 3.4, 4.0) | Modify | Single-node branch uses cache; `close()` no longer closes the client |

---

## Task 1: `NodeClientCache` (executor-scoped client cache)

**Files:**
- Create: `clickhouse-core/src/main/scala/com/clickhouse/spark/client/NodeClientCache.scala`
- Test: `clickhouse-core/src/test/scala/com/clickhouse/spark/client/NodeClientCacheSuite.scala`

The cache exposes a `factory` seam (`private[client]`) so tests can inject a non-networking
`NodeClient` builder; production uses the default `new NodeClient(_)`.

- [ ] **Step 1: Write the failing test**

Create `clickhouse-core/src/test/scala/com/clickhouse/spark/client/NodeClientCacheSuite.scala`:

```scala
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clickhouse.spark.client

import com.clickhouse.spark.spec.NodeSpec
import org.scalatest.BeforeAndAfterEach
import org.scalatest.funsuite.AnyFunSuite

import java.util.concurrent.atomic.AtomicInteger

class NodeClientCacheSuite extends AnyFunSuite with BeforeAndAfterEach {

  private val specA = NodeSpec("hostA", Some(8123))
  private val specB = NodeSpec("hostB", Some(8123))

  // a NodeClient subclass whose construction performs no network/builder work
  private class FakeNodeClient(spec: NodeSpec, closed: AtomicInteger) extends NodeClient(spec) {
    override def close(): Unit = closed.incrementAndGet()
  }

  override def afterEach(): Unit = {
    NodeClientCache.closeAll()
    NodeClientCache.resetFactory()
  }

  test("get returns the same cached instance for an equal spec") {
    val built = new AtomicInteger(0)
    NodeClientCache.setFactory { spec => built.incrementAndGet(); new FakeNodeClient(spec, new AtomicInteger) }
    val c1 = NodeClientCache.get(specA)
    val c2 = NodeClientCache.get(specA)
    assert(c1 eq c2)
    assert(built.get() == 1)
  }

  test("get returns distinct instances for distinct specs") {
    NodeClientCache.setFactory(spec => new FakeNodeClient(spec, new AtomicInteger))
    assert(NodeClientCache.get(specA) ne NodeClientCache.get(specB))
  }

  test("closeAll closes every cached client and empties the cache") {
    val closes = new AtomicInteger(0)
    NodeClientCache.setFactory(spec => new FakeNodeClient(spec, closes))
    NodeClientCache.get(specA)
    NodeClientCache.get(specB)
    NodeClientCache.closeAll()
    assert(closes.get() == 2)
    // after closeAll the next get must build afresh
    val built = new AtomicInteger(0)
    NodeClientCache.setFactory { spec => built.incrementAndGet(); new FakeNodeClient(spec, new AtomicInteger) }
    NodeClientCache.get(specA)
    assert(built.get() == 1)
  }
}
```

- [ ] **Step 2: Run test to verify it fails**

Run: `./gradlew :clickhouse-core:test --tests='*NodeClientCacheSuite*'`
Expected: FAIL — compilation error, `NodeClientCache` / `setFactory` / `resetFactory` not found.

- [ ] **Step 3: Write minimal implementation**

Create `clickhouse-core/src/main/scala/com/clickhouse/spark/client/NodeClientCache.scala`:

```scala
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clickhouse.spark.client

import com.clickhouse.spark.Logging
import com.clickhouse.spark.spec.NodeSpec

import java.util.concurrent.ConcurrentHashMap
import scala.collection.JavaConverters._
import scala.util.Try

/**
 * Executor-scoped cache of [[NodeClient]] keyed by [[NodeSpec]]. One shared client (HTTP
 * connection pool / TLS context) per (executor JVM, node) instead of one per Spark task.
 *
 * The cache owns the lifetime of every client it hands out: callers (NodesClient,
 * ClusterClient, writers) must NOT close clients obtained from here. Clients are closed only
 * by [[closeAll]], which runs from the JVM shutdown hook registered below.
 *
 * NOTE: [[NodeSpec]] is a case class with value equality, so it is a safe map key. Its
 * `options: java.util.Map` participates in equals/hashCode — treat it as immutable after
 * construction.
 */
object NodeClientCache extends Logging {

  private val cache = new ConcurrentHashMap[NodeSpec, NodeClient]()

  // Seam: production builds a real NodeClient; tests can inject a non-networking factory.
  private val defaultFactory: NodeSpec => NodeClient = spec => new NodeClient(spec)
  @volatile private var factory: NodeSpec => NodeClient = defaultFactory

  Runtime.getRuntime.addShutdownHook(new Thread(() => closeAll(), "ch-client-cache-shutdown"))

  def get(spec: NodeSpec): NodeClient =
    cache.computeIfAbsent(
      spec,
      { s =>
        log.info(s"Creating shared NodeClient for $s")
        factory(s)
      }
    )

  def closeAll(): Unit = {
    cache.values().asScala.foreach(c => Try(c.close()))
    cache.clear()
  }

  // test-only seams
  private[client] def setFactory(f: NodeSpec => NodeClient): Unit = factory = f
  private[client] def resetFactory(): Unit = factory = defaultFactory
}
```

- [ ] **Step 4: Run test to verify it passes**

Run: `./gradlew :clickhouse-core:test --tests='*NodeClientCacheSuite*'`
Expected: PASS (3 tests).

> If `new NodeClient(spec)` performs network I/O at construction (it should not — the v2 client
> pool is lazy), the `FakeNodeClient` subclass still calls `super(spec)` and would too. If this
> surfaces as a hang, change `FakeNodeClient` to avoid the real superclass by making the factory
> return a `mock`/stub `AutoCloseable` and widening the cache's value type seam — but try the
> simple form first.

- [ ] **Step 5: Commit**

```bash
./gradlew spotlessApply
git add clickhouse-core/src/main/scala/com/clickhouse/spark/client/NodeClientCache.scala \
        clickhouse-core/src/test/scala/com/clickhouse/spark/client/NodeClientCacheSuite.scala
git commit -m "feat(core): add executor-scoped NodeClientCache"
```

---

## Task 2: Streaming `insertArrowStream` + single-read `syncInsert` + pool sizing

**Files:**
- Modify: `clickhouse-core/src/main/scala/com/clickhouse/spark/client/NodeClient.scala`

This removes the double byte-copy (lines 164–181) and adds a streaming Arrow insert the
coordinator will use in later phases. Behavior of the existing JSON path is unchanged; it is
covered by the existing Arrow/JSON IT suites (no live-server unit test exists for inserts).

- [ ] **Step 1: Add pool sizing to the client builder.**

In `NodeClient.scala`, replace the builder block (lines 97–104):

```scala
  private val client = new Client.Builder()
    .setUsername(nodeSpec.username)
    .setPassword(nodeSpec.password)
    .setDefaultDatabase(nodeSpec.database)
    .setOptions(nodeSpec.options)
    .setClientName(userAgent)
    .addEndpoint(createClickHouseURL(nodeSpec))
    .build()
```

with:

```scala
  // Pool sizing: one shared client per executor serves many concurrent tasks, so size the
  // pool to the executor's parallelism. Overridable via the `client_max_connections` node
  // option; Phase 8 wires spark.clickhouse.write.client.maxConnections into this.
  private val maxConnections: Int =
    Option(nodeSpec.options.get("client_max_connections")).map(_.toInt)
      .getOrElse(Runtime.getRuntime.availableProcessors() * 2)

  private val client = new Client.Builder()
    .setUsername(nodeSpec.username)
    .setPassword(nodeSpec.password)
    .setDefaultDatabase(nodeSpec.database)
    .setOptions(nodeSpec.options)
    .setClientName(userAgent)
    .addEndpoint(createClickHouseURL(nodeSpec))
    .setMaxConnections(maxConnections)
    .setConnectTimeout(timeout.toLong, ChronoUnit.MILLIS)
    .setConnectionRequestTimeout(timeout.toLong, ChronoUnit.MILLIS)
    .build()
```

(`ChronoUnit` is already imported at line 40; `timeout` is the existing `Int` field at line 50.)

- [ ] **Step 2: Refactor `syncInsert` to a single read and add `insertArrowStream`.**

Replace the body of `syncInsert` (lines 155–187) so it streams `data` directly (no
`IOUtils.toByteArray`, no throwaway empty stream), and add `insertArrowStream` above it. New code:

```scala
  def insertArrowStream(
    table: String,
    payload: InputStream,
    database: String,
    settings: Map[String, String] = Map.empty
  ): Either[CHException, Unit] = {
    val queryId = nextQueryId()
    onExecuteQuery(queryId, s"INSERT INTO `$database`.`$table` FORMAT ArrowStream")
    rawInsert(table, database, payload, ClickHouseFormat.ArrowStream, settings).map(_ => ())
  }

  def syncInsert[OUT](
    database: String,
    table: String,
    inputFormat: String,
    data: InputStream,
    outputFormat: String,
    deserializer: InputStream => SimpleOutput[OUT],
    settings: Map[String, String]
  ): Either[CHException, SimpleOutput[OUT]] = {
    val queryId = nextQueryId()
    val sql = s"INSERT INTO `$database`.`$table` FORMAT $inputFormat"
    onExecuteQuery(queryId, sql)
    rawInsert(table, database, data, ClickHouseFormat.valueOf(inputFormat), settings)
      .map(_ => deserializer(new ByteArrayInputStream(Array.emptyByteArray)))
  }

  private def rawInsert(
    table: String,
    database: String,
    data: InputStream,
    format: ClickHouseFormat,
    settings: Map[String, String]
  ): Either[CHException, InsertResponse] = {
    val insertSettings: InsertSettings = new InsertSettings()
    settings.foreach { case (k, v) => insertSettings.setOption(k, v) }
    insertSettings.setDatabase(database)
    // TODO: check what type of compression is supported by the client v2
    insertSettings.compressClientRequest(true)
    Try(client.insert(table, data, format, insertSettings).get()) match {
      case Success(resp: InsertResponse) => Right(resp)
      case Success(other) =>
        Left(CHClientException(s"Unexpected insert response: $other", Some(nodeSpec), None))
      case Failure(se: ServerException) =>
        Left(CHServerException(se.getCode, se.getMessage, Some(nodeSpec), Some(se)))
      case Failure(ex) => Left(CHClientException(ex.getMessage, Some(nodeSpec), Some(ex)))
    }
  }
```

The empty-byte-array deserialize preserves the existing `SimpleOutput[OUT]` return contract for
`syncInsertOutputJSONEachRow` callers (an insert returns no rows; the prior code did the same
with a throwaway empty stream). `ByteArrayInputStream` is already imported (line 39).

- [ ] **Step 3: Compile the module.**

Run: `./gradlew :clickhouse-core:compileScala`
Expected: BUILD SUCCESSFUL (no references to the removed `readAllBytes`/`payload`/`is` locals remain).

- [ ] **Step 4: Verify behavior via the existing Arrow + JSON IT suites (requires Docker).**

Run:
```bash
./gradlew :clickhouse-spark-it-3.5_2.13:test \
  -Dspark_binary_version=3.5 -Dscala_binary_version=2.13 \
  --tests='*ClickHouseArrowWriterSuite*' --tests='*ClickHouseJsonWriterSuite*'
```
Expected: PASS — both suites still write and read back identical data, proving the single-read
refactor and pool sizing are behavior-neutral.

- [ ] **Step 5: Commit**

```bash
./gradlew spotlessApply
git add clickhouse-core/src/main/scala/com/clickhouse/spark/client/NodeClient.scala
git commit -m "feat(core): stream inserts directly and size the client pool"
```

---

## Task 3: Route `NodesClient` and `ClusterClient` through the cache

**Files:**
- Modify: `clickhouse-core/src/main/scala/com/clickhouse/spark/client/NodesClient.scala`
- Modify: `clickhouse-core/src/main/scala/com/clickhouse/spark/client/ClusterClient.scala`
- Test: `clickhouse-core/src/test/scala/com/clickhouse/spark/client/NodeClientCacheSuite.scala` (extend)

- [ ] **Step 1: Write the failing test (extend the cache suite).**

Add these two tests inside `NodeClientCacheSuite` (before the closing brace):

```scala
  test("NodesClient.node returns the cache-shared instance and close() does not close it") {
    val closes = new AtomicInteger(0)
    NodeClientCache.setFactory(spec => new FakeNodeClient(spec, closes))
    val nodes = new NodesClient(specA) // NodeSpec is itself a `Nodes` of size 1
    val viaNodes = nodes.node
    assert(viaNodes eq NodeClientCache.get(specA))
    nodes.close()
    assert(closes.get() == 0) // cache owns lifetime; NodesClient.close must not close it
  }

  test("ClusterClient.node returns cache-shared instances and close() does not close them") {
    val closes = new AtomicInteger(0)
    NodeClientCache.setFactory(spec => new FakeNodeClient(spec, closes))
    val cluster = new ClusterClient(NodeClientCacheSuite.singleNodeCluster(specA))
    val viaCluster = cluster.node()
    assert(viaCluster eq NodeClientCache.get(specA))
    cluster.close()
    assert(closes.get() == 0)
  }
```

And add a companion object at the bottom of the file (outside the class) building a 1-shard,
1-replica cluster around a spec:

```scala
object NodeClientCacheSuite {
  import com.clickhouse.spark.spec.{ClusterSpec, ReplicaSpec, ShardSpec}
  def singleNodeCluster(spec: NodeSpec): ClusterSpec =
    ClusterSpec("test", Array(ShardSpec(1, 1, Array(ReplicaSpec(1, spec)))))
}
```

- [ ] **Step 2: Run test to verify it fails**

Run: `./gradlew :clickhouse-core:test --tests='*NodeClientCacheSuite*'`
Expected: FAIL — the two new tests fail because `NodesClient`/`ClusterClient` still call
`new NodeClient(...)` and their `close()` still closes clients (`closes.get() == 1`, not `0`),
and they don't use the injected factory.

- [ ] **Step 3: Rewrite `NodesClient` to use the cache.**

Replace `NodesClient.scala` lines 28–46 (class body) with:

```scala
class NodesClient(nodes: Nodes) extends AutoCloseable with Logging {
  assert(nodes.nodes.nonEmpty)

  def node: NodeClient = {
    val nodeSpec = shuffle(nodes.nodes.toSeq).head
    NodeClientCache.get(nodeSpec)
  }

  // The shared cache owns client lifetime (closed at executor shutdown). Closing a NodesClient
  // must NOT close cached clients, since other tasks on this executor still use them.
  override def close(): Unit = ()
}
```

The now-unused imports `java.util.concurrent.ConcurrentHashMap`, `scala.collection.JavaConverters._`
become unused — remove them, keeping `import scala.util.Random.shuffle`.

- [ ] **Step 4: Rewrite `ClusterClient` to use the cache.**

In `ClusterClient.scala`, change the cache field and `computeIfAbsent` so node resolution returns
`NodeClientCache.get(nodeSpec)`. Replace lines 29–62 (class body) with:

```scala
class ClusterClient(cluster: ClusterSpec) extends AutoCloseable with Logging {

  def node(shard: Option[Int] = None, replica: Option[Int] = None): NodeClient = {
    val (_shard, _replica) = (shard, replica) match {
      case (Some(s), Some(r)) => (s, r)
      case (Some(s), None) =>
        val shardSpec = cluster.shards.filter(_.num == s).head
        val replicaSpec = shuffle(shardSpec.replicas.toSeq).head
        (s, replicaSpec.num)
      case (None, None) =>
        val shardSpec = shuffle(cluster.shards.toSeq).head
        val replicaSpec = shuffle(shardSpec.replicas.toSeq).head
        (shardSpec.num, replicaSpec.num)
      case _ => throw CHClientException(
          s"Invalid shard[${shard.orNull}] replica[${replica.orNull}] of cluster ${cluster.name}"
        )
    }

    val shardSpec = cluster.shards.find(_.num == _shard).get
    val replicaSpec = shardSpec.replicas.find(_.num == _replica).get
    NodeClientCache.get(replicaSpec.node)
  }

  // The shared cache owns client lifetime; closing a ClusterClient must not close cached clients.
  override def close(): Unit = ()
}
```

Remove the now-unused imports `java.util.concurrent.ConcurrentHashMap` and
`scala.collection.JavaConverters._`; keep `import scala.util.Random._` (used by `shuffle`) and
`import com.clickhouse.spark.exception.CHClientException`.

- [ ] **Step 5: Run test to verify it passes**

Run: `./gradlew :clickhouse-core:test --tests='*NodeClientCacheSuite*'`
Expected: PASS (5 tests).

- [ ] **Step 6: Commit**

```bash
./gradlew spotlessApply
git add clickhouse-core/src/main/scala/com/clickhouse/spark/client/NodesClient.scala \
        clickhouse-core/src/main/scala/com/clickhouse/spark/client/ClusterClient.scala \
        clickhouse-core/src/test/scala/com/clickhouse/spark/client/NodeClientCacheSuite.scala
git commit -m "feat(core): route NodesClient/ClusterClient through NodeClientCache"
```

---

## Task 4: Writer single-node branch uses the cache; `close()` stops closing the client

**Files (identical edit in all four):**
- Modify: `spark-3.5/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/ClickHouseWriter.scala`
- Modify: `spark-3.4/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/ClickHouseWriter.scala`
- Modify: `spark-3.3/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/ClickHouseWriter.scala`
- Modify: `spark-4.0/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/ClickHouseWriter.scala`

These four files are byte-identical in the regions changed. Apply the same two edits to each.

- [ ] **Step 1: Import the cache.** In each file, change the client import (line 33):

```scala
import com.clickhouse.spark.client.{ClusterClient, NodeClient}
```
to:
```scala
import com.clickhouse.spark.client.{ClusterClient, NodeClient, NodeClientCache}
```

- [ ] **Step 2: Use the cache for the single-node branch.** In the `client` lazy val
(`ClickHouseWriter.scala:103–115`), change the non-distributed branch from:

```scala
      case _ =>
        val nodeSpec = writeJob.node
        log.info(s"Connect to single node: $nodeSpec")
        Right(NodeClient(nodeSpec))
    }
```
to:
```scala
      case _ =>
        val nodeSpec = writeJob.node
        log.info(s"Connect to single node: $nodeSpec")
        Right(NodeClientCache.get(nodeSpec))
    }
```

(The `Left(ClusterClient(clusterSpec))` branch needs no change — `ClusterClient` now resolves
nodes through the cache internally, per Task 3.)

- [ ] **Step 3: Stop closing the client in `close()`.** Change `close()`
(`ClickHouseWriter.scala:294–300`) from:

```scala
  override def close(): Unit = {
    IOUtils.closeQuietly(output)
    client match {
      case Left(clusterClient) => clusterClient.close()
      case Right(nodeClient) => nodeClient.close()
    }
  }
```
to:
```scala
  override def close(): Unit =
    // The shared NodeClientCache owns client lifetime (closed at executor shutdown). Only
    // per-task resources are released here; the Arrow root/allocator are closed by subclasses.
    IOUtils.closeQuietly(output)
```

- [ ] **Step 4: Compile all four Spark modules.**

Run each (the module name encodes the version):
```bash
./gradlew :clickhouse-spark-3.5_2.13:compileScala -Dspark_binary_version=3.5 -Dscala_binary_version=2.13
./gradlew :clickhouse-spark-3.4_2.13:compileScala -Dspark_binary_version=3.4 -Dscala_binary_version=2.13
./gradlew :clickhouse-spark-3.3_2.13:compileScala -Dspark_binary_version=3.3 -Dscala_binary_version=2.13
./gradlew :clickhouse-spark-4.0_2.13:compileScala -Dspark_binary_version=4.0 -Dscala_binary_version=2.13
```
Expected: BUILD SUCCESSFUL for each. (`IOUtils` import at line 22 is still used; no unused-import error.)

- [ ] **Step 5: Commit**

```bash
./gradlew spotlessApply
git add spark-3.5/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/ClickHouseWriter.scala \
        spark-3.4/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/ClickHouseWriter.scala \
        spark-3.3/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/ClickHouseWriter.scala \
        spark-4.0/clickhouse-spark/src/main/scala/com/clickhouse/spark/write/ClickHouseWriter.scala
git commit -m "feat: reuse cached NodeClient in writers; cache owns client lifetime"
```

---

## Task 5: Phase 0 verification

**Files:** none (verification only).

- [ ] **Step 1: Run clickhouse-core unit tests.**

Run: `./gradlew :clickhouse-core:test`
Expected: PASS — including `NodeClientCacheSuite` (5 tests) and all pre-existing suites
(`UtilsSuite`, `NodeSpecSuite`, etc.).

- [ ] **Step 2: Run the spark-3.5 writer IT suites end-to-end (requires Docker).**

Run:
```bash
./gradlew :clickhouse-spark-it-3.5_2.13:test \
  -Dspark_binary_version=3.5 -Dscala_binary_version=2.13 \
  --tests='*ClickHouseArrowWriterSuite*' --tests='*ClickHouseJsonWriterSuite*'
```
Expected: PASS — confirms cache reuse + streaming insert are behavior-neutral on a live server.

- [ ] **Step 3: (Optional) Confirm one shared client per node.** Inspect logs from Step 2 for the
line `Creating shared NodeClient for ...`; it should appear once per distinct `NodeSpec` for the
run, not once per task. Note the observation in the PR description.

- [ ] **Step 4: Final phase commit (if any formatting/cleanup remains).**

```bash
./gradlew spotlessApply
git add -A && git commit -m "chore: phase 0 verification" --allow-empty
```

---

## Self-Review Notes (author)

- **Spec coverage:** Implements design §5 Phase 0 (0a streaming insert + double-read removal,
  0b cache + rewire + stop-closing + pool sizing) and the §3.1–3.2 corrections. Later phases are
  out of scope for this plan by design (sequenced just-in-time).
- **Type consistency:** `NodeClientCache.get/closeAll/setFactory/resetFactory`, `insertArrowStream`,
  and `rawInsert` names are used identically across tasks. `NodesClient(nodes: Nodes)` accepts a
  `NodeSpec` (which extends `Nodes`) — matches existing constructor.
- **Known risk flagged:** the `FakeNodeClient` unit-test seam assumes `new NodeClient(spec)` does no
  eager network I/O (v2 pool is lazy); fallback noted in Task 1 Step 4.
- **Behavior neutrality:** no config flag introduced; insert path output contract preserved via the
  empty-byte deserialize. Validation rests on existing IT suites (Tasks 2, 5).
```
