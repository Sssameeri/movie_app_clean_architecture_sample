package com.drewrick.domain.repositories

import com.drewrick.domain.models.Movie
import io.reactivex.Single

const val SERVER = "SERVER"
const val DATABASE = "DATABASE"

interface Repository {
    fun getMovies(): Single<List<Movie>>
    fun getMoviesByPage(): Single<List<Movie>>
    fun insertMovies(moviesList: List<Movie>)
}