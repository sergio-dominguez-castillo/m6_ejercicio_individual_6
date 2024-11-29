package cl.bootcamp.ejercicioindividual6.repository

import cl.bootcamp.ejercicioindividual6.datasource.RestDataSource
import cl.bootcamp.ejercicioindividual6.model.Movie
import cl.bootcamp.ejercicioindividual6.model.MovieDao
import cl.bootcamp.ejercicioindividual6.model.Movies
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface MoviesRepository {
    suspend fun getAllMovie(): ArrayList<Movie>
    fun getAllMovies(): Flow<List<Movies>>
}

class MoviesRepositoryImp @Inject constructor(
    private val dataSource: RestDataSource,
    private val movieDao: MovieDao
) : MoviesRepository {

    override suspend fun getAllMovie(): ArrayList<Movie> {
        val datos = dataSource.getMovie()
        datos.forEach {
            val movie = Movies(
                it.id,
                it.original_title,
                it.poster_path,
                it.release_date,
                it.vote_average
            )
            movieDao.insert(movie)
        }
        return ArrayList(datos)
    }


    override fun getAllMovies(): Flow<List<Movies>> = movieDao.getAllMovies()

}