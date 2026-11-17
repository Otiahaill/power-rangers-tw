plugins {
    id("com.android.application") version "8.5.0" apply true
    id("org.jetbrains.kotlin.android") version "1.9.23" apply true
}

android {
    namespace = "com.example.tw"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.tw"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        // Enable TV / handset support
        resConfigs += "en"
    }

    buildTypes {
        release {
            signingConfig = null // let user sign
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "1.17"
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2024.01.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-framework")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx")
    implementation("androidx.activity:activity-compose")
}
