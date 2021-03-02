package com.drewrick.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.drewrick.data.database.dao.MovieDao
import com.drewrick.domain.models.Movie

@Database(entities = [Movie::class], version = 1)
abstract class MovieDatabase : RoomDatabase() {
    abstract fun getMovieDao(): MovieDao
}