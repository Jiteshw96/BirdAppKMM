package Ui.screens

import BirdImage
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import io.kamel.image.KamelImage
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import io.kamel.image.asyncPainterResource


data class BirdDetailScreen(val birdDetail:BirdImage) : Screen  {
    @Composable
    override fun Content() {
        Box(modifier = Modifier.fillMaxSize()){
            KamelImage(
                resource = asyncPainterResource("https://sebastianaigner.github.io/demo-image-api/${birdDetail.path}"),
                contentDescription = "${birdDetail.category}",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().aspectRatio(1.0f)
            )
        }
    }
}