package com.ttc.demo.movie.ui.home.activity

import android.app.Application
import androidx.lifecycle.MutableLiveData

import com.ttc.demo.movie.data.repo.NewsFeedRepoImpl
import com.ttc.demo.movie.ui.base.BaseViewModel

class NewsFeedViewModel(
    application: Application,
    private val repository: NewsFeedRepoImpl
) : BaseViewModel(application) {
    override var errorMessage = MutableLiveData<String>()
}