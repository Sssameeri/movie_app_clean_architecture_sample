package com.drewrick.data

import androidx.paging.PagedList
import com.drewrick.domain.models.Movie

class BoundaryCallback constructor() : PagedList.BoundaryCallback<Movie>() {

    override fun onZeroItemsLoaded() {
        super.onZeroItemsLoaded()
    }

    override fun onItemAtFrontLoaded(itemAtFront: Movie) {
        super.onItemAtFrontLoaded(itemAtFront)
    }

    override fun onItemAtEndLoaded(itemAtEnd: Movie) {
        super.onItemAtEndLoaded(itemAtEnd)
    }
}