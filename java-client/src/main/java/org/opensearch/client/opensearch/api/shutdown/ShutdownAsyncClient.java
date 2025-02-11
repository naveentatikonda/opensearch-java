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

package org.opensearch.client.opensearch.api.shutdown;

import org.opensearch.client.RequestOptions;
import org.opensearch.client.base.ApiClient;
import org.opensearch.client.base.Transport;
import org.opensearch.client.opensearch.shutdown.DeleteNodeRequest;
import org.opensearch.client.opensearch.shutdown.DeleteNodeResponse;
import org.opensearch.client.opensearch.shutdown.GetNodeRequest;
import org.opensearch.client.opensearch.shutdown.GetNodeResponse;
import org.opensearch.client.opensearch.shutdown.PutNodeRequest;
import org.opensearch.client.opensearch.shutdown.PutNodeResponse;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/**
 * Client for the shutdown namespace.
 */
public class ShutdownAsyncClient extends ApiClient<ShutdownAsyncClient> {

	public ShutdownAsyncClient(Transport transport) {
		super(transport, null);
	}

	public ShutdownAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: shutdown.delete_node

	/**
	 * Removes a node from the shutdown list
	 *
	 */

	public CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteNodeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Removes a node from the shutdown list
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteNodeResponse> deleteNode(
			Function<DeleteNodeRequest.Builder, ObjectBuilder<DeleteNodeRequest>> fn) throws IOException {
		return deleteNode(fn.apply(new DeleteNodeRequest.Builder()).build());
	}

	// ----- Endpoint: shutdown.get_node

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting down
	 *
	 */

	public CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetNodeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting down
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetNodeResponse> getNode(
			Function<GetNodeRequest.Builder, ObjectBuilder<GetNodeRequest>> fn) throws IOException {
		return getNode(fn.apply(new GetNodeRequest.Builder()).build());
	}

	// ----- Endpoint: shutdown.put_node

	/**
	 * Adds a node to be shut down
	 *
	 */

	public CompletableFuture<PutNodeResponse> putNode(PutNodeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutNodeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Adds a node to be shut down
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutNodeResponse> putNode(
			Function<PutNodeRequest.Builder, ObjectBuilder<PutNodeRequest>> fn) throws IOException {
		return putNode(fn.apply(new PutNodeRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #ShutdownAsyncClient} with specific request options.
	 */
	@Override
	public ShutdownAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new ShutdownAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #ShutdownAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public ShutdownAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
