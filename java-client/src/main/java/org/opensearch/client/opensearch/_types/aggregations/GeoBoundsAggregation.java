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

package org.opensearch.client.opensearch._types.aggregations;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoBoundsAggregation
public final class GeoBoundsAggregation extends MetricAggregationBase {
	@Nullable
	private final Boolean wrapLongitude;

	// ---------------------------------------------------------------------------------------------

	protected GeoBoundsAggregation(Builder builder) {
		super(builder);
		this.wrapLongitude = builder.wrapLongitude;

	}

	/**
	 * API name: {@code wrap_longitude}
	 */
	@Nullable
	public Boolean wrapLongitude() {
		return this.wrapLongitude;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.wrapLongitude != null) {

			generator.writeKey("wrap_longitude");
			generator.write(this.wrapLongitude);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoBoundsAggregation}.
	 */
	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoBoundsAggregation> {
		@Nullable
		private Boolean wrapLongitude;

		/**
		 * API name: {@code wrap_longitude}
		 */
		public Builder wrapLongitude(@Nullable Boolean value) {
			this.wrapLongitude = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoBoundsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoBoundsAggregation build() {

			return new GeoBoundsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GeoBoundsAggregation
	 */
	public static final JsonpDeserializer<GeoBoundsAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GeoBoundsAggregation::setupGeoBoundsAggregationDeserializer);

	protected static void setupGeoBoundsAggregationDeserializer(
			DelegatingDeserializer<GeoBoundsAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::wrapLongitude, JsonpDeserializer.booleanDeserializer(), "wrap_longitude");

	}

}
