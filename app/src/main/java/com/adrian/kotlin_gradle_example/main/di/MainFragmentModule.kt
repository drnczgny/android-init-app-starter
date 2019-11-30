package com.adrian.kotlin_gradle_example.main.di

import com.adrian.kotlin_gradle_example.base.scope.PerFragment
import com.adrian.kotlin_gradle_example.main.viewmodel.HomeScreeViewModelFactory
import com.adrian.kotlin_gradle_example.navigator.Navigator
import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule {

    @Provides
    @PerFragment
    fun provideMainViewModeFactory(navigator: Navigator): HomeScreeViewModelFactory {
        return HomeScreeViewModelFactory(navigator)
    }
}