plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.edgarchisholm.androidcicdlab"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.edgarchisholm.androidcicdlab"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2026.02.01"))
    implementation("androidx.activity:activity-compose:1.13.0")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.runtime:runtime-saveable")
    implementation("androidx.compose.ui:ui")

    testImplementation("junit:junit:4.13.2")
}
