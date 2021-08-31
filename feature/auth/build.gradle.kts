import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {

    kapt {
        correctErrorTypes = true
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(project(":feature:base-feature"))
    implementation(project(":interactor:auth"))
    
    //hilt
    api(Libraries.Hilt.HILT)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    kapt(Libraries.Hilt.HILT_KAPT)

    testImplementation(Libraries.Tests.JUNIT)
    androidTestImplementation(Libraries.Tests.TEST_EXT)
    androidTestImplementation(Libraries.Tests.ESPRESSO)
}