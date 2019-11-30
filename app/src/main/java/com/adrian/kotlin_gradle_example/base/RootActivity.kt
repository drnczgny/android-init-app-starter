package com.adrian.kotlin_gradle_example.base

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.adrian.kotlin_gradle_example.R
import com.adrian.kotlin_gradle_example.main.HomeScreenFragment
import com.adrian.kotlin_gradle_example.navigator.NavigationEventType.*
import com.adrian.kotlin_gradle_example.navigator.Navigator
import com.adrian.kotlin_gradle_example.navigator.screen.MainScreen
import com.adrian.kotlin_gradle_example.navigator.screen.SecondScreen
import com.adrian.kotlin_gradle_example.secondscreen.view.SecondScreenFragment
import dagger.android.AndroidInjection
import io.reactivex.rxkotlin.addTo
import timber.log.Timber
import javax.inject.Inject
import kotlin.reflect.KClass

class RootActivity : BaseActivity() {

    @Inject
    lateinit var navigator: Navigator

    private val screenMap = createScreenMap()

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        registerObservers()

        navigator.navigateTo(MainScreen())

    }

    private fun registerObservers() {
        navigator.getNavigator()
            .doOnNext { Timber.d("doOnNext") }
            .doOnComplete { Timber.d("doOnComplete") }
            .doOnError { Timber.d("doOnError") }
            .doOnSubscribe { Timber.d("doOnSubscribe") }
            .subscribe { navigationEvent ->
                when (navigationEvent.type) {
                    FORWARD -> navigateToFragment(navigationEvent.targetScreen!!)
                    BACK -> navigateBack()
                    HOME -> navigateHome()
                }
            }
            .addTo(disposables)
    }

    private fun navigateToFragment(screen: BaseScreen) {

        val fragment =
            screenMap[screen::class] ?: throw IllegalStateException("Wrong screen command!")

        navigateToFragment(fragment, screen.javaClass.simpleName)
    }

    private fun navigateToFragment(fragment: Fragment, screenName: String = "screen") {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(screenName)
            .commit()
    }

    private fun navigateBack() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStackImmediate()
        } else {
            finish()
            // super.onBackPressed()
        }
    }

    private fun navigateHome() {
        val  fm = supportFragmentManager
        (0 until fm.backStackEntryCount)
            .forEach { _ -> fm.popBackStack(); }
    }

    private fun createScreenMap(): Map<KClass<out BaseScreen>, Fragment> {
        return mapOf<KClass<out BaseScreen>, Fragment>(
            MainScreen::class to HomeScreenFragment.newInstance(),
            SecondScreen::class to SecondScreenFragment.newInstance()
        )
    }
}
