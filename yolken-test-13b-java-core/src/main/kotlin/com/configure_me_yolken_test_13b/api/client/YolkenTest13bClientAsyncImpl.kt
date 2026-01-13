// File generated from our OpenAPI spec by Stainless.

package com.configure_me_yolken_test_13b.api.client

import com.configure_me_yolken_test_13b.api.core.ClientOptions
import com.configure_me_yolken_test_13b.api.core.getPackageVersion
import com.configure_me_yolken_test_13b.api.services.async.PetServiceAsync
import com.configure_me_yolken_test_13b.api.services.async.PetServiceAsyncImpl
import com.configure_me_yolken_test_13b.api.services.async.StoreServiceAsync
import com.configure_me_yolken_test_13b.api.services.async.StoreServiceAsyncImpl
import com.configure_me_yolken_test_13b.api.services.async.UserServiceAsync
import com.configure_me_yolken_test_13b.api.services.async.UserServiceAsyncImpl
import java.util.function.Consumer

class YolkenTest13bClientAsyncImpl(private val clientOptions: ClientOptions) :
    YolkenTest13bClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: YolkenTest13bClient by lazy { YolkenTest13bClientImpl(clientOptions) }

    private val withRawResponse: YolkenTest13bClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pets: PetServiceAsync by lazy { PetServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val store: StoreServiceAsync by lazy {
        StoreServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): YolkenTest13bClient = sync

    override fun withRawResponse(): YolkenTest13bClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): YolkenTest13bClientAsync =
        YolkenTest13bClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pets(): PetServiceAsync = pets

    override fun store(): StoreServiceAsync = store

    override fun users(): UserServiceAsync = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        YolkenTest13bClientAsync.WithRawResponse {

        private val pets: PetServiceAsync.WithRawResponse by lazy {
            PetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreServiceAsync.WithRawResponse by lazy {
            StoreServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): YolkenTest13bClientAsync.WithRawResponse =
            YolkenTest13bClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pets(): PetServiceAsync.WithRawResponse = pets

        override fun store(): StoreServiceAsync.WithRawResponse = store

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
