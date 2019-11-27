package com.adrian.kotlin_gradle_example.base

import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.disposables.CompositeDisposable

open class BaseActivity : DaggerAppCompatActivity() {

    val disposables = CompositeDisposable()
}