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

package org.opensearch.client.opensearch._global.scripts_painless_execute;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.opensearch._types.query_dsl.QueryContainer;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;
import java.util.function.Function;

// typedef: _global.scripts_painless_execute.PainlessContextSetup
public final class PainlessContextSetup implements ToJsonp {
	private final JsonValue document;

	private final String index;

	private final QueryContainer query;

	// ---------------------------------------------------------------------------------------------

	protected PainlessContextSetup(Builder builder) {

		this.document = Objects.requireNonNull(builder.document, "document");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.query = Objects.requireNonNull(builder.query, "query");

	}

	/**
	 * API name: {@code document}
	 */
	public JsonValue document() {
		return this.document;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code query}
	 */
	public QueryContainer query() {
		return this.query;
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

		generator.writeKey("document");
		generator.write(this.document);

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("query");
		this.query.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PainlessContextSetup}.
	 */
	public static class Builder implements ObjectBuilder<PainlessContextSetup> {
		private JsonValue document;

		private String index;

		private QueryContainer query;

		/**
		 * API name: {@code document}
		 */
		public Builder document(JsonValue value) {
			this.document = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * Builds a {@link PainlessContextSetup}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PainlessContextSetup build() {

			return new PainlessContextSetup(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PainlessContextSetup
	 */
	public static final JsonpDeserializer<PainlessContextSetup> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PainlessContextSetup::setupPainlessContextSetupDeserializer);

	protected static void setupPainlessContextSetupDeserializer(
			DelegatingDeserializer<PainlessContextSetup.Builder> op) {

		op.add(Builder::document, JsonpDeserializer.jsonValueDeserializer(), "document");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");

	}

}
