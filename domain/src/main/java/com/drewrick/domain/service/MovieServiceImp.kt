package com.drewrick.domain.service

import androidx.paging.DataSource
import com.drewrick.domain.models.Movie
import com.drewrick.domain.repositories.DATABASE
import com.drewrick.domain.repositories.Repository
import com.drewrick.domain.repositories.SERVER
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Named

class MovieServiceImp @Inject constructor(
    @Named(SERVER)
    val serverRepository: Repository,
    @Named(DATABASE)
    val databaseRepository: Repository
) : MovieService {

    override fun getMovies(): Single<List<Movie>> {
        return serverRepository.getMovies()
            .doOnSuccess {
                databaseRepository.insertMovies(it)
            }
    }

    override fun getMoviesByPage(): Single<List<Movie>> {
        TODO("Not yet implemented")
    }

    override fun insertMovies(movies: ArrayList<Movie>) {
        databaseRepository.insertMovies(movies)
    }

    override fun getMoviesFromDatabase(): DataSource.Factory<Int, Movie> {
        return databaseRepository.getMoviesFromDatabase()
    }


}