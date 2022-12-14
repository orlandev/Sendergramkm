object Versions {
    //Android
    const val androidMinSdk = 21
    const val androidCompileSdk = 33
    const val androidTargetSdk = androidCompileSdk
    const val lifecycleKtx = "2.6.0-alpha02"
    const val lifecycleRuntimeKtx = lifecycleKtx
    const val lifecycleViewmodelKtx = lifecycleKtx
    const val osmdroidAndroid =
        "6.1.10" // This is only for test because we use the google maps in android and native map in others platforms

    //Kotlin
    const val kotlinCoroutines = "1.6.4"
    const val kotlinxSerialization = "1.4.1"
    const val kmpNativeCoroutinesVersion = "0.13.1"

    //Kotlin HTML-JS
    const val kotlinxHtmlJs = "0.8.0"

    //Koin Dependency Injection
    const val koinCore = "3.2.2"
    const val koinAndroid = "3.3.0"
    const val koinAndroidCompose = "3.3.0"
    const val koinKtor = "3.2.2"

    //Ktor
    const val ktor = "2.2.1"

    //Compose
    const val composeBom = "2022.11.00"
    const val composeCompiler = "1.3.2"
    const val activityCompose = "1.6.1"
    const val navCompose = "2.5.3"
    const val wearCompose = "1.1.0" //Only For Test
    const val composeDesktopWeb = "1.2.1-rc03" //Only For Test
    const val composeIos = "1.2.1-rc03" //Only For Test

    const val accompanist = "0.27.0"
    const val horologist = "0.2.5"


    //Test Deps
    const val junit = "4.13.2"
    const val androidXTestJUnit = "1.1.3"
    const val testCore = "1.3.0"
    const val mockito = "3.11.2"
    const val robolectric = "4.6.1"

    //Multiplatform Database
    const val sqlDelight = "1.5.4"

    const val shadow = "7.1.2"
    const val kotlinterGradle = "3.12.0"

    //Coil
    const val coilCompose = "2.2.2"

    //OkHTTP
    const val okhttp = "4.10.0"

    const val slf4j = "1.7.30"
    const val logback = "1.2.3"
    const val kermit = "1.0.0"

    const val gradleVersionsPlugin = "0.44.0"
}

object Deps {
    object Gradle {

        /**
        Painless Gradle plugin for linting and formatting Kotlin source files using the awesome ktlint engine.
         */
        const val kotlinter = "org.jmailen.gradle:kotlinter-gradle:${Versions.kotlinterGradle}"

        /**
        SQLDelight generates typesafe kotlin APIs from your SQL statements. It verifies your schema,
        statements, and migrations at compile-time and provides IDE features like autocomplete and
        refactoring which make writing and maintaining SQL simple.
         */
        const val sqlDelight = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"

        /**
        In the spirit of the Maven Versions Plugin, this plugin provides a task to determine which dependencies have updates.
        Additionally, the plugin checks for updates to Gradle itself.
         */
        const val gradleVersionsPlugin =
            "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersionsPlugin}"
    }

    object Kotlinx {
        /**
        Kotlin serialization consists of a compiler plugin, that generates visitor code for serializable
        classes, runtime library with core serialization API and support libraries with various serialization formats.
         */
        const val serializationCore =
            "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinxSerialization}"

        const val coroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"

        const val coroutinesTest =
            "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"

        /**
        A kotlinx.html library provides DSL to build HTML to Writer/Appendable or DOM.
        Available to all Kotlin Multiplatform targets and browser(or other JavaScript engine)
        for better Kotlin programming for Web.
         */
        const val htmlJs = "org.jetbrains.kotlinx:kotlinx-html-js:${Versions.kotlinxHtmlJs}"

    }

    object Android {
        const val osmdroidAndroid = "org.osmdroid:osmdroid-android:${Versions.osmdroidAndroid}"
    }

    object AndroidX {
        const val benchmarkMacroJunit4 = "androidx.benchmark:benchmark-macro-junit4:1.1.0-rc01"
        const val benchmarkJunit4 = "androidx.benchmark:benchmark-junit4:1.1.0-rc01"
        const val lifecycleRuntimeCompose =
            "androidx.lifecycle:lifecycle-runtime-compose:${Versions.lifecycleRuntimeKtx}"
        const val lifecycleRuntimeKtx =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"
        const val lifecycleViewmodelKtx =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewmodelKtx}"

        const val metrics = "androidx.metrics:metrics-performance:1.0.0-alpha01"
        const val testEspressoCore = "androidx.test.espresso:espresso-core:3.4.0"
        const val testExtJunit = "androidx.test.ext:junit:1.1.3"
        const val testUiautomator = "androidx.test.uiautomator:uiautomator:2.2.0"

        const val splashScreen = "androidx.core:core-splashscreen:1.0.0"
    }

    object Test {
        const val junit = "junit:junit:${Versions.junit}"
        const val androidXTestJUnit = "androidx.test.ext:junit:${Versions.androidXTestJUnit}"
        const val mockito = "org.mockito:mockito-inline:${Versions.mockito}"
        const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
        const val testCore = "androidx.test:core:${Versions.testCore}"

        const val composeUiTest = "androidx.compose.ui:ui-test"
        const val composeUiTestJUnit = "androidx.compose.ui:ui-test-junit4"
        const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest"
        const val composeNavTesting =
            "androidx.navigation:navigation-testing:${Versions.navCompose}"
    }

    object Compose {

        const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
        const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
        const val foundationLayout = "androidx.compose.foundation:foundation"
        const val ui = "androidx.compose.ui:ui"
        const val toolPreview = "androidx.compose.ui:ui-tooling-preview"
        const val uiUtil = "androidx.compose.ui:ui-util"
        const val uiMaterial3 = "androidx.compose.material3:material3"
        const val uiMaterial3WindowSizeClass = "androidx.compose.material3:material3-window-size-class"
        const val runtime = "androidx.compose.runtime:runtime"
        const val compiler = "androidx.compose.compiler:compiler:${Versions.composeCompiler}"
        const val iconsCore = "androidx.compose.material:material-icons-core"
        const val iconsExtended = "androidx.compose.material:material-icons-extended"
        const val navigation = "androidx.navigation:navigation-compose:${Versions.navCompose}"

        //Only for Test
        const val wearFoundation =
            "androidx.wear.compose:compose-foundation:${Versions.wearCompose}"
        const val wearMaterial = "androidx.wear.compose:compose-material:${Versions.wearCompose}"
        const val wearNavigation =
            "androidx.wear.compose:compose-navigation:${Versions.wearCompose}"


        //Coil Image Library
        const val coilCompose = "io.coil-kt:coil-compose:${Versions.coilCompose}"

    }

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koinCore}"
        const val test = "io.insert-koin:koin-test:${Versions.koinCore}"
        const val testJUnit4 = "io.insert-koin:koin-test-junit4:${Versions.koinCore}"
        const val android = "io.insert-koin:koin-android:${Versions.koinAndroid}"
        const val compose = "io.insert-koin:koin-androidx-compose:${Versions.koinAndroidCompose}"
    }

    object Ktor {
        const val serverCore = "io.ktor:ktor-server-core:${Versions.ktor}"
        const val serverNetty = "io.ktor:ktor-server-netty:${Versions.ktor}"
        const val serverCors = "io.ktor:ktor-server-cors:${Versions.ktor}"
        const val contentNegotiation = "io.ktor:ktor-client-content-negotiation:${Versions.ktor}"
        const val json = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktor}"

        const val serverContentNegotiation =
            "io.ktor:ktor-server-content-negotiation:${Versions.ktor}"

        const val clientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val clientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
        const val clientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        const val clientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
        const val clientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
        const val clientJava = "io.ktor:ktor-client-java:${Versions.ktor}"
        const val clientDarwin = "io.ktor:ktor-client-darwin:${Versions.ktor}"
        const val clientJs = "io.ktor:ktor-client-js:${Versions.ktor}"
    }

    object SqlDelight {
        const val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
        const val coroutineExtensions =
            "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
        const val androidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
        const val nativeDriver = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"

        //const val nativeDriverMacos = "com.squareup.sqldelight:native-driver-macosx64:${Versions.sqlDelight}"
        const val nativeDriverMacos =
            "com.squareup.sqldelight:native-driver-macosarm64:${Versions.sqlDelight}"
        const val sqliteDriver = "com.squareup.sqldelight:sqlite-driver:${Versions.sqlDelight}"
    }

    object Ok {
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    }

    object Log {
        const val slf4j = "org.slf4j:slf4j-simple:${Versions.slf4j}"
        const val logback = "ch.qos.logback:logback-classic:${Versions.logback}"
        const val kermit = "co.touchlab:kermit:${Versions.kermit}"
    }

    object Glance {
        const val tiles = "androidx.glance:glance-wear-tiles:1.0.0-alpha05"
        const val appwidget = "androidx.glance:glance-appwidget:1.0.0-alpha05"
    }

    object Horologist {
        const val composeLayout =
            "com.google.android.horologist:horologist-compose-layout:${Versions.horologist}"
    }
}
