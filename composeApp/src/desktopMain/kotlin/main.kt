import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import di.getViewModelByPlatform
import org.koin.core.context.startKoin


fun main() = application {
    startKoin {
        modules(appModule + getViewModelByPlatform())
    }
    Window(onCloseRequest = ::exitApplication, title = "ComposeProject") {
        App()
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App()
}