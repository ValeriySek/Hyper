package com.hyper.feature.auth.auth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hyper.feature.auth.R
import com.hyper.feature.auth.databinding.FragmentAuthBinding


class AuthFragment : Fragment(R.layout.fragment_auth) {

    private lateinit var viewModel: AuthViewModel
    private lateinit var binding: FragmentAuthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.authLoginBySms.setOnClickListener {
            findNavController().navigate(R.id.action_auth_fragment_to_login_by_sms_fragment)
        }
        viewModel = ViewModelProvider(this)[AuthViewModel::class.java]
    }

}