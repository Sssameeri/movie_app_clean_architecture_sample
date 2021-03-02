package com.drewrick.movieapp.di

import androidx.lifecycle.ViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, RepositoryModule::class, ServiceModule::class, AppModule::class])
interface AppComponent {

    fun inject(viewModel: ViewModel)
}