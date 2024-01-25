package di 

import BirdsViewModel
import org.koin.core.module.Module
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel
actual fun getViewModelByPlatform():Module = module {
    viewModel {
        BirdsViewModel(get())
    }
}