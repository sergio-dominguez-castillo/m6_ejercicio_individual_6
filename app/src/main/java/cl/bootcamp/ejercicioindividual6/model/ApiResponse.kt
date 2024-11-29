package cl.bootcamp.ejercicioindividual6.model

data class ApiResponse(val results: ArrayList<Movie>)

data class Movie(
    val id: Int,
    val original_title: String,
    val poster_path: String,
    val release_date: String,
    val vote_average: Float
)
