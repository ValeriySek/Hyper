package com.hyper.feature.auth.splash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hyper.feature.auth.R
import com.hyper.interactor.auth.Authorization

class SplashFragment : Fragment() {

    companion object {
        fun newInstance() = SplashFragment()
    }

    private lateinit var viewModel: SplashViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("TAGG", "${Authorization(requireActivity()).isAuthorized()}")
        if(!Authorization(requireActivity()).isAuthorized()) {
            findNavController().navigate(R.id.action_splash_fragment_to_auth_fragment)
        }
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[SplashViewModel::class.java]
        // TODO: Use the ViewModel
    }

}