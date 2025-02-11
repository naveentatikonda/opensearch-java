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

package org.opensearch.client.opensearch.nodes;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: nodes._types.JvmThreads
public final class JvmThreads implements ToJsonp {
	private final Number count;

	private final Number peakCount;

	// ---------------------------------------------------------------------------------------------

	protected JvmThreads(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.peakCount = Objects.requireNonNull(builder.peakCount, "peak_count");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code peak_count}
	 */
	public Number peakCount() {
		return this.peakCount;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("peak_count");
		generator.write(this.peakCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JvmThreads}.
	 */
	public static class Builder implements ObjectBuilder<JvmThreads> {
		private Number count;

		private Number peakCount;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code peak_count}
		 */
		public Builder peakCount(Number value) {
			this.peakCount = value;
			return this;
		}

		/**
		 * Builds a {@link JvmThreads}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JvmThreads build() {

			return new JvmThreads(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for JvmThreads
	 */
	public static final JsonpDeserializer<JvmThreads> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, JvmThreads::setupJvmThreadsDeserializer);

	protected static void setupJvmThreadsDeserializer(DelegatingDeserializer<JvmThreads.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::peakCount, JsonpDeserializer.numberDeserializer(), "peak_count");

	}

}
