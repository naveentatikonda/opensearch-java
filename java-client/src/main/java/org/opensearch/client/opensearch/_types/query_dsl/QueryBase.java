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

package org.opensearch.client.opensearch._types.query_dsl;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ToJsonp;

import javax.annotation.Nullable;

// typedef: _types.query_dsl.QueryBase
public abstract class QueryBase implements ToJsonp {
	@Nullable
	private final Number boost;

	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	protected QueryBase(AbstractBuilder<?> builder) {

		this.boost = builder.boost;
		this.name = builder.name;

	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public Number boost() {
		return this.boost;
	}

	/**
	 * API name: {@code _name}
	 */
	@Nullable
	public String name() {
		return this.name;
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

		if (this.boost != null) {

			generator.writeKey("boost");
			generator.write(this.boost.doubleValue());

		}
		if (this.name != null) {

			generator.writeKey("_name");
			generator.write(this.name);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private Number boost;

		@Nullable
		private String name;

		/**
		 * API name: {@code boost}
		 */
		public BuilderT boost(@Nullable Number value) {
			this.boost = value;
			return self();
		}

		/**
		 * API name: {@code _name}
		 */
		public BuilderT name(@Nullable String value) {
			this.name = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupQueryBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::boost, JsonpDeserializer.numberDeserializer(), "boost");
		op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "_name");

	}

}
