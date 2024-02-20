import Ui.screens.BirdDetailScreen
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun BirdImageCell(image :BirdImage){
    val navigator : Navigator = LocalNavigator.currentOrThrow
    KamelImage(
        resource = asyncPainterResource(data= "https://sebastianaigner.github.io/demo-image-api/${image.path}"),
        contentDescription = "${image.category} by ${image.author}",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxWidth().aspectRatio(1.0f).clickable {
            navigator.push(BirdDetailScreen(image))
        }
    )
}
