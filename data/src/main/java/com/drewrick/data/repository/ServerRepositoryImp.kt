package com.drewrick.data.repository

import com.drewrick.data.BuildConfig
import com.drewrick.data.api.NetworkApi
import com.drewrick.domain.models.Movie
import com.drewrick.domain.repositories.Repository
import io.reactivex.Single
import javax.inject.Inject

class ServerRepositoryImp @Inject constructor(
    val networkApi: NetworkApi
) : Repository {

    override fun getMovies(): Single<List<Movie>> {
        return networkApi.getMoviesList(BuildConfig.API_KEY)
            .map { response -> response.movies }
    }

    override fun getMoviesByPage(): Single<List<Movie>> {
        TODO("Not yet implemented")
    }

    override fun insertMovies(moviesList: List<Movie>) {
    }

}