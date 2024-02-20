data class BirdsUIState(
    val images:List<BirdImage>,
    val selectedCategory :String? = null
){
    val categories = images.map {it.category}.toSet()
    val selectedImages = images.filter {birdImage->
       selectedCategory?.let {
           birdImage.category == selectedCategory
       }?: run{
           true
       }
    }
}
