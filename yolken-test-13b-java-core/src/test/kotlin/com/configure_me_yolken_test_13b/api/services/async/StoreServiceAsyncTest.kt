// File generated from our OpenAPI spec by Stainless.

package com.configure_me_yolken_test_13b.api.services.async

import com.configure_me_yolken_test_13b.api.TestServerExtension
import com.configure_me_yolken_test_13b.api.client.okhttp.YolkenTest13bOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StoreServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listInventory() {
        val client =
            YolkenTest13bOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val storeServiceAsync = client.store()

        val responseFuture = storeServiceAsync.listInventory()

        val response = responseFuture.get()
        response.validate()
    }
}
