package com.ttc.demo.movie.app

import android.app.Application
import com.ttc.demo.movie.di.apiModule
import com.ttc.demo.movie.di.repositoryModule
import com.ttc.demo.movie.di.viewModelModule
import com.ttc.demo.movie.di.retrofitModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //Koin
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                retrofitModule,
                repositoryModule,
                viewModelModule,
                apiModule
            )
        }
    }

}