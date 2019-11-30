package com.adrian.kotlin_gradle_example.base.di.module

import com.adrian.kotlin_gradle_example.main.HomeScreenFragment
import com.adrian.kotlin_gradle_example.base.scope.PerFragment
import com.adrian.kotlin_gradle_example.main.di.MainFragmentModule
import com.adrian.kotlin_gradle_example.secondscreen.di.module.SecondScreenFragmentModule
import com.adrian.kotlin_gradle_example.secondscreen.view.SecondScreenFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @PerFragment
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    internal abstract fun bindMainFragment(): HomeScreenFragment

    @PerFragment
    @ContributesAndroidInjector(modules = [SecondScreenFragmentModule::class])
    internal abstract fun bindSecondScreenFragment(): SecondScreenFragment

}