package com.adrian.kotlin_gradle_example.main.viewmodel

import com.adrian.kotlin_gradle_example.base.BaseViewModel
import com.adrian.kotlin_gradle_example.navigator.Navigator
import timber.log.Timber

class HomeScreenViewModel constructor(val navigator: Navigator) : BaseViewModel() {

    fun test() {
        Timber.e("test")
    }


}

