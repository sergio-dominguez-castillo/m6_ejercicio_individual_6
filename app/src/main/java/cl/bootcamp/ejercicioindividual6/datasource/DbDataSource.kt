package cl.bootcamp.ejercicioindividual6.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import cl.bootcamp.ejercicioindividual6.model.MovieDao
import cl.bootcamp.ejercicioindividual6.model.Movies

@Database(entities = [Movies::class], version = 1)
abstract class DbDataSource: RoomDatabase() {
    abstract fun movieDao(): MovieDao
}