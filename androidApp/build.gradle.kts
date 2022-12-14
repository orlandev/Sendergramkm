plugins {
    id("com.android.application")
    kotlin("android")
    id("com.github.ben-manes.versions")
}

android {
    namespace = "com.freedoom.sendergram.android"
    compileSdk = Versions.androidCompileSdk

    defaultConfig {
        applicationId = "com.freedoom.sendergram.android"
        minSdk = Versions.androidMinSdk
        targetSdk = Versions.androidTargetSdk
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    /* with(Deps.Android) {
         implementation(osmdroidAndroid)
     }
 */
    with(Deps.AndroidX) {
        implementation(lifecycleRuntimeCompose)
        implementation(lifecycleRuntimeKtx)
        implementation(lifecycleViewmodelKtx)
        implementation(splashScreen)
    }

    with(Deps.Glance) {
        implementation(appwidget)
    }

    with(Deps.Compose) {
        val composeBomValue = platform(composeBom)
        implementation(composeBomValue)
        implementation(activityCompose)
        implementation(foundationLayout)
        implementation(activityCompose)
        implementation(ui)
        implementation(toolPreview)
        implementation(uiUtil)
        implementation(uiMaterial3)
        implementation(uiMaterial3WindowSizeClass)
        implementation(runtime)
        implementation(compiler)
        implementation(iconsCore)
        implementation(iconsExtended)
        implementation(navigation)

    }

    with(Deps.Koin) {
        implementation(core)
        implementation(android)
        implementation(compose)
        testImplementation(test)
        testImplementation(testJUnit4)
    }

    with(Deps.Test) {
        testImplementation(junit)
        androidTestImplementation(androidXTestJUnit)
        testImplementation(testCore)
        testImplementation(robolectric)
        testImplementation(mockito)

        // Compose testing dependencies
     /*   androidTestImplementation(composeUiTest)
        androidTestImplementation(composeUiTestJUnit)
        androidTestImplementation(composeNavTesting)
        debugImplementation(composeUiTestManifest)*/

    }


}