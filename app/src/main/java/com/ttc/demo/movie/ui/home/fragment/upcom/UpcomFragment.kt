package com.ttc.demo.movie.ui.home.fragment.upcom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ttc.demo.movie.R
import com.ttc.demo.movie.databinding.FragmentUpcomBinding
import com.ttc.demo.movie.ui.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class UpcomFragment : BaseFragment<FragmentUpcomBinding>() {
    override val layoutRes: Int = R.layout.fragment_upcom
    override val viewModel by viewModel<UpcomViewModel>()

    companion object {
        @JvmStatic
        fun getInstance(): UpcomFragment {
            return UpcomFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewDataBinding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        viewDataBinding.lifecycleOwner = this
        viewModel.getUpcom()
        return viewDataBinding.root
    }


    override fun initView() {

    }

    override fun initEvent() {

    }

    override fun observeData() {
        viewModel.item.observe(this, {

        })
    }

}

