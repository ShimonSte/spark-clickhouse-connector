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

import java.util.concurrent.ConcurrentLinkedQueue
import scala.collection.JavaConverters._
import scala.concurrent.Await
import scala.concurrent.duration._

class InsertCoordinatorSuite extends AnyFunSuite with BeforeAndAfterEach {

  override def afterEach(): Unit = InsertCoordinator.shutdownForTest()

  private def cfg: CoalesceConfig =
    CoalesceConfig(
      enabled = true,
      targetBytes = 1,
      maxBufferedBytes = 1 << 20,
      lingerMs = 0,
      senderThreads = 2,
      dedupMode = "none",
      maxRetry = 0,
      retryInterval = java.time.Duration.ZERO,
      retryableErrorCodes = Set.empty
    )

  private def ctx(db: String, t: String): BucketContext =
    BucketContext(null, db, t, Array.emptyByteArray, Map.empty, cfg)

  private def handle(key: ShardKey, id: String): BatchHandle =
    BatchHandle(key, id, 1L, new BytesPayload(Array[Byte](1)))

  test("submit routes handles to the bucket for their ShardKey and acks them") {
    val sent = new ConcurrentLinkedQueue[String]()
    InsertCoordinator.setSenderForTest((_, g) => g.foreach { h => sent.add(h.dedupId); h.promise.success(()) })
    val k1 = ShardKey("db", "t1", None)
    val f1 = InsertCoordinator.submit(handle(k1, "a"), ctx("db", "t1"))
    Await.result(f1, 5.seconds)
    assert(sent.asScala.toList == List("a"))
  }

  test("distinct ShardKeys use distinct buckets") {
    val byTable = new ConcurrentLinkedQueue[String]()
    InsertCoordinator.setSenderForTest((c, g) => g.foreach { h => byTable.add(c.table); h.promise.success(()) })
    val fa = InsertCoordinator.submit(handle(ShardKey("db", "t1", None), "a"), ctx("db", "t1"))
    val fb = InsertCoordinator.submit(handle(ShardKey("db", "t2", None), "b"), ctx("db", "t2"))
    Await.result(fa, 5.seconds); Await.result(fb, 5.seconds)
    assert(byTable.asScala.toSet == Set("t1", "t2"))
  }

  test("the sender never runs on the submitting thread") {
    @volatile var senderThread: Thread = null
    InsertCoordinator.setSenderForTest { (_, g) =>
      senderThread = Thread.currentThread(); g.foreach(_.promise.success(()))
    }
    val f = InsertCoordinator.submit(handle(ShardKey("db", "t", None), "a"), ctx("db", "t"))
    Await.result(f, 5.seconds)
    assert(senderThread != null && (senderThread ne Thread.currentThread()))
  }
}
