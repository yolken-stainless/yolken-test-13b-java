// File generated from our OpenAPI spec by Stainless.

package com.configure_me_yolken_test_13b.api.services.async.store

import com.configure_me_yolken_test_13b.api.TestServerExtension
import com.configure_me_yolken_test_13b.api.client.okhttp.YolkenTest13bOkHttpClientAsync
import com.configure_me_yolken_test_13b.api.models.Order
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            YolkenTest13bOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.store().orders()

        val orderFuture =
            orderServiceAsync.create(
                Order.builder()
                    .id(10L)
                    .complete(true)
                    .petId(198772L)
                    .quantity(7)
                    .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Order.Status.APPROVED)
                    .build()
            )

        val order = orderFuture.get()
        order.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            YolkenTest13bOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.store().orders()

        val orderFuture = orderServiceAsync.retrieve(0L)

        val order = orderFuture.get()
        order.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            YolkenTest13bOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.store().orders()

        val future = orderServiceAsync.delete(0L)

        val response = future.get()
    }
}
