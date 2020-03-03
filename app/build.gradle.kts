plugins {
    id("com.android.application")
    kotlin("android")
}
apply(from = "${rootProject.projectDir}/android.gradle")

dependencies {
    implementation(Libs.kotlin_stdlib_jdk7)
    implementation(Libs.coreKtx)

    implementation(project(Modules.base))
    implementation(project(Modules.feature))

    implementation(Libs.timber)
}
