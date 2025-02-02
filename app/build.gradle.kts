plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.capstoneproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.capstoneproject"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    // Core Android Libraries
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // OkHttp for API calls
    implementation("com.squareup.okhttp3:okhttp:4.9.3")

    // JSON parsing library (JSONObject)
    implementation("org.json:json:20210307")

    // Testing Libraries
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
