package com.android.hyper.feature.chose_role

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.hyper.databinding.FragmentChoseRoleBinding
import com.android.hyper.feature.chose_role.transformer.ScaleSaturationTransformer

class ChoseRoleFragment : Fragment() {

    companion object {

        fun newInstance() = ChoseRoleFragment()
    }

    private lateinit var viewModel: ChoseRoleViewModel
    private lateinit var binding: FragmentChoseRoleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChoseRoleBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChoseRoleViewModel::class.java)
        binding.choseRoleVp.apply {
            offscreenPageLimit = 1
            adapter = Adapter()
            setPageTransformer(ScaleSaturationTransformer())
            (getChildAt(0) as RecyclerView).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        }
    }
}