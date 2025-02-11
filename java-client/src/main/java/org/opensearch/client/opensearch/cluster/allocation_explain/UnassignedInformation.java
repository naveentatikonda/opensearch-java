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

package org.opensearch.client.opensearch.cluster.allocation_explain;

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

// typedef: cluster.allocation_explain.UnassignedInformation
public final class UnassignedInformation implements ToJsonp {
	private final String at;

	@Nullable
	private final String lastAllocationStatus;

	private final JsonValue reason;

	@Nullable
	private final String details;

	@Nullable
	private final Number failedAllocationAttempts;

	@Nullable
	private final Boolean delayed;

	@Nullable
	private final String allocationStatus;

	// ---------------------------------------------------------------------------------------------

	protected UnassignedInformation(Builder builder) {

		this.at = Objects.requireNonNull(builder.at, "at");
		this.lastAllocationStatus = builder.lastAllocationStatus;
		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.details = builder.details;
		this.failedAllocationAttempts = builder.failedAllocationAttempts;
		this.delayed = builder.delayed;
		this.allocationStatus = builder.allocationStatus;

	}

	/**
	 * API name: {@code at}
	 */
	public String at() {
		return this.at;
	}

	/**
	 * API name: {@code last_allocation_status}
	 */
	@Nullable
	public String lastAllocationStatus() {
		return this.lastAllocationStatus;
	}

	/**
	 * API name: {@code reason}
	 */
	public JsonValue reason() {
		return this.reason;
	}

	/**
	 * API name: {@code details}
	 */
	@Nullable
	public String details() {
		return this.details;
	}

	/**
	 * API name: {@code failed_allocation_attempts}
	 */
	@Nullable
	public Number failedAllocationAttempts() {
		return this.failedAllocationAttempts;
	}

	/**
	 * API name: {@code delayed}
	 */
	@Nullable
	public Boolean delayed() {
		return this.delayed;
	}

	/**
	 * API name: {@code allocation_status}
	 */
	@Nullable
	public String allocationStatus() {
		return this.allocationStatus;
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

		generator.writeKey("at");
		generator.write(this.at);

		if (this.lastAllocationStatus != null) {

			generator.writeKey("last_allocation_status");
			generator.write(this.lastAllocationStatus);

		}

		generator.writeKey("reason");
		generator.write(this.reason);

		if (this.details != null) {

			generator.writeKey("details");
			generator.write(this.details);

		}
		if (this.failedAllocationAttempts != null) {

			generator.writeKey("failed_allocation_attempts");
			generator.write(this.failedAllocationAttempts.doubleValue());

		}
		if (this.delayed != null) {

			generator.writeKey("delayed");
			generator.write(this.delayed);

		}
		if (this.allocationStatus != null) {

			generator.writeKey("allocation_status");
			generator.write(this.allocationStatus);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UnassignedInformation}.
	 */
	public static class Builder implements ObjectBuilder<UnassignedInformation> {
		private String at;

		@Nullable
		private String lastAllocationStatus;

		private JsonValue reason;

		@Nullable
		private String details;

		@Nullable
		private Number failedAllocationAttempts;

		@Nullable
		private Boolean delayed;

		@Nullable
		private String allocationStatus;

		/**
		 * API name: {@code at}
		 */
		public Builder at(String value) {
			this.at = value;
			return this;
		}

		/**
		 * API name: {@code last_allocation_status}
		 */
		public Builder lastAllocationStatus(@Nullable String value) {
			this.lastAllocationStatus = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(JsonValue value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public Builder details(@Nullable String value) {
			this.details = value;
			return this;
		}

		/**
		 * API name: {@code failed_allocation_attempts}
		 */
		public Builder failedAllocationAttempts(@Nullable Number value) {
			this.failedAllocationAttempts = value;
			return this;
		}

		/**
		 * API name: {@code delayed}
		 */
		public Builder delayed(@Nullable Boolean value) {
			this.delayed = value;
			return this;
		}

		/**
		 * API name: {@code allocation_status}
		 */
		public Builder allocationStatus(@Nullable String value) {
			this.allocationStatus = value;
			return this;
		}

		/**
		 * Builds a {@link UnassignedInformation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UnassignedInformation build() {

			return new UnassignedInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for UnassignedInformation
	 */
	public static final JsonpDeserializer<UnassignedInformation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UnassignedInformation::setupUnassignedInformationDeserializer);

	protected static void setupUnassignedInformationDeserializer(
			DelegatingDeserializer<UnassignedInformation.Builder> op) {

		op.add(Builder::at, JsonpDeserializer.stringDeserializer(), "at");
		op.add(Builder::lastAllocationStatus, JsonpDeserializer.stringDeserializer(), "last_allocation_status");
		op.add(Builder::reason, JsonpDeserializer.jsonValueDeserializer(), "reason");
		op.add(Builder::details, JsonpDeserializer.stringDeserializer(), "details");
		op.add(Builder::failedAllocationAttempts, JsonpDeserializer.numberDeserializer(), "failed_allocation_attempts");
		op.add(Builder::delayed, JsonpDeserializer.booleanDeserializer(), "delayed");
		op.add(Builder::allocationStatus, JsonpDeserializer.stringDeserializer(), "allocation_status");

	}

}
