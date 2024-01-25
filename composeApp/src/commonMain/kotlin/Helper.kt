import org.koin.core.context.startKoin
import di.getViewModelByPlatform

fun initKoin(){
    startKoin {
        modules(appModule + getViewModelByPlatform())
    }
}