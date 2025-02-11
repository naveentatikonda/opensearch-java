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

// typedef: _types.aggregations.SamplerAggregation
public final class SamplerAggregation extends BucketAggregationBase {
	@Nullable
	private final Number shardSize;

	// ---------------------------------------------------------------------------------------------

	protected SamplerAggregation(Builder builder) {
		super(builder);
		this.shardSize = builder.shardSize;

	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public Number shardSize() {
		return this.shardSize;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.shardSize != null) {

			generator.writeKey("shard_size");
			generator.write(this.shardSize.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamplerAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SamplerAggregation> {
		@Nullable
		private Number shardSize;

		/**
		 * API name: {@code shard_size}
		 */
		public Builder shardSize(@Nullable Number value) {
			this.shardSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SamplerAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamplerAggregation build() {

			return new SamplerAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SamplerAggregation
	 */
	public static final JsonpDeserializer<SamplerAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SamplerAggregation::setupSamplerAggregationDeserializer);

	protected static void setupSamplerAggregationDeserializer(DelegatingDeserializer<SamplerAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::shardSize, JsonpDeserializer.numberDeserializer(), "shard_size");

	}

}
