
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import org.jetbrains.compose.resources.ExperimentalResourceApi
import tabs.Home.BirdsListTab
import tabs.Settings.SettingsScreen
import tabs.TabNavigationItem


@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    BirdAppTheme {
           TabNavigator(BirdsListTab){
               Scaffold(
                   modifier = Modifier.fillMaxSize(),
                   bottomBar = {
                       BottomNavigation {
                           TabNavigationItem(BirdsListTab)
                           TabNavigationItem(SettingsScreen)
                       }
                   },
                   content = { CurrentTab() }
               )
           }
    }
}

