package com.adrian.kotlin_gradle_example.secondscreen.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.adrian.kotlin_gradle_example.navigator.Navigator

class SecondScreenViewModelFactory(val navigator: Navigator) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(SecondScreenViewModel::class.java!!)) {
            SecondScreenViewModel(this.navigator) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }

}