object BuildScript {

    object Plugins {

        const val GMS = "com.google.gms:google-services:4.3.4"
        const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlinVersion}"
        const val ANDROID_TOOLS_BUILD = "com.android.tools.build:gradle:${Vers.androidToolsBuild}"
        const val HILT_PLUGIN =
            "com.google.dagger:hilt-android-gradle-plugin:${Vers.googleDaggerHilt}"
    }
}

object Libraries {

    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlinVersion}"

    object Android {

        const val ANDROIDX_CORE = "androidx.core:core-ktx:${Vers.androidxCore}"
        const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Vers.androidxAppcompat}"
        const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Vers.constraintlayout}"
        const val ANDROID_MATERIAL =
            "com.google.android.material:material:${Vers.googleAndroidMaterial}"
        const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
        const val LIVE_DATA = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.1"
        const val FRAGMENT = "androidx.fragment:fragment-ktx:1.3.6"
        const val ACTIVITY = "androidx.activity:activity-ktx:1.3.1"
        const val NAV_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:2.3.5"
        const val NAV_UI = "androidx.navigation:navigation-ui-ktx:2.3.5"
    }

    object Hilt {

        const val HILT = "com.google.dagger:hilt-android:${Vers.googleDaggerHilt}"
        const val HILT_KAPT = "com.google.dagger:hilt-compiler:${Vers.googleDaggerHiltCompiler}"
    }

    object Coroutines {

        private const val VER = "1.3.5"

        const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VER"
        const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VER"
    }

    object Firebase {

        const val AUTHENTICATION = "com.google.firebase:firebase-auth-ktx"
        const val FIRESTORE = "com.google.firebase:firebase-firestore-ktx"
        const val ANALYTICS = "com.google.firebase:firebase-analytics-ktx"
        const val BOM = "com.google.firebase:firebase-bom:28.4.0"
    }

    object Tests {

        const val JUNIT = "junit:junit:${Vers.junit}"
        const val TEST_EXT = "androidx.test.ext:junit:${Vers.testExtJunit}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Vers.espresso}"
    }
}