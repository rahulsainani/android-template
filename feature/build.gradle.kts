plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
}
apply(from = "${rootProject.projectDir}/android.gradle")

dependencies {
    api(project(Modules.base))

    // Dependency Injection
    kapt(Libs.daggerCompiler)

    // AndroidX
    implementation(Libs.appCompat)
    implementation(Libs.constraintLayout)
    implementation(Libs.recyclerview)

    // Testing
    testImplementation(project(Modules.testCore))
}
