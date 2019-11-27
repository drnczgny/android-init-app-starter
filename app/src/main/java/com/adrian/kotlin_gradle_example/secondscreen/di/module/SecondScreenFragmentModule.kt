package com.adrian.kotlin_gradle_example.secondscreen.di.module

import com.adrian.kotlin_gradle_example.base.scope.PerFragment
import com.adrian.kotlin_gradle_example.main.viewmodel.MainViewModelFactory
import com.adrian.kotlin_gradle_example.navigator.Navigator
import com.adrian.kotlin_gradle_example.secondscreen.viewmodel.SecondScreenViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class SecondScreenFragmentModule {

    @Provides
    @PerFragment
    fun provideMainViewModeFactory(navigator: Navigator): SecondScreenViewModelFactory {
        return SecondScreenViewModelFactory(navigator)
    }
}