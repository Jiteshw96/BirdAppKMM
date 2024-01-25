package domain

import BirdImage

interface BirdsRepository {
    suspend fun getBirdsImages():List<BirdImage>
}

