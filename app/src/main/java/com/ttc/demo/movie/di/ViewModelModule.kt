package com.ttc.demo.movie.di

import com.ttc.demo.movie.ui.home.activity.NewsFeedViewModel
import com.ttc.demo.movie.ui.home.fragment.upcom.UpcomViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        NewsFeedViewModel(get(), get())
    }
    viewModel {
        UpcomViewModel(get(), get())
    }
}
