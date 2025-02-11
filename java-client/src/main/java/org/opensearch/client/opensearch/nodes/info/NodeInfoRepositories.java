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

package org.opensearch.client.opensearch.nodes.info;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;
import java.util.function.Function;

// typedef: nodes.info.NodeInfoRepositories
public final class NodeInfoRepositories implements ToJsonp {
	private final NodeInfoRepositoriesUrl url;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoRepositories(Builder builder) {

		this.url = Objects.requireNonNull(builder.url, "url");

	}

	/**
	 * API name: {@code url}
	 */
	public NodeInfoRepositoriesUrl url() {
		return this.url;
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

		generator.writeKey("url");
		this.url.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoRepositories}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoRepositories> {
		private NodeInfoRepositoriesUrl url;

		/**
		 * API name: {@code url}
		 */
		public Builder url(NodeInfoRepositoriesUrl value) {
			this.url = value;
			return this;
		}

		/**
		 * API name: {@code url}
		 */
		public Builder url(Function<NodeInfoRepositoriesUrl.Builder, ObjectBuilder<NodeInfoRepositoriesUrl>> fn) {
			return this.url(fn.apply(new NodeInfoRepositoriesUrl.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoRepositories}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoRepositories build() {

			return new NodeInfoRepositories(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoRepositories
	 */
	public static final JsonpDeserializer<NodeInfoRepositories> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoRepositories::setupNodeInfoRepositoriesDeserializer);

	protected static void setupNodeInfoRepositoriesDeserializer(
			DelegatingDeserializer<NodeInfoRepositories.Builder> op) {

		op.add(Builder::url, NodeInfoRepositoriesUrl.DESERIALIZER, "url");

	}

}
