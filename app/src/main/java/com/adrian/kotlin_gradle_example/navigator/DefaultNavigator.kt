package com.adrian.kotlin_gradle_example.navigator

import com.adrian.kotlin_gradle_example.base.BaseScreen
import io.reactivex.Flowable
import io.reactivex.processors.BehaviorProcessor
import io.reactivex.processors.FlowableProcessor
import timber.log.Timber

class DefaultNavigator : Navigator {

    private val navigationProcessor: FlowableProcessor<BaseScreen> = BehaviorProcessor.create()

//    private val screeMap = HashMap<>

    override fun navigateTo(screen: BaseScreen) {
        Timber.d("Navigate to ${screen.javaClass.simpleName}")

        navigationProcessor.onNext(screen)

//        when (screen) {
//            is MainScreen -> {
//                navigationProcessor.onNext(screen)
//            }
//            is SecondScreen -> {
//                navigationProcessor.onNext(screen)
//            }
//            else -> {
//                throw IllegalStateException("Wrong case...!!!")
//            }
//        }
    }

    override fun navigateBack() {
        Timber.d("Navigate back")
    }

    override fun navigateToHome() {
        Timber.d("Navigate home")
    }

    override fun getNavigator(): Flowable<BaseScreen> = navigationProcessor
}
