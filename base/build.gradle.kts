plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
}
apply(from = "${rootProject.projectDir}/android.gradle")

dependencies {
    // Kotlin
    api(Libs.kotlin_stdlib_jdk7)
    api(Libs.coreKtx)

    // Logging
    api(Libs.timber)

    // Rx
    api(Libs.rxJava)

    // Dependency Injection
    api(Libs.dagger)
    kapt(Libs.daggerCompiler)
    api(Libs.jsr305)

    // AndroidX
    api(Libs.lifecycleViewmodel)
    api(Libs.lifecycleCommonJava8)
    api(Libs.lifecycleExtensions)
    api(Libs.material)

    // Networking
    implementation(Libs.okHttp)
    implementation(Libs.loggingInterceptor)
    implementation(Libs.retrofitGson)
    implementation(Libs.retrofitRx)
    api(Libs.retrofit)

    // Serialisation
    api(Libs.gson)

    // Testing
    testImplementation(project(Modules.testCore))
}
