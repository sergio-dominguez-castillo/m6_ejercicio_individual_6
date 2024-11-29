package cl.bootcamp.ejercicioindividual6.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.bootcamp.ejercicioindividual6.model.MovieState
import cl.bootcamp.ejercicioindividual6.model.Movies
import cl.bootcamp.ejercicioindividual6.repository.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val repo: MoviesRepository
) : ViewModel() {
    var state by mutableStateOf(MovieState())
        private set

    val movies: Flow<List<Movies>> by lazy {
        repo.getAllMovies()
    }

    init {
        getAllAPI()
    }

    private fun getAllAPI() {
        viewModelScope.launch(Dispatchers.IO) {
            repo.getAllMovie()
        }
    }

    fun cleanState() {
        state = state.copy(
            original_title = "",
            poster_path = "",
            release_date = "",
            vote_average = 0.0F
        )
    }


}