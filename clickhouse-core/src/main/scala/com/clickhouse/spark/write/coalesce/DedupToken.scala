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
