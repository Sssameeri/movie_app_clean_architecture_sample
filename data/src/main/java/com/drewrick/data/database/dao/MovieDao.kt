package com.drewrick.data.database.dao

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.drewrick.domain.models.Movie
import io.reactivex.Completable

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(movies: List<Movie>): Completable

    @Query("SELECT * FROM movie")
    fun getMovies(): DataSource.Factory<Int, Movie>

}