package com.adrian.kotlin_gradle_example.main.di

import com.adrian.kotlin_gradle_example.MyApplication
import com.adrian.kotlin_gradle_example.main.di.module.ActivityBuilderModule
import com.adrian.kotlin_gradle_example.main.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: MyApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(myApplication: MyApplication): Builder

        fun build(): ApplicationComponent
    }
}