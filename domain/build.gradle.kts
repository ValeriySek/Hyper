plugins {
    id("com.android.library")
    id("kotlin-android")
}

dependencies {

    implementation(Libraries.KOTLIN)
    implementation(Libraries.Android.ANDROIDX_CORE)
    implementation(Libraries.Android.ANDROIDX_APPCOMPAT)

    testImplementation(Libraries.Tests.JUNIT)
    androidTestImplementation(Libraries.Tests.TEST_EXT)
    androidTestImplementation(Libraries.Tests.ESPRESSO)
}