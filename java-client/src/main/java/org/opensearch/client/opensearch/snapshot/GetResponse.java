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

package org.opensearch.client.opensearch.snapshot;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.opensearch.snapshot.get.SnapshotResponseItem;
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

// typedef: snapshot.get.Response
public final class GetResponse implements ToJsonp {
	@Nullable
	private final List<SnapshotResponseItem> responses;

	@Nullable
	private final List<SnapshotInfo> snapshots;

	// ---------------------------------------------------------------------------------------------

	protected GetResponse(Builder builder) {

		this.responses = builder.responses;
		this.snapshots = builder.snapshots;

	}

	/**
	 * API name: {@code responses}
	 */
	@Nullable
	public List<SnapshotResponseItem> responses() {
		return this.responses;
	}

	/**
	 * API name: {@code snapshots}
	 */
	@Nullable
	public List<SnapshotInfo> snapshots() {
		return this.snapshots;
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

		if (this.responses != null) {

			generator.writeKey("responses");
			generator.writeStartArray();
			for (SnapshotResponseItem item0 : this.responses) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.snapshots != null) {

			generator.writeKey("snapshots");
			generator.writeStartArray();
			for (SnapshotInfo item0 : this.snapshots) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetResponse> {
		@Nullable
		private List<SnapshotResponseItem> responses;

		@Nullable
		private List<SnapshotInfo> snapshots;

		/**
		 * API name: {@code responses}
		 */
		public Builder responses(@Nullable List<SnapshotResponseItem> value) {
			this.responses = value;
			return this;
		}

		/**
		 * API name: {@code responses}
		 */
		public Builder responses(SnapshotResponseItem... value) {
			this.responses = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #responses(List)}, creating the list if needed.
		 */
		public Builder addResponses(SnapshotResponseItem value) {
			if (this.responses == null) {
				this.responses = new ArrayList<>();
			}
			this.responses.add(value);
			return this;
		}

		/**
		 * Set {@link #responses(List)} to a singleton list.
		 */
		public Builder responses(Function<SnapshotResponseItem.Builder, ObjectBuilder<SnapshotResponseItem>> fn) {
			return this.responses(fn.apply(new SnapshotResponseItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #responses(List)}, creating the list if needed.
		 */
		public Builder addResponses(Function<SnapshotResponseItem.Builder, ObjectBuilder<SnapshotResponseItem>> fn) {
			return this.addResponses(fn.apply(new SnapshotResponseItem.Builder()).build());
		}

		/**
		 * API name: {@code snapshots}
		 */
		public Builder snapshots(@Nullable List<SnapshotInfo> value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 */
		public Builder snapshots(SnapshotInfo... value) {
			this.snapshots = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #snapshots(List)}, creating the list if needed.
		 */
		public Builder addSnapshots(SnapshotInfo value) {
			if (this.snapshots == null) {
				this.snapshots = new ArrayList<>();
			}
			this.snapshots.add(value);
			return this;
		}

		/**
		 * Set {@link #snapshots(List)} to a singleton list.
		 */
		public Builder snapshots(Function<SnapshotInfo.Builder, ObjectBuilder<SnapshotInfo>> fn) {
			return this.snapshots(fn.apply(new SnapshotInfo.Builder()).build());
		}

		/**
		 * Add a value to {@link #snapshots(List)}, creating the list if needed.
		 */
		public Builder addSnapshots(Function<SnapshotInfo.Builder, ObjectBuilder<SnapshotInfo>> fn) {
			return this.addSnapshots(fn.apply(new SnapshotInfo.Builder()).build());
		}

		/**
		 * Builds a {@link GetResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetResponse build() {

			return new GetResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetResponse
	 */
	public static final JsonpDeserializer<GetResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetResponse::setupGetResponseDeserializer);

	protected static void setupGetResponseDeserializer(DelegatingDeserializer<GetResponse.Builder> op) {

		op.add(Builder::responses, JsonpDeserializer.arrayDeserializer(SnapshotResponseItem.DESERIALIZER), "responses");
		op.add(Builder::snapshots, JsonpDeserializer.arrayDeserializer(SnapshotInfo.DESERIALIZER), "snapshots");

	}

}
