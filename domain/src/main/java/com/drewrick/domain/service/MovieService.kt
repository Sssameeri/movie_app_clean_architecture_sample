package com.drewrick.domain.service

import androidx.paging.DataSource
import com.drewrick.domain.models.Movie
import io.reactivex.Single

interface MovieService {

    fun getMovies(): Single<List<Movie>>

    fun getMoviesByPage(): Single<List<Movie>>

    fun insertMovies(movies: ArrayList<Movie>)

    fun getMoviesFromDatabase(): DataSource.Factory<Int, Movie>

}