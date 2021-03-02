package com.drewrick.movieapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import androidx.paging.toLiveData
import com.drewrick.domain.models.Movie
import com.drewrick.domain.service.MovieServiceImp
import javax.inject.Inject

class MovieViewModel : ViewModel() {

    @Inject
    lateinit var movieService: MovieServiceImp

    fun getMovies(): LiveData<PagedList<Movie>> {
        val pagedListConfig = PagedList.Config.Builder()
            .build()

        return movieService.getMoviesFromDatabase().toLiveData(pagedListConfig)
    }
}