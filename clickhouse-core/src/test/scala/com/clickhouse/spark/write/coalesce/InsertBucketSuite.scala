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
    CoalesceConfig(
      enabled = true,
      targetBytes = target,
      maxBufferedBytes = maxBuf,
      lingerMs = linger,
      senderThreads = 2,
      dedupMode = "none",
      maxRetry = 0,
      retryInterval = java.time.Duration.ZERO,
      retryableErrorCodes = Set.empty
    )

  private def ctxWith(c: CoalesceConfig): BucketContext =
    BucketContext(
      client = null,
      database = "d",
      table = "t",
      schemaHeader = Array.emptyByteArray,
      baseSettings = Map.empty,
      config = c
    )

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
    bucket.submit(handle("b", 60))
    assert(flushed.await(5, TimeUnit.SECONDS))
    assert(groups.asScala.flatten.map(_.dedupId).toSet == Set("a", "b"))
    assert(senderThread.get() ne Thread.currentThread())
  }

  test("seal flushes a sub-target remainder") {
    val groups = new ConcurrentLinkedQueue[Seq[BatchHandle]]()
    val flushed = new CountDownLatch(1)
    val bucket = new InsertBucket(
      key,
      ctxWith(cfg(target = 1000, maxBuf = 10000, linger = 0)),
      pool,
      { (_, g) => groups.add(g); g.foreach(_.promise.success(())); flushed.countDown() }
    )
    bucket.submit(handle("a", 10))
    bucket.seal()
    assert(flushed.await(5, TimeUnit.SECONDS))
    assert(groups.asScala.flatten.map(_.dedupId).toList == List("a"))
  }

  test("linger flushes a sub-target buffer after the timeout") {
    val flushed = new CountDownLatch(1)
    val bucket = new InsertBucket(
      key,
      ctxWith(cfg(target = 1000, maxBuf = 10000, linger = 100)),
      pool,
      { (_, g) => g.foreach(_.promise.success(())); flushed.countDown() }
    )
    bucket.submit(handle("a", 10))
    assert(flushed.await(5, TimeUnit.SECONDS))
  }

  test("a completed handle's future resolves after flush") {
    val bucket = new InsertBucket(
      key,
      ctxWith(cfg(target = 1, maxBuf = 10000, linger = 0)),
      pool,
      { (_, g) => g.foreach(_.promise.success(())) }
    )
    val h = handle("a", 10)
    val f = bucket.submit(h)
    import scala.concurrent.duration._
    scala.concurrent.Await.result(f, 5.seconds)
    assert(f.isCompleted)
  }

  test("backpressure: submit blocks while buffered bytes are at the cap, then proceeds after drain") {
    val release = new CountDownLatch(1)
    val started = new CountDownLatch(1)
    val bucket = new InsertBucket(
      key,
      ctxWith(cfg(target = 50, maxBuf = 100, linger = 0)),
      pool,
      { (_, g) => started.countDown(); release.await(); g.foreach(_.promise.success(())) }
    )
    bucket.submit(handle("a", 60))
    assert(started.await(5, TimeUnit.SECONDS))
    bucket.submit(handle("b", 60))
    val blockedSubmit = new Thread(() => bucket.submit(handle("c", 60)))
    blockedSubmit.start()
    Thread.sleep(300)
    assert(blockedSubmit.isAlive, "third submit should be blocked by backpressure")
    release.countDown()
    blockedSubmit.join(5000)
    assert(!blockedSubmit.isAlive, "third submit should proceed once space frees")
  }
}
