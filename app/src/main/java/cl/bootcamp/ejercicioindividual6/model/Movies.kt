package cl.bootcamp.ejercicioindividual6.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class Movies(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "original_title") val original_title: String,
    @ColumnInfo(name = "poster_path") val poster_path: String,
    @ColumnInfo(name = "release_date") val release_date: String,
    @ColumnInfo(name = "vote_average") val vote_average: Float
)
