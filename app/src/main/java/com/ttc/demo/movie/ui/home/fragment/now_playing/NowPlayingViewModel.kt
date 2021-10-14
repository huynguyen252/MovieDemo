package com.ttc.demo.movie.ui.home.fragment.now_playing

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.ttc.demo.movie.data.repo.UpcomRepoImpl
import com.ttc.demo.movie.ui.base.BaseViewModel

class NowPlayingViewModel(
    application: Application,
    private val repository: UpcomRepoImpl
) : BaseViewModel(application) {
    override var errorMessage = MutableLiveData<String>()

}