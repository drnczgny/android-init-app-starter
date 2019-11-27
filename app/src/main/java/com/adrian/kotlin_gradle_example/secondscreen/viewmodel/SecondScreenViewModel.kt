package com.adrian.kotlin_gradle_example.secondscreen.viewmodel

import com.adrian.kotlin_gradle_example.base.BaseViewModel
import com.adrian.kotlin_gradle_example.navigator.Navigator
import timber.log.Timber

class SecondScreenViewModel(val navigator: Navigator) : BaseViewModel() {

    fun testSecondScreenViewModel() {
        Timber.e("test")
    }
}