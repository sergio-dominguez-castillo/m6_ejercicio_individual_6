package cl.bootcamp.ejercicioindividual6.datasource

import cl.bootcamp.ejercicioindividual6.model.Movie
import cl.bootcamp.ejercicioindividual6.util.Constants.Companion.ENDPOINT
import retrofit2.http.GET


interface RestDataSource {
    @GET(ENDPOINT)
    suspend fun getMovie(): List<Movie>

}