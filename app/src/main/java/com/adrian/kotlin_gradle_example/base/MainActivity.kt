package com.adrian.kotlin_gradle_example.base

import android.annotation.SuppressLint
import android.os.Bundle
import com.adrian.kotlin_gradle_example.R
import com.adrian.kotlin_gradle_example.main.MainFragment
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity


class MainActivity : DaggerAppCompatActivity() {

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        addFragment()


    }

    private fun addFragment() {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.add(R.id.container,
            MainFragment.newInstance()
        )
        transaction.commit()
    }
}