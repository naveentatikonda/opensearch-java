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

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Objects;

// typedef: _types.RefreshStats
public final class RefreshStats implements ToJsonp {
	private final Number externalTotal;

	private final Number externalTotalTimeInMillis;

	private final Number listeners;

	private final Number total;

	@Nullable
	private final String totalTime;

	private final Number totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	protected RefreshStats(Builder builder) {

		this.externalTotal = Objects.requireNonNull(builder.externalTotal, "external_total");
		this.externalTotalTimeInMillis = Objects.requireNonNull(builder.externalTotalTimeInMillis,
				"external_total_time_in_millis");
		this.listeners = Objects.requireNonNull(builder.listeners, "listeners");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");

	}

	/**
	 * API name: {@code external_total}
	 */
	public Number externalTotal() {
		return this.externalTotal;
	}

	/**
	 * API name: {@code external_total_time_in_millis}
	 */
	public Number externalTotalTimeInMillis() {
		return this.externalTotalTimeInMillis;
	}

	/**
	 * API name: {@code listeners}
	 */
	public Number listeners() {
		return this.listeners;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public String totalTime() {
		return this.totalTime;
	}

	/**
	 * API name: {@code total_time_in_millis}
	 */
	public Number totalTimeInMillis() {
		return this.totalTimeInMillis;
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

		generator.writeKey("external_total");
		generator.write(this.externalTotal.doubleValue());

		generator.writeKey("external_total_time_in_millis");
		generator.write(this.externalTotalTimeInMillis.doubleValue());

		generator.writeKey("listeners");
		generator.write(this.listeners.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RefreshStats}.
	 */
	public static class Builder implements ObjectBuilder<RefreshStats> {
		private Number externalTotal;

		private Number externalTotalTimeInMillis;

		private Number listeners;

		private Number total;

		@Nullable
		private String totalTime;

		private Number totalTimeInMillis;

		/**
		 * API name: {@code external_total}
		 */
		public Builder externalTotal(Number value) {
			this.externalTotal = value;
			return this;
		}

		/**
		 * API name: {@code external_total_time_in_millis}
		 */
		public Builder externalTotalTimeInMillis(Number value) {
			this.externalTotalTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code listeners}
		 */
		public Builder listeners(Number value) {
			this.listeners = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_time}
		 */
		public Builder totalTime(@Nullable String value) {
			this.totalTime = value;
			return this;
		}

		/**
		 * API name: {@code total_time_in_millis}
		 */
		public Builder totalTimeInMillis(Number value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link RefreshStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RefreshStats build() {

			return new RefreshStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RefreshStats
	 */
	public static final JsonpDeserializer<RefreshStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RefreshStats::setupRefreshStatsDeserializer);

	protected static void setupRefreshStatsDeserializer(DelegatingDeserializer<RefreshStats.Builder> op) {

		op.add(Builder::externalTotal, JsonpDeserializer.numberDeserializer(), "external_total");
		op.add(Builder::externalTotalTimeInMillis, JsonpDeserializer.numberDeserializer(),
				"external_total_time_in_millis");
		op.add(Builder::listeners, JsonpDeserializer.numberDeserializer(), "listeners");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.numberDeserializer(), "total_time_in_millis");

	}

}
