package com.drewrick.movieapp.di

import androidx.room.Room
import com.drewrick.data.database.MovieDatabase
import com.drewrick.movieapp.App
import com.drewrick.movieapp.Utils
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule constructor(val app: App) {
    @Provides
    @Singleton
    fun provideApp(app: App) = app

    @Provides
    @Singleton
    fun provideDatabase() =
        Room.databaseBuilder(
            app,
            MovieDatabase::class.java,
            Utils.DATABASE_NAME
        ).build()

    @Provides
    @Singleton
    fun provideMovieDao(database: MovieDatabase) = database.getMovieDao()
}