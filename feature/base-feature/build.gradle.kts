plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    kapt {
        correctErrorTypes = true
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    api(Libraries.KOTLIN)
    api(Libraries.Android.ANDROIDX_CORE)
    api(Libraries.Android.ANDROIDX_APPCOMPAT)
    api(Libraries.Coroutines.CORE)
    api(Libraries.Coroutines.ANDROID)
    api(Libraries.Android.VIEW_MODEL)
    api(Libraries.Android.FRAGMENT)
    api(Libraries.Android.ACTIVITY)
    api(Libraries.Android.NAV_FRAGMENT)
    api(Libraries.Android.NAV_UI)
    api(Libraries.Android.LIVE_DATA)

    api(Libraries.Android.ANDROID_MATERIAL)
    api(Libraries.Android.CONSTRAINT_LAYOUT)

    //hilt
    api(Libraries.Hilt.HILT)
    kapt(Libraries.Hilt.HILT_KAPT)


    testImplementation(Libraries.Tests.JUNIT)
    androidTestImplementation(Libraries.Tests.TEST_EXT)
    androidTestImplementation(Libraries.Tests.ESPRESSO)
}