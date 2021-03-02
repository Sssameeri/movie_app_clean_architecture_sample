package com.drewrick.domain.service

import com.drewrick.domain.models.Movie
import io.reactivex.Single

interface MovieService {

    fun getMovies(): Single<List<Movie>>

    fun insertMovies(movies: ArrayList<Movie>)

}