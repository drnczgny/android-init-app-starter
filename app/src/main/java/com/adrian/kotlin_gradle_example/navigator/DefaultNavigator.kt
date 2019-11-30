package com.adrian.kotlin_gradle_example.navigator

import com.adrian.kotlin_gradle_example.base.BaseScreen
import io.reactivex.Flowable
import io.reactivex.processors.BehaviorProcessor
import io.reactivex.processors.FlowableProcessor
import timber.log.Timber

class DefaultNavigator : Navigator {

    private val navigationProcessor: FlowableProcessor<NavigationEvent> = BehaviorProcessor.create()

//    private val screeMap = HashMap<>

    override fun navigateTo(screen: BaseScreen) {
        Timber.d("Navigate to ${screen.javaClass.simpleName}")

        val event = NavigationEvent(NavigationEventType.FORWARD, screen)
        navigationProcessor.onNext(event)
    }

    override fun navigateBack() {
        Timber.d("Navigate back")

        val event = NavigationEvent(NavigationEventType.BACK)
        navigationProcessor.onNext(event)
    }

    override fun navigateToHome() {
        Timber.d("Navigate home")

        val event = NavigationEvent(NavigationEventType.HOME)
        navigationProcessor.onNext(event)
    }

//    override fun getNavigator(): Flowable<BaseScreen> = navigationProcessor
    override fun getNavigator(): Flowable<NavigationEvent> = navigationProcessor
}
