package com.drewrick.domain.repositories

import androidx.paging.DataSource
import com.drewrick.domain.models.Movie
import io.reactivex.Single

const val SERVER = "SERVER"
const val DATABASE = "DATABASE"

interface Repository {
    fun getMovies(): Single<List<Movie>>
    fun getMoviesByPage(page: Long): Single<List<Movie>>
    fun insertMovies(moviesList: List<Movie>)
    fun getMoviesFromDatabase(): DataSource.Factory<Int, Movie>
}