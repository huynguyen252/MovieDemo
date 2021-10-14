package com.ttc.demo.movie.ui.home.fragment.popular

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ttc.demo.movie.R
import com.ttc.demo.movie.databinding.FragmentPopularBinding
import com.ttc.demo.movie.databinding.FragmentUpcomBinding
import com.ttc.demo.movie.ui.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class PopularFragment : BaseFragment<FragmentPopularBinding>() {
    override val layoutRes: Int = R.layout.fragment_popular
    override val viewModel by viewModel<PopularViewModel>()

    companion object {
        @JvmStatic
        fun getInstance(): PopularFragment {
            return PopularFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewDataBinding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        viewDataBinding.lifecycleOwner = this
        return viewDataBinding.root
    }


    override fun initView() {

    }

    override fun initEvent() {

    }

    override fun observeData() {

    }

}

