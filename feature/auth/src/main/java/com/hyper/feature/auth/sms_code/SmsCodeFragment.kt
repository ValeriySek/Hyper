package com.hyper.feature.auth.sms_code

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hyper.feature.auth.R
import com.hyper.feature.auth.databinding.FragmentSmsCodeBinding
import com.hyper.interactor.auth.Authorization

class SmsCodeFragment : Fragment(R.layout.fragment_sms_code) {

    companion object {
        fun newInstance() = SmsCodeFragment()
    }

    private lateinit var binding: FragmentSmsCodeBinding

    private lateinit var viewModel: SmsCodeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSmsCodeBinding.inflate(inflater)
        return binding.root
    }

    private val onLogin: () -> Unit = {
        Log.i("TAGG", "onLogin")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SmsCodeViewModel::class.java)
        binding.smsNextBtn.setOnClickListener {
//            Authorization(requireActivity(), onLogin = onLogin).signInWithPhoneAuthCredential()
        }
    }

}