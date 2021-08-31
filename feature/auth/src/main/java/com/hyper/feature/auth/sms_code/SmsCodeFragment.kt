package com.hyper.feature.auth.sms_code

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hyper.feature.auth.R

class SmsCodeFragment : Fragment() {

    companion object {
        fun newInstance() = SmsCodeFragment()
    }

    private lateinit var viewModel: SmsCodeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sms_code, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SmsCodeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}