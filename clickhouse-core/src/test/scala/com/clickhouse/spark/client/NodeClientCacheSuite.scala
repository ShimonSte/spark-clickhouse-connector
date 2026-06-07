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

import java.util.concurrent.{CountDownLatch, Executors, TimeUnit}
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

  test("concurrent get for one spec builds exactly one client") {
    val built = new AtomicInteger(0)
    NodeClientCache.setFactory { spec => built.incrementAndGet(); new FakeNodeClient(spec, new AtomicInteger) }
    val threads = 16
    val pool = Executors.newFixedThreadPool(threads)
    val start = new CountDownLatch(1)
    val done = new CountDownLatch(threads)
    val seen = java.util.Collections.synchronizedSet(new java.util.HashSet[NodeClient]())
    (1 to threads).foreach { _ =>
      pool.submit(new Runnable {
        override def run(): Unit = {
          start.await()
          seen.add(NodeClientCache.get(specA))
          done.countDown()
        }
      })
    }
    start.countDown()
    assert(done.await(10, TimeUnit.SECONDS))
    pool.shutdown()
    assert(built.get() == 1)
    assert(seen.size() == 1)
  }

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
}

object NodeClientCacheSuite {
  import com.clickhouse.spark.spec.{ClusterSpec, ReplicaSpec, ShardSpec}
  def singleNodeCluster(spec: NodeSpec): ClusterSpec =
    ClusterSpec("test", Array(ShardSpec(1, 1, Array(ReplicaSpec(1, spec)))))
}
