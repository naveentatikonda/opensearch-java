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

package org.opensearch.client.opensearch._global.field_caps;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;
import java.util.function.Function;

// typedef: _global.field_caps.FieldCapabilitiesBodyIndexFilterTerm
public final class FieldCapabilitiesBodyIndexFilterTerm implements ToJsonp {
	private final FieldCapabilitiesBodyIndexFilterTermVersionControl versioncontrol;

	// ---------------------------------------------------------------------------------------------

	protected FieldCapabilitiesBodyIndexFilterTerm(Builder builder) {

		this.versioncontrol = Objects.requireNonNull(builder.versioncontrol, "versionControl");

	}

	/**
	 * API name: {@code versionControl}
	 */
	public FieldCapabilitiesBodyIndexFilterTermVersionControl versioncontrol() {
		return this.versioncontrol;
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

		generator.writeKey("versionControl");
		this.versioncontrol.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapabilitiesBodyIndexFilterTerm}.
	 */
	public static class Builder implements ObjectBuilder<FieldCapabilitiesBodyIndexFilterTerm> {
		private FieldCapabilitiesBodyIndexFilterTermVersionControl versioncontrol;

		/**
		 * API name: {@code versionControl}
		 */
		public Builder versioncontrol(FieldCapabilitiesBodyIndexFilterTermVersionControl value) {
			this.versioncontrol = value;
			return this;
		}

		/**
		 * API name: {@code versionControl}
		 */
		public Builder versioncontrol(
				Function<FieldCapabilitiesBodyIndexFilterTermVersionControl.Builder,
					ObjectBuilder<FieldCapabilitiesBodyIndexFilterTermVersionControl>> fn) {
			return this
					.versioncontrol(fn.apply(new FieldCapabilitiesBodyIndexFilterTermVersionControl.Builder()).build());
		}

		/**
		 * Builds a {@link FieldCapabilitiesBodyIndexFilterTerm}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCapabilitiesBodyIndexFilterTerm build() {

			return new FieldCapabilitiesBodyIndexFilterTerm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldCapabilitiesBodyIndexFilterTerm
	 */
	public static final JsonpDeserializer<FieldCapabilitiesBodyIndexFilterTerm> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					FieldCapabilitiesBodyIndexFilterTerm::setupFieldCapabilitiesBodyIndexFilterTermDeserializer);

	protected static void setupFieldCapabilitiesBodyIndexFilterTermDeserializer(
			DelegatingDeserializer<FieldCapabilitiesBodyIndexFilterTerm.Builder> op) {

		op.add(Builder::versioncontrol, FieldCapabilitiesBodyIndexFilterTermVersionControl.DESERIALIZER,
				"versionControl");

	}

}
