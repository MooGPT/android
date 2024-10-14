buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.7.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.20")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.52")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.8.1")
        classpath("com.bugsnag:bugsnag-android-gradle-plugin:8.1.0")
    }
}

defaultConfig {
        applicationId("com.ismaker.moogpt")
        minSdkVersion(22)
        targetSdkVersion(22)
        versionCode(1)
        versionName("1.0.1")

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean").configure {
    delete("build")
}
