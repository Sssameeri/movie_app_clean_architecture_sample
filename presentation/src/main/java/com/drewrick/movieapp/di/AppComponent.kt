package com.drewrick.movieapp.di

import com.drewrick.movieapp.activity.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, RepositoryModule::class, ServiceModule::class, AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}