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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.indices.segments;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: indices.segments.ShardSegmentRouting
public final class ShardSegmentRouting implements ToJsonp {
	private final String node;

	private final Boolean primary;

	private final String state;

	// ---------------------------------------------------------------------------------------------

	protected ShardSegmentRouting(Builder builder) {

		this.node = Objects.requireNonNull(builder.node, "node");
		this.primary = Objects.requireNonNull(builder.primary, "primary");
		this.state = Objects.requireNonNull(builder.state, "state");

	}

	/**
	 * API name: {@code node}
	 */
	public String node() {
		return this.node;
	}

	/**
	 * API name: {@code primary}
	 */
	public Boolean primary() {
		return this.primary;
	}

	/**
	 * API name: {@code state}
	 */
	public String state() {
		return this.state;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("primary");
		generator.write(this.primary);

		generator.writeKey("state");
		generator.write(this.state);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardSegmentRouting}.
	 */
	public static class Builder implements ObjectBuilder<ShardSegmentRouting> {
		private String node;

		private Boolean primary;

		private String state;

		/**
		 * API name: {@code node}
		 */
		public Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code primary}
		 */
		public Builder primary(Boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(String value) {
			this.state = value;
			return this;
		}

		/**
		 * Builds a {@link ShardSegmentRouting}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardSegmentRouting build() {

			return new ShardSegmentRouting(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardSegmentRouting
	 */
	public static final JsonpDeserializer<ShardSegmentRouting> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardSegmentRouting::setupShardSegmentRoutingDeserializer);

	protected static void setupShardSegmentRoutingDeserializer(DelegatingDeserializer<ShardSegmentRouting.Builder> op) {

		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");

	}

}
