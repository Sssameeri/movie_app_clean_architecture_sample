package com.drewrick.data.repository

import androidx.paging.DataSource
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

    override fun getMoviesByPage(page: Long): Single<List<Movie>> {
        return networkApi.getMoviesListByPage(BuildConfig.API_KEY, page)
            .map { response -> response.movies }
    }

    override fun insertMovies(moviesList: List<Movie>) {
        //do nothing
    }

    override fun getMoviesFromDatabase(): DataSource.Factory<Int, Movie> {
        TODO("Not yet implemented")
    }

}