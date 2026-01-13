// File generated from our OpenAPI spec by Stainless.

package com.configure_me_yolken_test_13b.api.errors

import com.configure_me_yolken_test_13b.api.core.JsonValue
import com.configure_me_yolken_test_13b.api.core.http.Headers

abstract class YolkenTest13bServiceException
protected constructor(message: String, cause: Throwable? = null) :
    YolkenTest13bException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
