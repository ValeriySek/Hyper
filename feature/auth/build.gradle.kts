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

    implementation(project(":feature:base-feature"))
    implementation(project(":interactor:auth"))
    
    //hilt
    api(Libraries.Hilt.HILT)
    kapt(Libraries.Hilt.HILT_KAPT)

    testImplementation(Libraries.Tests.JUNIT)
    androidTestImplementation(Libraries.Tests.TEST_EXT)
    androidTestImplementation(Libraries.Tests.ESPRESSO)
}