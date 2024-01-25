import dev.icerock.moko.mvvm.viewmodel.ViewModel
import domain.BirdsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class BirdsViewModel(private val birdsRepository:BirdsRepository) : ViewModel() {
    
    private val _uiState : MutableStateFlow<BirdsUIState> = MutableStateFlow(BirdsUIState(emptyList()))
    val uiState:StateFlow<BirdsUIState> = _uiState.asStateFlow()
    
    init {
        println("viewmodel started")
    }
    fun updateImages(){
        viewModelScope.launch {
           val images =  getImages()
            _uiState.update {
                it.copy(images = images)
            }
        }
    }
    
    fun selectCategory(category : String){
        _uiState.update {state->
            if(state.selectedCategory == category){
                state.copy(selectedCategory = null)
            }else{
                state.copy(selectedCategory = category)
            }
        }
    }
    
    private suspend fun getImages():List<BirdImage> =
        birdsRepository.getBirdsImages()
    
}