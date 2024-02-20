package di

import BirdsViewModel
import org.koin.core.module.Module
import org.koin.dsl.module
actual fun getViewModelByPlatform():Module = module {
    single {
        BirdsViewModel(get())
    }
}