import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    val kotlin_version by extra("1.4.32")
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(BuildScript.Plugins.ANDROID_TOOLS_BUILD)
        classpath(BuildScript.Plugins.KOTLIN)
        classpath(BuildScript.Plugins.HILT_PLUGIN)
        classpath(BuildScript.Plugins.GMS)
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20")
    }
}

subprojects {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
    afterEvaluate {
        extensions
            .findByType(com.android.build.gradle.TestedExtension::class.java)
            ?.apply {

                defaultConfig {
                    versionCode = AppConfig.VERSION_CODE
                    versionName = AppConfig.VERSION_NAME
                    minSdkVersion(AppConfig.MIN_SDK_VERSION)
                    targetSdkVersion(AppConfig.TARGET_SDK_VERSION)

                    vectorDrawables.useSupportLibrary = true
                }

                compileSdkVersion(AppConfig.COMPILE_SDK_VERSION)
                buildToolsVersion(AppConfig.BUILD_TOOL_VERSION)

//                sourceSets.forEach { sourceSet ->
//                    sourceSet.java.srcDir("src/${sourceSet.name}/kotlin")
//                }

                with(compileOptions) {
                    sourceCompatibility = JavaVersion.VERSION_1_8
                    targetCompatibility = JavaVersion.VERSION_1_8
                }

                packagingOptions {
                    exclude("META-INF/DEPENDENCIES")
                    exclude("META-INF/LICENSE")
                    exclude("META-INF/LICENSE.txt")
                    exclude("META-INF/license.txt")
                    exclude("META-INF/NOTICE")
                    exclude("META-INF/NOTICE.txt")
                    exclude("META-INF/notice.txt")
                    exclude("META-INF/ASL2.0")
                    exclude("META-INF/*.kotlin_module")
                }
//                packagingOptions {
//                    exclude("META-INF/DEPENDENCIES")
//                    exclude("META-INF/AL2.0")
//                    exclude("META-INF/LGPL2.1")
//                }
//
//                if (group.toString().contains("feature", ignoreCase = true)) {
//                    dependencies.add("implementation", Libraries.EDGE_TO_EDGE)
//                }
            }
    }
}
allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}