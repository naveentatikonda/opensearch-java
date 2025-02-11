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

package org.opensearch.client.opensearch.indices;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.opensearch._types.query_dsl.QueryContainer;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.function.Function;

// typedef: indices._types.Alias
public final class Alias implements ToJsonp {
	@Nullable
	private final QueryContainer filter;

	@Nullable
	private final JsonValue indexRouting;

	@Nullable
	private final Boolean isHidden;

	@Nullable
	private final Boolean isWriteIndex;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final JsonValue searchRouting;

	// ---------------------------------------------------------------------------------------------

	protected Alias(Builder builder) {

		this.filter = builder.filter;
		this.indexRouting = builder.indexRouting;
		this.isHidden = builder.isHidden;
		this.isWriteIndex = builder.isWriteIndex;
		this.routing = builder.routing;
		this.searchRouting = builder.searchRouting;

	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public QueryContainer filter() {
		return this.filter;
	}

	/**
	 * API name: {@code index_routing}
	 */
	@Nullable
	public JsonValue indexRouting() {
		return this.indexRouting;
	}

	/**
	 * API name: {@code is_hidden}
	 */
	@Nullable
	public Boolean isHidden() {
		return this.isHidden;
	}

	/**
	 * API name: {@code is_write_index}
	 */
	@Nullable
	public Boolean isWriteIndex() {
		return this.isWriteIndex;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code search_routing}
	 */
	@Nullable
	public JsonValue searchRouting() {
		return this.searchRouting;
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

		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.toJsonp(generator, mapper);

		}
		if (this.indexRouting != null) {

			generator.writeKey("index_routing");
			generator.write(this.indexRouting);

		}
		if (this.isHidden != null) {

			generator.writeKey("is_hidden");
			generator.write(this.isHidden);

		}
		if (this.isWriteIndex != null) {

			generator.writeKey("is_write_index");
			generator.write(this.isWriteIndex);

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.searchRouting != null) {

			generator.writeKey("search_routing");
			generator.write(this.searchRouting);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Alias}.
	 */
	public static class Builder implements ObjectBuilder<Alias> {
		@Nullable
		private QueryContainer filter;

		@Nullable
		private JsonValue indexRouting;

		@Nullable
		private Boolean isHidden;

		@Nullable
		private Boolean isWriteIndex;

		@Nullable
		private JsonValue routing;

		@Nullable
		private JsonValue searchRouting;

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable QueryContainer value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code index_routing}
		 */
		public Builder indexRouting(@Nullable JsonValue value) {
			this.indexRouting = value;
			return this;
		}

		/**
		 * API name: {@code is_hidden}
		 */
		public Builder isHidden(@Nullable Boolean value) {
			this.isHidden = value;
			return this;
		}

		/**
		 * API name: {@code is_write_index}
		 */
		public Builder isWriteIndex(@Nullable Boolean value) {
			this.isWriteIndex = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code search_routing}
		 */
		public Builder searchRouting(@Nullable JsonValue value) {
			this.searchRouting = value;
			return this;
		}

		/**
		 * Builds a {@link Alias}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Alias build() {

			return new Alias(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Alias
	 */
	public static final JsonpDeserializer<Alias> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Alias::setupAliasDeserializer);

	protected static void setupAliasDeserializer(DelegatingDeserializer<Alias.Builder> op) {

		op.add(Builder::filter, QueryContainer.DESERIALIZER, "filter");
		op.add(Builder::indexRouting, JsonpDeserializer.jsonValueDeserializer(), "index_routing");
		op.add(Builder::isHidden, JsonpDeserializer.booleanDeserializer(), "is_hidden");
		op.add(Builder::isWriteIndex, JsonpDeserializer.booleanDeserializer(), "is_write_index");
		op.add(Builder::routing, JsonpDeserializer.jsonValueDeserializer(), "routing");
		op.add(Builder::searchRouting, JsonpDeserializer.jsonValueDeserializer(), "search_routing");

	}

}
