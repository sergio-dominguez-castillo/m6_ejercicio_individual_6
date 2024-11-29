package cl.bootcamp.ejercicioindividual6.util

import cl.bootcamp.ejercicioindividual6.BuildConfig

class Constants {
    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val ENDPOINT = "movie/top_rated"
        const val API_KEY = BuildConfig.api_key
    }
}