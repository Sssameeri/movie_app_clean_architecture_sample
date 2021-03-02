package com.drewrick.data.paging

import androidx.paging.PagedList
import com.drewrick.domain.models.Movie
import com.drewrick.domain.service.MovieService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class BoundaryCallback @Inject constructor(
    val movieService: MovieService
) : PagedList.BoundaryCallback<Movie>() {

    override fun onZeroItemsLoaded() {
        super.onZeroItemsLoaded()
        movieService.getMovies()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe()
    }

    override fun onItemAtFrontLoaded(itemAtFront: Movie) {
        super.onItemAtFrontLoaded(itemAtFront)
    }

    override fun onItemAtEndLoaded(itemAtEnd: Movie) {
        super.onItemAtEndLoaded(itemAtEnd)
    }
}