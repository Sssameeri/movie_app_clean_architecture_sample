package com.drewrick.movieapp.di

import com.drewrick.data.repository.DatabaseRepositoryImp
import com.drewrick.data.repository.ServerRepositoryImp
import com.drewrick.domain.repositories.DATABASE
import com.drewrick.domain.repositories.Repository
import com.drewrick.domain.repositories.SERVER
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    @Named(SERVER)
    fun provideServerRepository(repository: ServerRepositoryImp): Repository =
        repository

    @Provides
    @Singleton
    @Named(DATABASE)
    fun provideDatabaseRepository(repository: DatabaseRepositoryImp): Repository =
        repository
}