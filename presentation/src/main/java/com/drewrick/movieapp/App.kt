package com.drewrick.movieapp

import android.app.Application
import com.drewrick.movieapp.di.*

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .networkModule(NetworkModule(),)
            .repositoryModule(RepositoryModule())
            .serviceModule(ServiceModule())
            .build()
    }
}