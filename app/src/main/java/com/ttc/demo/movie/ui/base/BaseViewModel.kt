package com.ttc.demo.movie.ui.base

import android.app.Application
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import retrofit2.Response

/**
 * Created by HuyNguyenCao on 3/15/2021.
 */
abstract class BaseViewModel(application: Application) : AndroidViewModel(application) {
    val coroutineScope = CoroutineScope(Dispatchers.IO)
    abstract var errorMessage:MutableLiveData<String>

    override fun onCleared() {
        super.onCleared()
        coroutineScope.cancel()
    }

}