/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.client.util;

public class TaggedUnion<Tag extends Enum<Tag> & StringEnum, Value> {

    protected final Tag tag;
    protected final Value value;

    protected TaggedUnion(Tag tag, Value value) {
        this.tag = tag;
        this.value = value;
    }

    protected boolean is(Tag tag) {
        return tag == this.tag;
    }

    protected <V extends Value> V get(Tag tag) {
        if (tag == this.tag) {
            @SuppressWarnings("unchecked")
            V result = (V) this.value;
            return result;
        } else {
            throw new IllegalStateException("Cannot get '" + tag + "' variant. Current variant is '" + this.tag + "'");
        }
    }
}
