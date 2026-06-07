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
      ctx.client.insertArrowStream(
        ctx.table,
        ArrowStreamAssembler.lazyStream(ctx.schemaHeader, group),
        ctx.database,
        settings
      ) match {
        case Right(_) => ()
        case Left(e: CHException) if ctx.config.retryableErrorCodes.contains(e.code) =>
          throw RetryableCHException(e.code, e.reason, Some(ctx.client.nodeSpec))
        case Left(e) => throw e
      }
    }
    result match {
      case Success(_) => group.foreach { h => h.payload.close(); h.promise.success(()) }
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
