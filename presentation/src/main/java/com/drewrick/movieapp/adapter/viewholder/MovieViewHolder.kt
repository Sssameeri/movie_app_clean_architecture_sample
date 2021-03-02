package com.drewrick.movieapp.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.drewrick.domain.models.Movie
import com.drewrick.movieapp.databinding.MovieItemBinding

class MovieViewHolder(private val itemBinding: MovieItemBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(movie: Movie) {
        itemBinding.movie = movie
        itemBinding.executePendingBindings()
    }

}