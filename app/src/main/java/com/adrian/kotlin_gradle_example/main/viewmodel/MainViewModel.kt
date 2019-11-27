package com.adrian.kotlin_gradle_example.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.adrian.kotlin_gradle_example.base.BaseViewModel
import com.adrian.kotlin_gradle_example.navigator.Navigator
import timber.log.Timber
import javax.inject.Inject

class MainViewModel constructor() : BaseViewModel() {

    fun test() {
        Timber.e("test")
    }

}

