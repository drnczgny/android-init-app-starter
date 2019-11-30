package com.adrian.kotlin_gradle_example.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.adrian.kotlin_gradle_example.navigator.Navigator

class HomeScreeViewModelFactory(val navigator: Navigator) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(HomeScreenViewModel::class.java!!)) {
            HomeScreenViewModel(this.navigator) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }

}