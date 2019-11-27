package com.adrian.kotlin_gradle_example.secondscreen.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.adrian.kotlin_gradle_example.R
import com.adrian.kotlin_gradle_example.base.BaseFragment
import com.adrian.kotlin_gradle_example.navigator.Navigator
import com.adrian.kotlin_gradle_example.secondscreen.viewmodel.SecondScreenViewModel
import com.adrian.kotlin_gradle_example.secondscreen.viewmodel.SecondScreenViewModelFactory
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class SecondScreenFragment : BaseFragment() {
    companion object {
        fun newInstance() = SecondScreenFragment()
    }

    @Inject
    lateinit var secondScreenViewModelFactory: SecondScreenViewModelFactory

    @Inject
    lateinit var navigator: Navigator

    lateinit var secondScreenViewModel : SecondScreenViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        secondScreenViewModel =
            ViewModelProviders.of(this, secondScreenViewModelFactory).get(SecondScreenViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        secondScreenViewModel.testSecondScreenViewModel()

    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
