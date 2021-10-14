package com.ttc.demo.movie.di

import com.ttc.demo.movie.data.api.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    fun provideUseApi(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    single { provideUseApi(get()) }
}