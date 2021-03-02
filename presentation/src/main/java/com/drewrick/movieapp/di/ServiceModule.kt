package com.drewrick.movieapp.di

import com.drewrick.domain.service.MovieService
import com.drewrick.domain.service.MovieServiceImp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ServiceModule {
    @Provides
    @Singleton
    fun provideMovieService(movieService: MovieServiceImp): MovieService = movieService
}