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

    implementation(project(":interactor:auth"))

    implementation(Libraries.KOTLIN)
    implementation(Libraries.Android.ANDROIDX_CORE)
    implementation(Libraries.Android.ANDROIDX_APPCOMPAT)
    implementation(Libraries.Coroutines.CORE)
    implementation(Libraries.Coroutines.ANDROID)
    implementation(Libraries.Android.VIEW_MODEL)
    implementation(Libraries.Android.FRAGMENT)
    implementation(Libraries.Android.ACTIVITY)

    implementation(Libraries.Android.ANDROID_MATERIAL)
    implementation(Libraries.Android.CONSTRAINT_LAYOUT)

    implementation(Libraries.Firebase.AUTHENTICATION)
    implementation(Libraries.Firebase.FIRESTORE)

    //hilt
    implementation(Libraries.Hilt.HILT)
    kapt(Libraries.Hilt.HILT_KAPT)


    testImplementation(Libraries.Tests.JUNIT)
    androidTestImplementation(Libraries.Tests.TEST_EXT)
    androidTestImplementation(Libraries.Tests.ESPRESSO)
}