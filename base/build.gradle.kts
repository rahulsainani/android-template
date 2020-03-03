plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
}
apply(from = "${rootProject.projectDir}/android.gradle")

dependencies {
    // Kotlin
    implementation(Libs.kotlin_stdlib_jdk7)
    implementation(Libs.coreKtx)

    // Logging
    implementation(Libs.timber)

    // Rx
    implementation(Libs.rxJava)

    // Dependency Injection
    implementation(Libs.dagger)
    kapt(Libs.daggerCompiler)

    // AndroidX
    implementation(Libs.lifecycleViewmodel)

    // Networking
    implementation(Libs.okHttp)
    implementation(Libs.loggingInterceptor)
    implementation(Libs.retrofitMoshi)
    implementation(Libs.retrofitRx)
    implementation(Libs.retrofit)

    // Serialisation
    implementation(Libs.moshi)

    // Testing
    testImplementation(project(Modules.testCore))
}
