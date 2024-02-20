import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BirdsPage(uiState: BirdsUIState, onSelectedCategory: (String) -> Unit) {

    Column {
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier.fillMaxWidth().padding(horizontal = 5.dp)
        ) {
            for (category in uiState.categories) {

                Button(
                    onClick = { onSelectedCategory(category) },
                    modifier = Modifier.aspectRatio(1.0f).weight(1.0f)
                ) {
                    Text(category)
                }

            }
        }

        AnimatedVisibility(visible = uiState.selectedImages.isNotEmpty()) {
            LazyVerticalGrid(
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalArrangement = Arrangement.spacedBy(5.dp),
                columns = GridCells.Adaptive(120.dp),
                modifier = Modifier.fillMaxSize().padding(horizontal = 5.dp)
            ) {
                items(uiState.selectedImages) { image ->
                    
                    BirdImageCell(image)
                }

            }
        }
    }

}

