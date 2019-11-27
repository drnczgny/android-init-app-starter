import org.jetbrains.kotlin.config.KotlinCompilerVersion
import org.jetbrains.kotlin.platform.jvm.JvmPlatforms

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "com.adrian.project"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    // For Kotlin projects
    kotlinOptions {
        JvmPlatforms.jvmPlatformByTargetVersion(org.jetbrains.kotlin.config.JvmTarget.JVM_1_8)
    }

    packagingOptions.exclude("META-INF/main.kotlin_module")

    dataBinding.isEnabled = true
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin("stdlib-jdk8", KotlinCompilerVersion.VERSION))

    // Kotlin
    implementation(Dependencies.Kotlin.coroutines)
    implementation(Dependencies.Kotlin.stdlib)

    // Support lib
    implementation(Dependencies.Support.appCompat)
    implementation(Dependencies.Support.recyclerView)
    implementation(Dependencies.Support.cardView)
    implementation(Dependencies.Support.constraintLayout)
    implementation(Dependencies.Support.legacySupport)
    implementation(Dependencies.Support.material)
    implementation(Dependencies.Support.appCompat)

    // Room
    implementation(Dependencies.Room.roomRuntime)
    implementation(Dependencies.Room.roomKtx)
    implementation(Dependencies.Room.roomRxJava2)
    kapt(Dependencies.Room.roomCompiler)

    // Koin
//    implementation(Dependencies.Koin.koinCore)
//    implementation(Dependencies.Koin.koinAndroid)
//    implementation(Dependencies.Koin.koinCore)
//    implementation(Dependencies.Koin.koinScope)
//    implementation(Dependencies.Koin.koinViewModel)
//    implementation(Dependencies.Koin.koinArchitecture)

    // Databinding
//    implementation(Dependencies.DataBinding.dataBinding) // ?????

    // Architecture Components
    // AndroidX
    implementation(Dependencies.AndroidX.lifecycleExt)
    implementation(Dependencies.AndroidX.liveData)
    implementation(Dependencies.AndroidX.viewModel)
    implementation(Dependencies.AndroidX.androidXFragment)
    implementation(Dependencies.AndroidX.androidXActivity)
    kapt(Dependencies.AndroidX.lifecycleCompiler)

////    testImplementation deps.android.lifeCycleTesting

    // dagger
    implementation(Dependencies.Dagger.dagger)
    implementation(Dependencies.Dagger.daggerSupport)
    kapt(Dependencies.Dagger.daggerCompiler)
    kapt(Dependencies.Dagger.daggerAndroidProcessor)

    // RxJava2
    implementation(Dependencies.Reactivex.rxAndroid)
    implementation(Dependencies.Reactivex.rxJava)
    implementation(Dependencies.Reactivex.rxKotlin)
    implementation(Dependencies.Reactivex.rxReplayingShare)

    // retrofit
    implementation(Dependencies.Square.retrofit)
    implementation(Dependencies.Square.gsonConverter)
    implementation(Dependencies.Square.scalarsConverter)
    implementation(Dependencies.Square.okhttp)
    implementation(Dependencies.Square.picasso)
    implementation(Dependencies.Square.okhttpDownloader)
    implementation(Dependencies.Square.squareupRetrofitRxAdapter)
    implementation(Dependencies.Square.jakewhartonRetrofitRxAdapter)
    implementation(Dependencies.Square.stethoOkhttp)

    // other 3rd party
    implementation(Dependencies.Facebook.networkInterceptor)
    implementation(Dependencies.Facebook.stetho)

    implementation(Dependencies.Thirdparty.jacksonCore)
    implementation(Dependencies.Thirdparty.threetenabpJakewharton)
    implementation(Dependencies.Thirdparty.timber)
    implementation(Dependencies.Thirdparty.dataFactory)
    implementation(Dependencies.Thirdparty.flexBox)
    implementation(Dependencies.Thirdparty.core)

    // test
//    api deps.test.mockk
//    api deps.test.junit

    testImplementation("junit:junit:4.12")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
}

repositories {
    mavenCentral()
    maven("http://repository.jetbrains.com/all")
}