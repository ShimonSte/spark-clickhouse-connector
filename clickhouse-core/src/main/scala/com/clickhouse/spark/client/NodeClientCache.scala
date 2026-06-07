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
