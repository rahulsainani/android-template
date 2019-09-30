buildscript {
    repositories {
        google()
        jcenter()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath(Libs.androidGradlePlugin)
        classpath(Libs.kotlin_gradle_plugin)
        classpath(Libs.ktlintGradlePlugin)
        classpath(Libs.buildSrcVersionsPlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io") }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

apply(plugin="de.fayard.buildSrcVersions")