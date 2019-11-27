package com.adrian.kotlin_gradle_example.main.di

import com.adrian.kotlin_gradle_example.base.scope.PerFragment
import com.adrian.kotlin_gradle_example.main.viewmodel.MainViewModelFactory
import com.adrian.kotlin_gradle_example.navigator.Navigator
import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule {

    @Provides
    @PerFragment
    fun provideMainViewModeFactory(): MainViewModelFactory {
        return MainViewModelFactory()
    }
}