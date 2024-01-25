package di

import BirdsViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.module.Module
import org.koin.dsl.module
import org.koin.core.component.get
actual fun getViewModelByPlatform():Module = module {
    factory {
        BirdsViewModel(get())
    }
}

object ViewModelProvider :  KoinComponent {
    fun getBirdsViewModel() = get<BirdsViewModel>()
}