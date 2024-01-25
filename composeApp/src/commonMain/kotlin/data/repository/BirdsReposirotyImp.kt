package data.repository


import BirdImage
import domain.BirdsRepository
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*

class BirdsReposirotyImp : BirdsRepository {
    private val httpClient = HttpClient(){
         install(ContentNegotiation){
             json()
         }
    }
    override suspend fun getBirdsImages(): List<BirdImage> {
      return  httpClient
            .get("https://sebi.io/demo-image-api/pictures.json")
            .body<List<BirdImage>>()
    }
}