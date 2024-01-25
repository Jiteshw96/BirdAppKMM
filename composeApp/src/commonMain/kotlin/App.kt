
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import data.repository.BirdsReposirotyImp
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import org.koin.core.component.inject
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication


@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    BirdAppTheme {
            val birdsViewModel :BirdsViewModel = getViewModel(Unit, viewModelFactory { BirdsViewModel(BirdsReposirotyImp()) })
            val uiState by birdsViewModel.uiState.collectAsState()
            LaunchedEffect(birdsViewModel){
                birdsViewModel.updateImages()
            }
            BirdsPage(uiState, onSelectedCategory = { birdsViewModel.selectCategory(it)})
    }
}