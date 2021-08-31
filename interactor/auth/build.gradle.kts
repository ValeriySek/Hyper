plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

dependencies {

    implementation(project(":domain"))

    implementation(Libraries.KOTLIN)
    implementation(Libraries.Android.ANDROIDX_CORE)
    implementation(Libraries.Android.ANDROIDX_APPCOMPAT)
    implementation(Libraries.Coroutines.CORE)
    implementation(Libraries.Coroutines.ANDROID)

    implementation(Libraries.Firebase.AUTHENTICATION)
    implementation(Libraries.Firebase.FIRESTORE)
    implementation(Libraries.Firebase.ANALYTICS)
    implementation(platform(Libraries.Firebase.BOM))

    //hilt
    implementation(Libraries.Hilt.HILT)
    kapt(Libraries.Hilt.HILT_KAPT)


    testImplementation(Libraries.Tests.JUNIT)
    androidTestImplementation(Libraries.Tests.TEST_EXT)
    androidTestImplementation(Libraries.Tests.ESPRESSO)
}