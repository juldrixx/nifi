/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.provenance.index.lucene;

import org.apache.nifi.provenance.ProvenanceEventRecord;
import org.apache.nifi.provenance.search.Query;
import org.apache.nifi.provenance.serialization.StorageSummary;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CachedQuery {

    void update(Map<ProvenanceEventRecord, StorageSummary> events);

    Optional<List<Long>> evaluate(Query query);

}
