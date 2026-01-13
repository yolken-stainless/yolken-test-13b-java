plugins {
    id("yolken-test-13b.kotlin")
    id("yolken-test-13b.publish")
}

dependencies {
    api(project(":yolken-test-13b-java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.2")
}
