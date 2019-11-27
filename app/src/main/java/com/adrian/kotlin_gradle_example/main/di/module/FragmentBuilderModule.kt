package com.adrian.kotlin_gradle_example.main.di.module

import com.adrian.kotlin_gradle_example.main.MainFragment
import com.adrian.kotlin_gradle_example.main.di.scope.PerFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @PerFragment
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    internal abstract fun bindMainFragment(): MainFragment

}