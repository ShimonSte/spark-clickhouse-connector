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

import scala.concurrent.{Future, Promise}

/**
 * One task's record batch submitted to the coordinator. `dedupId` is stable for the life of the
 * handle, so a coordinator retry of the same group produces the same dedup token. The `promise`
 * is completed by the sender when the group's insert is acked (or fails).
 */
final case class BatchHandle(
  bucket: ShardKey,
  dedupId: String,
  rows: Long,
  payload: BatchPayload
) {
  val promise: Promise[Unit] = Promise[Unit]()
  def future: Future[Unit] = promise.future
}
