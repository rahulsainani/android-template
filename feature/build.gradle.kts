plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
}
apply(from = "${rootProject.projectDir}/android.gradle")

dependencies {
    implementation(project(Modules.base))
    implementation(project(Modules.di))

    implementation(Libs.kotlin_stdlib_jdk7)
    implementation(Libs.coreKtx)

    // Logging
    implementation(Libs.timber)

    // Dependency Injection
    implementation(Libs.dagger)
    kapt(Libs.daggerCompiler)

    // AndroidX
    implementation(Libs.lifecycleViewmodel)
    implementation(Libs.lifecycleCommonJava8)
    implementation(Libs.lifecycleExtensions)
    implementation(Libs.material)
    implementation(Libs.appCompat)
    implementation(Libs.constraintLayout)
    implementation(Libs.recyclerview)

    // Networking
    implementation(Libs.retrofit)

    // Testing
    testImplementation(project(Modules.testCore))
    testRuntimeOnly(Libs.junitJupiterEngine)
}
