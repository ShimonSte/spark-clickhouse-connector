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

/**
 * Heap-backed payload. `close()` is a no-op (GC reclaims the array). The backing array is wrapped
 * without a defensive copy, so it must not be mutated after construction.
 */
final class BytesPayload(bytes: Array[Byte]) extends BatchPayload {
  override def asInputStream: InputStream = new ByteArrayInputStream(bytes)
  override def sizeBytes: Long = bytes.length.toLong
  override def close(): Unit = ()
}
