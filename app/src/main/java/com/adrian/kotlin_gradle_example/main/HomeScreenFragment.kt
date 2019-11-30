package com.adrian.kotlin_gradle_example.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.adrian.kotlin_gradle_example.R
import com.adrian.kotlin_gradle_example.base.BaseFragment
import com.adrian.kotlin_gradle_example.main.viewmodel.HomeScreenViewModel
import com.adrian.kotlin_gradle_example.main.viewmodel.HomeScreeViewModelFactory
import com.adrian.kotlin_gradle_example.navigator.Navigator
import com.adrian.kotlin_gradle_example.navigator.screen.SecondScreen
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_home_screen.*
import javax.inject.Inject

class HomeScreenFragment : BaseFragment() {

    companion object {
        fun newInstance() = HomeScreenFragment()
    }

    @Inject
    lateinit var homeScreeViewModelFactory: HomeScreeViewModelFactory

    @Inject
    lateinit var navigator: Navigator

    lateinit var homeScreenViewModel : HomeScreenViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         homeScreenViewModel =
            ViewModelProviders.of(this, homeScreeViewModelFactory).get(HomeScreenViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeScreenViewModel.test()

        secondScreenButton.setOnClickListener {
            navigator.navigateTo(SecondScreen())
        }
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}