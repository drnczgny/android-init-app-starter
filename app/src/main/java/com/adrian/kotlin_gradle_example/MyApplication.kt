package com.adrian.kotlin_gradle_example

import com.adrian.kotlin_gradle_example.main.di.DaggerApplicationComponent
import com.facebook.stetho.Stetho
import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

class MyApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().application(this).build()
    }

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        Stetho.initializeWithDefaults(this)

        AndroidThreeTen.init(this)
    }
}
