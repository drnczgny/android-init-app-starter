package com.adrian.kotlin_gradle_example.base.di.module

import com.adrian.kotlin_gradle_example.base.MainActivity
import com.adrian.kotlin_gradle_example.base.scope.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @PerActivity
    @ContributesAndroidInjector(
        modules = [
            FragmentBuilderModule::class
//            DashboardFragmentBuilderModule::class
//            Feature2FragmentBuilderModule::class
        ]
    )

    abstract fun bindMainActivity(): MainActivity
}