package tabs

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator


@Composable
fun RowScope.TabNavigationItem(item: Tab){
    val tabNavigator : TabNavigator = LocalTabNavigator.current
    
    BottomNavigationItem(
        selected = tabNavigator.current == item,
        onClick = { tabNavigator.current = item},
        icon = {
            item.options.icon?.let { icon->
                Icon(
                    painter = icon,
                    contentDescription = item.options.title
                )
            }
        },
        label = {
            Text(
                text = item.options.title
            )
        }
        
    )
    
}