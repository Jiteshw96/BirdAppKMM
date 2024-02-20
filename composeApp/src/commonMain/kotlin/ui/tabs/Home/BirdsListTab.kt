package tabs.Home


import BirdsPage
import BirdsViewModel
import Ui.screens.BirdDetailScreen
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import ui.screens.BirdListScreen

object BirdsListTab : Tab , KoinComponent {
    val birdsViewModel :BirdsViewModel by inject<BirdsViewModel>()
    @Composable
    override fun Content() {
       Navigator(screen = BirdListScreen())
    }

    override val options: TabOptions
        @Composable
        get()  {
            val title = "Home"
            val icon  = rememberVectorPainter(Icons.Default.Home)
            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }


}