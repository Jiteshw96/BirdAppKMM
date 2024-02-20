package tabs.Settings

import androidx.compose.foundation.layout.fillMaxSize
import cafe.adriel.voyager.navigator.tab.Tab
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.TabOptions

object SettingsScreen : Tab {
    @Composable
    override fun Content() {
        Box(
            modifier = Modifier.fillMaxSize()
        ){
            Text("Settings Screen")
        }
    }
   override val options: TabOptions
    @Composable
    get()  {
        val title = "Settings"
        val icon  = rememberVectorPainter(Icons.Default.Settings)
        return remember {
            TabOptions(
                index = 0u,
                title = title,
                icon = icon
            )
        }
    }
}