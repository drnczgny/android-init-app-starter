package com.adrian.kotlin_gradle_example.navigator

import com.adrian.kotlin_gradle_example.base.BaseScreen

interface Navigator {

    fun navigateTo(screen: BaseScreen)

    fun navigateBack()

    fun navigateToHome()
}