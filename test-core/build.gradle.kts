plugins {
    id("com.android.library")
    kotlin("android")
}
apply(from = "${rootProject.projectDir}/android.gradle")

dependencies {
    implementation(Libs.kotlin_stdlib_jdk7)
    implementation(Libs.dagger)
    implementation(Libs.lifecycleExtensions)

    api(Libs.junitJupiter)
    testRuntimeOnly(Libs.junitJupiterEngine)
    api(Libs.mockitoKotlin)
    api(Libs.mockitoInline)
    api(Libs.assertJCore)
    api(Libs.coroutinesTest)
}
