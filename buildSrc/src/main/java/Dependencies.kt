object Versions {

    const val kotlinVersion = "1.3.60"
    const val androidPluginVersion = "3.5.2"

    const val appCompat = "1.1.0"
    const val androidXSupport = "1.0.0"

    const val minSdk                = "24"
    const val compileSdk            = "29"

    const val buildTools            = "29.0.1"
    const val dataBinding    = androidPluginVersion
    const val androidXActivity      = "1.0.0-alpha06"
    const val androidXFragment      = "1.1.0-alpha06"
    const val constraintLayout      = "2.0.0-alpha3"
    const val androidCoreKtxVersion = "1.0.1"
    const val koin                  = "2.0.1"
    const val koinArchitecture      = "1.0.0"
    const val archComp              = "1.1.1"
    const val lifeCycleVersion      = "2.0.0"
    const val livedataTesting       = "1.1.1"
    const val room                  = "2.2.2"
    const val roomRx                = "2.2.2"
    const val roomTesting           = "1.0.0"
    const val gms                   = "3.1.0"
    const val dagger                = "2.24"
    const val gson                  = "2.8.2"
    const val retrofit              = "2.6.1"
    const val retrofitRxAdapter     = "1.0.0"
    const val okhttp                = "4.1.0"
    const val okhttpDownloader      = "1.1.0"
    const val picasso               = "2.5.2"
    const val stdLibJre7Version     = "1.2.71"
    const val rxJava                = "2.1.0"
    const val rxAndroid             = "2.0.1"
    const val rxJava2RetrofitAdapter= "2.6.1"
    const val rxkotlin              = "2.4.0-beta.1"
    const val coroutines            = "1.3.2"
    const val rxReplayingShare      = "2.2.0"
    const val stetho                = "1.5.1"
    const val threetenabp           = "1.0.5"
    const val jacksonCore           = "2.0.1"
    const val junit                 = "4.12"
    const val atsl                  = "1.0.1"
    const val mockitoKotlin         = "1.5.0"
    const val mockitoCore           = "2.8.9"
    const val robolectric           = "3.6.1"
    const val mockk                 = "1.9.3"
//    const val sourceCompat          = JavaVersion.VERSION_1_8
//    const val targetCompat        = JavaVersion.VERSION_1_8

    const val jackson                     = "2.9.9"
    const val jacksonKotlin               = "2.9.6" // note: do not upgrade until https://github.com/FasterXML/jackson-module-kotlin/issues/176 is fixed!
    const val jacksonThreeten             = "2.8.4"
}
object Dependencies2 {
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
}


object Dependencies {

    object Room {
        const val roomRuntime                 = "androidx.room:room-runtime:${Versions.room}"
        const val roomCompiler                = "androidx.room:room-compiler:${Versions.room}" // kapt
        const val roomKtx                     = "androidx.room:room-ktx:${Versions.room}"
        const val roomRxJava2                 = "androidx.room:room-rxjava2:${Versions.room}"
    }

    object AndroidX {
        const val lifecycleExt          = "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycleVersion}"
        const val viewModel             = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycleVersion}"
        const val liveData              = "androidx.lifecycle:lifecycle-livedata:${Versions.lifeCycleVersion}"
        const val lifecycleCompiler     = "androidx.lifecycle:lifecycle-compiler:${Versions.lifeCycleVersion}" // kapt
        const val androidXActivity      = "androidx.activity:activity-ktx:${Versions.androidXActivity}"
        const val androidXFragment      = "androidx.fragment:fragment-ktx:${Versions.androidXFragment}"
    }

    object Support {
        const val appCompat                 = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val recyclerView              = "androidx.recyclerview:recyclerview:${Versions.appCompat}"
        const val cardView                  = "androidx.cardview:cardview:${Versions.androidXSupport}"
        const val legacySupport             = "androidx.legacy:legacy-support-v4:${Versions.androidXSupport}"
        const val material                  = "com.google.android.material:material:${Versions.androidXSupport}"
        const val constraintLayout          = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object Kotlin {
        const val stdlibJre7                   = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.stdLibJre7Version}"
        const val stdlib                       = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
        const val coroutines                   = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object Koin {
        const val koinCore                  = "org.koin:koin-core:${Versions.koin}"
        const val koinAndroid               = "org.koin:koin-android:${Versions.koin}"
        const val koinScope                 = "org.koin:koin-androidx-scope:${Versions.koin}"
        const val koinViewModel             = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
        const val koinArchitecture          = "org.koin:koin-android-architecture:${Versions.koinArchitecture}"
    }

    object DataBinding {
        const val dataBinding               = "com.android.databinding:compiler:${Versions.dataBinding}"
    }

    object Dagger {
        const val dagger                      = "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerSupport               = "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val daggerCompiler              = "com.google.dagger:dagger-compiler:${Versions.dagger}"          // kapt
        const val daggerAndroidProcessor      = "com.google.dagger:dagger-android-processor:${Versions.dagger}"     //kapt
    }

    object Reactivex {
        const val rxJava                 = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
        const val rxAndroid              = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
        const val rxKotlin               = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"
        const val rxReplayingShare       = "com.jakewharton.rx2:replaying-share:${Versions.rxReplayingShare}"
    }

    object Google {
        const val gmsPlugin               = "com.google.gms:google-services:${Versions.gms}"
        const val gson                    = "com.google.code.gson:gson:${Versions.gson}"
    }

    object Square {
        const val retrofit                        = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gsonConverter                   = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val scalarsConverter                = "com.squareup.retrofit2:converter-scalars:${Versions.rxJava}"
        const val okhttp                          = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val picasso                         = "com.squareup.picasso:picasso:${Versions.picasso}"
        const val okhttpDownloader                = "com.jakewharton.picasso:picasso2-okhttp3-downloader:${Versions.okhttpDownloader}"
        const val squareupRetrofitRxAdapter       = "com.squareup.retrofit2:adapter-rxjava2:${Versions.rxJava2RetrofitAdapter}"
        const val jakewhartonRetrofitRxAdapter    = "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:${Versions.retrofitRxAdapter}"
        const val stethoOkhttp                    = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
    }

    object Facebook {
        const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
        const val networkInterceptor = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
    }

    object Thirdparty {
        const val jacksonCore                = "com.fasterxml.jackson.core:jackson-databind:${Versions.jacksonCore}"
        const val threetenabpJakewharton     = "com.jakewharton.threetenabp:threetenabp:1.0.5"
        const val timber                     = "com.jakewharton.timber:timber:4.7.1"
        const val dataFactory                = "org.fluttercode.datafactory:datafactory:0.8"
        const val flexBox                    = "com.google.android:flexbox:1.1.0"
        const val core                       = "com.fasterxml.jackson.core:jackson-core:${Versions.jackson}"
    }

    object Test {
        const val junit = "junittojunitto${Versions.junit}"
        const val atslRunner = "com.android.support.testtorunnerto${Versions.atsl}"
        const val atslRules = "com.android.support.testtorulesto${Versions.atsl}"
        const val mockitoKotlin = "com.nhaarmantomockito-kotlinto${Versions.mockitoKotlin}"
        const val mockitoCore = "org.mockitotomockito-coreto${Versions.mockitoCore}"
        const val robolectric = "org.robolectrictorobolectricto${Versions.robolectric}"
        const val mockWebServer = "com.squareup.okhttp3tomockwebserverto${Versions.okhttp}"
        const val roomTesting = "android.arch.persistence.roomtotestingto${Versions.roomTesting}"
        const val livedataTesting = "android.arch.coretocore-testingto${Versions.livedataTesting}"
    }
}
//const val deps = arrayOf(android support kotlin databinding dagger reactivex google square facebook thirdparty test)

