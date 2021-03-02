package com.drewrick.data.repository

import com.drewrick.data.database.dao.MovieDao
import com.drewrick.domain.models.Movie
import com.drewrick.domain.repositories.Repository
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class DatabaseRepositoryImp @Inject constructor(
    val movieDao: MovieDao
) : Repository {
    override fun getMovies(): Single<List<Movie>> {
        TODO("Not yet implemented")
    }

    override fun getMoviesByPage(): Single<List<Movie>> {
        TODO("Not yet implemented")
    }

    override fun insertMovies(moviesList: List<Movie>) {
        movieDao.insert(moviesList)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe()
    }
}