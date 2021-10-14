package com.ttc.demo.movie.data.api

import com.ttc.demo.movie.data.model.Item
import com.ttc.demo.movie.data.model.UpComResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("8748066c-be23-4ad1-854a-cbaa49718284")
    suspend fun getUpcom(): Response<UpComResponse>

}