package com.ttc.demo.movie.ui.home.activity

import com.ttc.demo.movie.R
import com.ttc.demo.movie.databinding.ActivityNewsfeedBinding
import com.ttc.demo.movie.ui.base.BaseActivity
import com.ttc.demo.movie.ui.home.fragment.now_playing.NowPlayingFragment
import com.ttc.demo.movie.ui.home.fragment.popular.PopularFragment
import com.ttc.demo.movie.ui.home.fragment.toprate.TopRateFragment
import com.ttc.demo.movie.ui.home.fragment.upcom.UpcomFragment
import org.koin.android.viewmodel.ext.android.viewModel

class NewsfeedActivity : BaseActivity<ActivityNewsfeedBinding>() {

    override val layoutRes: Int = R.layout.activity_newsfeed
    override val viewModel by viewModel<NewsFeedViewModel>()

    private lateinit var adapter: NewsFeedPagerAdapter

    override fun initView() {
        adapter = NewsFeedPagerAdapter(supportFragmentManager)
        adapter.addFrag(UpcomFragment.getInstance(), "Upcoming")
        adapter.addFrag(TopRateFragment.getInstance(), "Top Rated")
        adapter.addFrag(PopularFragment.getInstance(), "Popular")
        adapter.addFrag(NowPlayingFragment.getInstance(), "Now Playing")
        viewDataBinding.vpNewsfeed.adapter = adapter
        viewDataBinding.vpNewsfeed.setNavigation(
            viewDataBinding.bnvNewsFeed
        ) { item ->
            when (item.itemId) {
                R.id.navigation_upcoming -> {
                    viewDataBinding.vpNewsfeed.currentItem = 0
                }
                R.id.navigation_toprate -> {
                    viewDataBinding.vpNewsfeed.currentItem = 1
                }
                R.id.navigation_popular -> {
                    viewDataBinding.vpNewsfeed.currentItem = 2
                }
                R.id.navigation_now_playing -> {
                    viewDataBinding.vpNewsfeed.currentItem = 3
                }
            }
            true
        }
        viewDataBinding.activity = this
        viewDataBinding.viewModel = viewModel
    }

    override fun initEvent() {

    }

    override fun observeData() {

    }

    override fun onBack() {
        finish()
    }

}
