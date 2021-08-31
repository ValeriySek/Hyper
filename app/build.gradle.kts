plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.gms.google-services")
}

android {
    compileSdkVersion(AppConfig.COMPILE_SDK_VERSION)
    buildToolsVersion(AppConfig.BUILD_TOOL_VERSION)

    defaultConfig {
        versionCode = AppConfig.VERSION_CODE
        versionName = AppConfig.VERSION_NAME
        applicationId = AppConfig.APPLICATION_ID
        minSdkVersion(AppConfig.MIN_SDK_VERSION)
        targetSdkVersion(AppConfig.TARGET_SDK_VERSION)

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    kapt {
        correctErrorTypes = true
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(project(":feature:auth"))
    implementation(project(":feature:base-feature"))

    implementation(Libraries.KOTLIN)
    implementation(Libraries.Android.ANDROIDX_CORE)
    implementation(Libraries.Android.ANDROIDX_APPCOMPAT)
    implementation(Libraries.Coroutines.CORE)
    implementation(Libraries.Coroutines.ANDROID)
    implementation(Libraries.Android.VIEW_MODEL)
    implementation(Libraries.Android.FRAGMENT)
    implementation(Libraries.Android.ACTIVITY)

    implementation(Libraries.Firebase.AUTHENTICATION)
    implementation(Libraries.Firebase.FIRESTORE)
    implementation(Libraries.Firebase.ANALYTICS)
    implementation(platform(Libraries.Firebase.BOM))

    implementation(Libraries.Android.ANDROID_MATERIAL)
    implementation(Libraries.Android.CONSTRAINT_LAYOUT)

    //hilt
    implementation(Libraries.Hilt.HILT)
    implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.3.5")
    kapt(Libraries.Hilt.HILT_KAPT)


    testImplementation(Libraries.Tests.JUNIT)
    androidTestImplementation(Libraries.Tests.TEST_EXT)
    androidTestImplementation(Libraries.Tests.ESPRESSO)


}