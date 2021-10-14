package com.ttc.demo.movie.ui.home.fragment.now_playing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ttc.demo.movie.R
import com.ttc.demo.movie.databinding.FragmentNowPlayingBinding
import com.ttc.demo.movie.databinding.FragmentUpcomBinding
import com.ttc.demo.movie.ui.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class NowPlayingFragment : BaseFragment<FragmentNowPlayingBinding>() {
    override val layoutRes: Int = R.layout.fragment_now_playing
    override val viewModel by viewModel<NowPlayingViewModel>()

    companion object {
        @JvmStatic
        fun getInstance(): NowPlayingFragment {
            return NowPlayingFragment()
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

