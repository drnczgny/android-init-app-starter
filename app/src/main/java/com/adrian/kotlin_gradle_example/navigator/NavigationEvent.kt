package com.adrian.kotlin_gradle_example.navigator

import com.adrian.kotlin_gradle_example.base.BaseScreen

data class NavigationEvent (
    val type: NavigationEventType,
    val targetScreen: BaseScreen? = null
)
