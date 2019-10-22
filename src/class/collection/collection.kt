package `class`.collection

//    ============= いろんなコレクション =============
//    val mutablehorseSet = mutableSetOf<String>()
//    val mutablehorseMap = mutableMapOf<String,String>()
//    val horseList = setOf<String>("1","2")
//    val horseMap = mapOf<Int,String>(1 to "ディープインパクト",2 to "ウォッカ")
//    val horseArray = arrayOfNulls<String>(5)
//    horseArray[0] = "abc"
//    println(horseArray[0])

fun collectionStudy(){

    var collectionList =  mutableListOf<Int>()
    for(i in 1..100 step 1){
        collectionList.add(i)
    }
    println(collectionList.asReversed())
    println(collectionList.first())
    println(collectionList.last())
    println(collectionList.filter {  n -> n % 2 == 0 })
    println(collectionList.min())

}