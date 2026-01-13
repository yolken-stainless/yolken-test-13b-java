package com.configure_me_yolken_test_13b.api.errors

/**
 * Exception that indicates a transient error that can be retried.
 *
 * When this exception is thrown during an HTTP request, the SDK will automatically retry the
 * request up to the maximum number of retries.
 *
 * @param message A descriptive error message
 * @param cause The underlying cause of this exception, if any
 */
class YolkenTest13bRetryableException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    YolkenTest13bException(message, cause)
