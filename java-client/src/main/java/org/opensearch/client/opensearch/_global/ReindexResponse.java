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

package org.opensearch.client.opensearch._global;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.opensearch._types.BulkIndexByScrollFailure;
import org.opensearch.client.opensearch._types.Retries;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: _global.reindex.Response
public final class ReindexResponse implements ToJsonp {
	@Nullable
	private final Number batches;

	@Nullable
	private final Number created;

	@Nullable
	private final Number deleted;

	@Nullable
	private final List<BulkIndexByScrollFailure> failures;

	@Nullable
	private final Number noops;

	@Nullable
	private final Retries retries;

	@Nullable
	private final Number requestsPerSecond;

	@Nullable
	private final Number sliceId;

	@Nullable
	private final JsonValue task;

	@Nullable
	private final JsonValue throttledMillis;

	@Nullable
	private final JsonValue throttledUntilMillis;

	@Nullable
	private final Boolean timedOut;

	@Nullable
	private final JsonValue took;

	@Nullable
	private final Number total;

	@Nullable
	private final Number updated;

	@Nullable
	private final Number versionConflicts;

	// ---------------------------------------------------------------------------------------------

	protected ReindexResponse(Builder builder) {

		this.batches = builder.batches;
		this.created = builder.created;
		this.deleted = builder.deleted;
		this.failures = builder.failures;
		this.noops = builder.noops;
		this.retries = builder.retries;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.sliceId = builder.sliceId;
		this.task = builder.task;
		this.throttledMillis = builder.throttledMillis;
		this.throttledUntilMillis = builder.throttledUntilMillis;
		this.timedOut = builder.timedOut;
		this.took = builder.took;
		this.total = builder.total;
		this.updated = builder.updated;
		this.versionConflicts = builder.versionConflicts;

	}

	/**
	 * API name: {@code batches}
	 */
	@Nullable
	public Number batches() {
		return this.batches;
	}

	/**
	 * API name: {@code created}
	 */
	@Nullable
	public Number created() {
		return this.created;
	}

	/**
	 * API name: {@code deleted}
	 */
	@Nullable
	public Number deleted() {
		return this.deleted;
	}

	/**
	 * API name: {@code failures}
	 */
	@Nullable
	public List<BulkIndexByScrollFailure> failures() {
		return this.failures;
	}

	/**
	 * API name: {@code noops}
	 */
	@Nullable
	public Number noops() {
		return this.noops;
	}

	/**
	 * API name: {@code retries}
	 */
	@Nullable
	public Retries retries() {
		return this.retries;
	}

	/**
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public Number requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * API name: {@code slice_id}
	 */
	@Nullable
	public Number sliceId() {
		return this.sliceId;
	}

	/**
	 * API name: {@code task}
	 */
	@Nullable
	public JsonValue task() {
		return this.task;
	}

	/**
	 * API name: {@code throttled_millis}
	 */
	@Nullable
	public JsonValue throttledMillis() {
		return this.throttledMillis;
	}

	/**
	 * API name: {@code throttled_until_millis}
	 */
	@Nullable
	public JsonValue throttledUntilMillis() {
		return this.throttledUntilMillis;
	}

	/**
	 * API name: {@code timed_out}
	 */
	@Nullable
	public Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code took}
	 */
	@Nullable
	public JsonValue took() {
		return this.took;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code updated}
	 */
	@Nullable
	public Number updated() {
		return this.updated;
	}

	/**
	 * API name: {@code version_conflicts}
	 */
	@Nullable
	public Number versionConflicts() {
		return this.versionConflicts;
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

		if (this.batches != null) {

			generator.writeKey("batches");
			generator.write(this.batches.doubleValue());

		}
		if (this.created != null) {

			generator.writeKey("created");
			generator.write(this.created.doubleValue());

		}
		if (this.deleted != null) {

			generator.writeKey("deleted");
			generator.write(this.deleted.doubleValue());

		}
		if (this.failures != null) {

			generator.writeKey("failures");
			generator.writeStartArray();
			for (BulkIndexByScrollFailure item0 : this.failures) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.noops != null) {

			generator.writeKey("noops");
			generator.write(this.noops.doubleValue());

		}
		if (this.retries != null) {

			generator.writeKey("retries");
			this.retries.toJsonp(generator, mapper);

		}
		if (this.requestsPerSecond != null) {

			generator.writeKey("requests_per_second");
			generator.write(this.requestsPerSecond.doubleValue());

		}
		if (this.sliceId != null) {

			generator.writeKey("slice_id");
			generator.write(this.sliceId.doubleValue());

		}
		if (this.task != null) {

			generator.writeKey("task");
			generator.write(this.task);

		}
		if (this.throttledMillis != null) {

			generator.writeKey("throttled_millis");
			generator.write(this.throttledMillis);

		}
		if (this.throttledUntilMillis != null) {

			generator.writeKey("throttled_until_millis");
			generator.write(this.throttledUntilMillis);

		}
		if (this.timedOut != null) {

			generator.writeKey("timed_out");
			generator.write(this.timedOut);

		}
		if (this.took != null) {

			generator.writeKey("took");
			generator.write(this.took);

		}
		if (this.total != null) {

			generator.writeKey("total");
			generator.write(this.total.doubleValue());

		}
		if (this.updated != null) {

			generator.writeKey("updated");
			generator.write(this.updated.doubleValue());

		}
		if (this.versionConflicts != null) {

			generator.writeKey("version_conflicts");
			generator.write(this.versionConflicts.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexResponse}.
	 */
	public static class Builder implements ObjectBuilder<ReindexResponse> {
		@Nullable
		private Number batches;

		@Nullable
		private Number created;

		@Nullable
		private Number deleted;

		@Nullable
		private List<BulkIndexByScrollFailure> failures;

		@Nullable
		private Number noops;

		@Nullable
		private Retries retries;

		@Nullable
		private Number requestsPerSecond;

		@Nullable
		private Number sliceId;

		@Nullable
		private JsonValue task;

		@Nullable
		private JsonValue throttledMillis;

		@Nullable
		private JsonValue throttledUntilMillis;

		@Nullable
		private Boolean timedOut;

		@Nullable
		private JsonValue took;

		@Nullable
		private Number total;

		@Nullable
		private Number updated;

		@Nullable
		private Number versionConflicts;

		/**
		 * API name: {@code batches}
		 */
		public Builder batches(@Nullable Number value) {
			this.batches = value;
			return this;
		}

		/**
		 * API name: {@code created}
		 */
		public Builder created(@Nullable Number value) {
			this.created = value;
			return this;
		}

		/**
		 * API name: {@code deleted}
		 */
		public Builder deleted(@Nullable Number value) {
			this.deleted = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(@Nullable List<BulkIndexByScrollFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(BulkIndexByScrollFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(BulkIndexByScrollFailure value) {
			if (this.failures == null) {
				this.failures = new ArrayList<>();
			}
			this.failures.add(value);
			return this;
		}

		/**
		 * Set {@link #failures(List)} to a singleton list.
		 */
		public Builder failures(
				Function<BulkIndexByScrollFailure.Builder, ObjectBuilder<BulkIndexByScrollFailure>> fn) {
			return this.failures(fn.apply(new BulkIndexByScrollFailure.Builder()).build());
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(
				Function<BulkIndexByScrollFailure.Builder, ObjectBuilder<BulkIndexByScrollFailure>> fn) {
			return this.addFailures(fn.apply(new BulkIndexByScrollFailure.Builder()).build());
		}

		/**
		 * API name: {@code noops}
		 */
		public Builder noops(@Nullable Number value) {
			this.noops = value;
			return this;
		}

		/**
		 * API name: {@code retries}
		 */
		public Builder retries(@Nullable Retries value) {
			this.retries = value;
			return this;
		}

		/**
		 * API name: {@code retries}
		 */
		public Builder retries(Function<Retries.Builder, ObjectBuilder<Retries>> fn) {
			return this.retries(fn.apply(new Retries.Builder()).build());
		}

		/**
		 * API name: {@code requests_per_second}
		 */
		public Builder requestsPerSecond(@Nullable Number value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * API name: {@code slice_id}
		 */
		public Builder sliceId(@Nullable Number value) {
			this.sliceId = value;
			return this;
		}

		/**
		 * API name: {@code task}
		 */
		public Builder task(@Nullable JsonValue value) {
			this.task = value;
			return this;
		}

		/**
		 * API name: {@code throttled_millis}
		 */
		public Builder throttledMillis(@Nullable JsonValue value) {
			this.throttledMillis = value;
			return this;
		}

		/**
		 * API name: {@code throttled_until_millis}
		 */
		public Builder throttledUntilMillis(@Nullable JsonValue value) {
			this.throttledUntilMillis = value;
			return this;
		}

		/**
		 * API name: {@code timed_out}
		 */
		public Builder timedOut(@Nullable Boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public Builder took(@Nullable JsonValue value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(@Nullable Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code updated}
		 */
		public Builder updated(@Nullable Number value) {
			this.updated = value;
			return this;
		}

		/**
		 * API name: {@code version_conflicts}
		 */
		public Builder versionConflicts(@Nullable Number value) {
			this.versionConflicts = value;
			return this;
		}

		/**
		 * Builds a {@link ReindexResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexResponse build() {

			return new ReindexResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ReindexResponse
	 */
	public static final JsonpDeserializer<ReindexResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ReindexResponse::setupReindexResponseDeserializer);

	protected static void setupReindexResponseDeserializer(DelegatingDeserializer<ReindexResponse.Builder> op) {

		op.add(Builder::batches, JsonpDeserializer.numberDeserializer(), "batches");
		op.add(Builder::created, JsonpDeserializer.numberDeserializer(), "created");
		op.add(Builder::deleted, JsonpDeserializer.numberDeserializer(), "deleted");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(BulkIndexByScrollFailure.DESERIALIZER),
				"failures");
		op.add(Builder::noops, JsonpDeserializer.numberDeserializer(), "noops");
		op.add(Builder::retries, Retries.DESERIALIZER, "retries");
		op.add(Builder::requestsPerSecond, JsonpDeserializer.numberDeserializer(), "requests_per_second");
		op.add(Builder::sliceId, JsonpDeserializer.numberDeserializer(), "slice_id");
		op.add(Builder::task, JsonpDeserializer.jsonValueDeserializer(), "task");
		op.add(Builder::throttledMillis, JsonpDeserializer.jsonValueDeserializer(), "throttled_millis");
		op.add(Builder::throttledUntilMillis, JsonpDeserializer.jsonValueDeserializer(), "throttled_until_millis");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.jsonValueDeserializer(), "took");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::updated, JsonpDeserializer.numberDeserializer(), "updated");
		op.add(Builder::versionConflicts, JsonpDeserializer.numberDeserializer(), "version_conflicts");

	}

}
