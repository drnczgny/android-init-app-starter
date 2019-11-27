package com.adrian.kotlin_gradle_example.base

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.adrian.kotlin_gradle_example.R
import com.adrian.kotlin_gradle_example.main.MainFragment
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

    val screenMap = mapOf<KClass<out BaseScreen>, Fragment>(
        MainScreen::class to MainFragment.newInstance(),
        SecondScreen::class to SecondScreenFragment.newInstance()
    )

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        navigator.navigateTo(MainScreen())

        registerObservers()

    }

    private fun registerObservers() {
        navigator.getNavigator()
            .doOnNext { Timber.e("doOnNext") }
            .doOnComplete { Timber.e("doOnComplete") }
            .doOnError { Timber.e("doOnError") }
            .doOnSubscribe { Timber.e("doOnSubscribe") }
            .subscribe { screen -> navigateToFragment(screen) }
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
            .replace(R.id.container, fragment)
            .addToBackStack("323")
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

}