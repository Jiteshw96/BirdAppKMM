
import data.repository.BirdsReposirotyImp
import domain.BirdsRepository
import org.koin.dsl.module

val appModule = module {
    
    factory <BirdsRepository> { BirdsReposirotyImp()}
}