package com.ttc.demo.movie.ui.home.fragment.upcom

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.ttc.demo.movie.utils.Constant
import com.ribisoft.gapodemo.utils.Utils
import com.ttc.demo.movie.data.model.Item
import com.ttc.demo.movie.data.repo.UpcomRepoImpl
import com.ttc.demo.movie.ui.base.BaseViewModel
import kotlinx.coroutines.launch

class UpcomViewModel(
    application: Application,
    private val repository: UpcomRepoImpl
) : BaseViewModel(application) {
    override var errorMessage = MutableLiveData<String>()
    var item = MutableLiveData<List<Item>>()

    fun getUpcom() {
        coroutineScope.launch {
            try {
                if (Utils.hasInternetConnection(getApplication())) {
                    val response = repository.getUpCom()
                    if (response.isSuccessful) {
                        response.body()?.items?.let {
                            item.postValue(it)
                            errorMessage.postValue(null)
                        }
                    } else {
                        errorMessage.postValue(response.message())
                    }
                } else {
                    errorMessage.postValue(Constant.NO_INTERNET)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}