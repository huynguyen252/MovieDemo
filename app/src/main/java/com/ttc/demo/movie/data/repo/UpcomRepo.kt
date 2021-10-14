package com.ttc.demo.movie.data.repo

import com.ttc.demo.movie.data.api.ApiService
import com.ttc.demo.movie.data.model.UpComResponse
import retrofit2.Response

interface UpcomRepo {
    suspend fun getUpCom(): Response<UpComResponse>
}

class UpcomRepoImpl(private val api: ApiService) : UpcomRepo {

    override suspend fun getUpCom(): Response<UpComResponse> {
        return api.getUpcom()
    }

}