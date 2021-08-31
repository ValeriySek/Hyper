package com.hyper.feature.auth.login_by_sms

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hyper.feature.auth.R

class LoginBySmsFragment : Fragment() {

    companion object {
        fun newInstance() = LoginBySmsFragment()
    }

    private lateinit var viewModel: LoginBySmsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login_by_sms, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginBySmsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}