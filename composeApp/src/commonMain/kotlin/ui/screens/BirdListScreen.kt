package ui.screens

import BirdsPage
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.screen.Screen
import org.koin.core.component.KoinComponent
import tabs.Home.BirdsListTab.birdsViewModel


class BirdListScreen  : Screen, KoinComponent {
   @Composable
    override fun Content() {
        val uiState by birdsViewModel.uiState.collectAsState()
        LaunchedEffect(birdsViewModel){
            birdsViewModel.updateImages()
        }
        BirdsPage(uiState, onSelectedCategory = { birdsViewModel.selectCategory(it)})
    }
    
}