package com.adrian.kotlin_gradle_example.base.di.module

import com.adrian.kotlin_gradle_example.MyApplication
import com.adrian.kotlin_gradle_example.navigator.DefaultNavigator
import com.adrian.kotlin_gradle_example.navigator.Navigator
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(myApplication: MyApplication) = myApplication

    @Singleton
    @Provides
    fun provideDefaultNavigator(): Navigator = DefaultNavigator()

}