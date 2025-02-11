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

package org.opensearch.client.opensearch.indices.stats;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: indices.stats.ShardPath
public final class ShardPath implements ToJsonp {
	private final String dataPath;

	private final Boolean isCustomDataPath;

	private final String statePath;

	// ---------------------------------------------------------------------------------------------

	protected ShardPath(Builder builder) {

		this.dataPath = Objects.requireNonNull(builder.dataPath, "data_path");
		this.isCustomDataPath = Objects.requireNonNull(builder.isCustomDataPath, "is_custom_data_path");
		this.statePath = Objects.requireNonNull(builder.statePath, "state_path");

	}

	/**
	 * API name: {@code data_path}
	 */
	public String dataPath() {
		return this.dataPath;
	}

	/**
	 * API name: {@code is_custom_data_path}
	 */
	public Boolean isCustomDataPath() {
		return this.isCustomDataPath;
	}

	/**
	 * API name: {@code state_path}
	 */
	public String statePath() {
		return this.statePath;
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

		generator.writeKey("data_path");
		generator.write(this.dataPath);

		generator.writeKey("is_custom_data_path");
		generator.write(this.isCustomDataPath);

		generator.writeKey("state_path");
		generator.write(this.statePath);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardPath}.
	 */
	public static class Builder implements ObjectBuilder<ShardPath> {
		private String dataPath;

		private Boolean isCustomDataPath;

		private String statePath;

		/**
		 * API name: {@code data_path}
		 */
		public Builder dataPath(String value) {
			this.dataPath = value;
			return this;
		}

		/**
		 * API name: {@code is_custom_data_path}
		 */
		public Builder isCustomDataPath(Boolean value) {
			this.isCustomDataPath = value;
			return this;
		}

		/**
		 * API name: {@code state_path}
		 */
		public Builder statePath(String value) {
			this.statePath = value;
			return this;
		}

		/**
		 * Builds a {@link ShardPath}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardPath build() {

			return new ShardPath(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardPath
	 */
	public static final JsonpDeserializer<ShardPath> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardPath::setupShardPathDeserializer);

	protected static void setupShardPathDeserializer(DelegatingDeserializer<ShardPath.Builder> op) {

		op.add(Builder::dataPath, JsonpDeserializer.stringDeserializer(), "data_path");
		op.add(Builder::isCustomDataPath, JsonpDeserializer.booleanDeserializer(), "is_custom_data_path");
		op.add(Builder::statePath, JsonpDeserializer.stringDeserializer(), "state_path");

	}

}
