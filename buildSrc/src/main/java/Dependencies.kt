
object BuildScript{

    object Plugins {

        const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlinVersion}"
        const val ANDROID_TOOLS_BUILD = "com.android.tools.build:gradle:${Vers.androidToolsBuild}"
        const val HILT_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:${Vers.googleDaggerHilt}"
    }
}



object Libraries {

    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlinVersion}"

    object Android {

        const val ANDROIDX_CORE = "androidx.core:core-ktx:${Vers.androidxCore}"
        const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Vers.androidxAppcompat}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Vers.constraintlayout}"
        const val ANDROID_MATERIAL = "com.google.android.material:material:${Vers.googleAndroidMaterial}"
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

    object Tests {

        const val JUNIT = "junit:junit:${Vers.junit}"
        const val TEST_EXT = "androidx.test.ext:junit:${Vers.testExtJunit}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Vers.espresso}"
    }
}