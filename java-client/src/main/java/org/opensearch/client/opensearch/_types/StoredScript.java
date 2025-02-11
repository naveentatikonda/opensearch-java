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

package org.opensearch.client.opensearch._types;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Objects;

// typedef: _types.StoredScript
public final class StoredScript implements ToJsonp {
	@Nullable
	private final JsonValue lang;

	private final String source;

	// ---------------------------------------------------------------------------------------------

	protected StoredScript(Builder builder) {

		this.lang = builder.lang;
		this.source = Objects.requireNonNull(builder.source, "source");

	}

	/**
	 * API name: {@code lang}
	 */
	@Nullable
	public JsonValue lang() {
		return this.lang;
	}

	/**
	 * API name: {@code source}
	 */
	public String source() {
		return this.source;
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

		if (this.lang != null) {

			generator.writeKey("lang");
			generator.write(this.lang);

		}

		generator.writeKey("source");
		generator.write(this.source);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StoredScript}.
	 */
	public static class Builder implements ObjectBuilder<StoredScript> {
		@Nullable
		private JsonValue lang;

		private String source;

		/**
		 * API name: {@code lang}
		 */
		public Builder lang(@Nullable JsonValue value) {
			this.lang = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(String value) {
			this.source = value;
			return this;
		}

		/**
		 * Builds a {@link StoredScript}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StoredScript build() {

			return new StoredScript(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for StoredScript
	 */
	public static final JsonpDeserializer<StoredScript> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StoredScript::setupStoredScriptDeserializer);

	protected static void setupStoredScriptDeserializer(DelegatingDeserializer<StoredScript.Builder> op) {

		op.add(Builder::lang, JsonpDeserializer.jsonValueDeserializer(), "lang");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

}
