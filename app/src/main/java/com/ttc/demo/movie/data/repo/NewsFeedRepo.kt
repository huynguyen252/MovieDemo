package com.ttc.demo.movie.data.repo

import com.ttc.demo.movie.data.api.ApiService
import com.ttc.demo.movie.data.model.UpComResponse
import retrofit2.Response

interface NewsFeedRepo {
    suspend fun getNewsFeed(): Response<UpComResponse>
}

class NewsFeedRepoImpl(private val api: ApiService) : NewsFeedRepo {

    override suspend fun getNewsFeed(): Response<UpComResponse> {
        return api.getUpcom()
    }

}