plugins {
    id("com.android.application")
    kotlin("android")
}
apply(from = "${rootProject.projectDir}/android.gradle")

dependencies {
    implementation(project(Modules.feature))
}
