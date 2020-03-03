plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
}
apply(from = "${rootProject.projectDir}/android.gradle")

dependencies {
    implementation(project(Modules.base))

    implementation(Libs.kotlin_stdlib_jdk7)
    implementation(Libs.coreKtx)

    implementation(Libs.timber)

    implementation(Libs.dagger)
    kapt(Libs.daggerCompiler)

    implementation(Libs.lifecycleViewmodel)

    implementation(Libs.okHttp)
    implementation(Libs.loggingInterceptor)
    implementation(Libs.retrofitMoshi)
    implementation(Libs.retrofit)
    implementation(Libs.moshi)
}
