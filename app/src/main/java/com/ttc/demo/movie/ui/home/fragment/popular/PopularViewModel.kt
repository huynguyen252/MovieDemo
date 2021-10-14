package com.ttc.demo.movie.ui.home.fragment.popular

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.ttc.demo.movie.data.repo.UpcomRepoImpl
import com.ttc.demo.movie.ui.base.BaseViewModel

class PopularViewModel(
    application: Application,
    private val repository: UpcomRepoImpl
) : BaseViewModel(application) {
    override var errorMessage = MutableLiveData<String>()
}