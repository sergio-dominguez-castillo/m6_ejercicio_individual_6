package cl.bootcamp.ejercicioindividual6.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(movies: Movies)

    @Query("SELECT * FROM movies")
    fun getAllMovies(): Flow<List<Movies>>
}