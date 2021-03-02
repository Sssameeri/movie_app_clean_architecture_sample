package com.drewrick.domain.models

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("results")
    val movies: List<Movie>,
)