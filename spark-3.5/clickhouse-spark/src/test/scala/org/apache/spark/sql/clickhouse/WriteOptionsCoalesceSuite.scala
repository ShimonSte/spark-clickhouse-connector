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
    assert(c.senderThreads == 2)
    assert(c.maxBufferedBytes == 256L * 1024 * 1024)
  }
}
