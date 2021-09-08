package com.hyper.feature.auth.login_by_sms

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hyper.feature.auth.R
import com.hyper.feature.auth.databinding.FragmentLoginBySmsBinding
import com.hyper.interactor.auth.Authorization
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

@AndroidEntryPoint
class LoginBySmsFragment : Fragment(R.layout.fragment_login_by_sms) {

    companion object {

        fun newInstance() = LoginBySmsFragment()
    }

    @Inject lateinit var authorization: Authorization

    private lateinit var binding: FragmentLoginBySmsBinding

    private lateinit var viewModel: LoginBySmsViewModel

    private val onCodeSent: (String) -> Unit = {
        findNavController().navigate(R.id.action_login_by_sms_fragment_to_sms_code_fragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBySmsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewModel = ViewModelProvider(this).get(LoginBySmsViewModel::class.java)
        binding.loginNextBtn.setOnClickListener {
            authorization.startPhoneNumberVerification(binding.loginPhoneIet.text.toString())
            authorization.onCodeSent = onCodeSent
//            findNavController().navigate(R.id.action_login_by_sms_fragment_to_sms_code_fragment)
        }
    }

}