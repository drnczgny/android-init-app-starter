package com.adrian.kotlin_gradle_example.main.di.module

import com.adrian.kotlin_gradle_example.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(myApplication: MyApplication) = myApplication

}