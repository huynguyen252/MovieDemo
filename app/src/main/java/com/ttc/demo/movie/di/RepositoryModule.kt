package com.ttc.demo.movie.di

import com.ttc.demo.movie.data.api.ApiService
import com.ttc.demo.movie.data.repo.*
import org.koin.dsl.module

val repositoryModule = module {

    fun provideNewsFeedRepository(apiService: ApiService): NewsFeedRepoImpl {
        return NewsFeedRepoImpl(apiService)
    }

    fun provideUpcomRepository(apiService: ApiService): UpcomRepoImpl {
        return UpcomRepoImpl(apiService)
    }

    single { provideUpcomRepository(get()) }
    single { provideNewsFeedRepository(get()) }

}