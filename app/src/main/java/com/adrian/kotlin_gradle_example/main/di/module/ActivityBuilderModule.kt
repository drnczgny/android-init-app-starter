package com.adrian.kotlin_gradle_example.main.di.module

import com.adrian.kotlin_gradle_example.main.MainActivity
import com.adrian.kotlin_gradle_example.main.di.scope.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @PerActivity
    @ContributesAndroidInjector(
        modules = [
            FragmentBuilderModule::class
//            MainModule::class,
//            DashboardFragmentBuilderModule::class
//            Feature2FragmentBuilderModule::class
        ]
    )

    abstract fun bindMainActivity(): MainActivity
}