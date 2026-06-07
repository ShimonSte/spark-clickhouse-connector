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
