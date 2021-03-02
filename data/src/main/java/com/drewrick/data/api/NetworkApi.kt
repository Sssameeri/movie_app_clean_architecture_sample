package com.drewrick.data.api

import com.drewrick.domain.models.Movie
import com.drewrick.domain.models.Response
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkApi {

    @GET("discover/movie")
    fun getMoviesList(
        @Query("api_key") key: String
    ): Single<Response>

    @GET("/discover/movie")
    fun getMoviesListByPage(
        @Query("api_key") key: String,
        @Query("page") page: Long
    ): Single<Movie>

}