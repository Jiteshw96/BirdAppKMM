
import data.repository.BirdsReposirotyImp
import domain.BirdsRepository
import org.koin.dsl.module

val appModule = module {
    
    single<BirdsRepository> { BirdsReposirotyImp()}
    
    factory {
        BirdsViewModel(get())
    }
}