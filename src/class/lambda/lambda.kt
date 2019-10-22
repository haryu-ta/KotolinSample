package `class`.lambda

val square : (Int) -> Int ={
    n ->
    n * n
}

val devide = {
    n : Int ->
    var i  = n.toDouble().div(3L)
    i
}

/**
 * 引数に渡された文字の最初のスペースのインデックス番号を返却
 */
fun strSearchReturnIndex(strs : String ,func : (Char) -> Boolean) : Int {
    tailrec fun search(str : String ,index : Int ) : Int =
        when {
            str.isEmpty() -> -1
            func(str.first()) -> index
            else -> search(str.drop(1),index + 1)
        }
    return search(strs,0)
}

/**
 * 引渡された文字がスペースかを判定
 */
val isSpace : (Char) -> Boolean = {
    it.isWhitespace()
}

/**
 * インライン関数
 */
inline fun listOfLoops(arrList : List<String>,fn : (String,String) -> String  ){
    for(item in arrList.indices){
        println(fn(item.toString(),arrList.get(item)))
    }
}

inline fun listOfLoops2(arrList: List<String>, fn: (String) -> Unit){
    for(item in arrList.indices){
        fn(arrList.get(item))
    }
}

/**
 * 非ローカルリターン
 */
fun nonLocalRerutn(arrList: List<String>): Boolean {
    listOfLoops2(arrList){
        if(!it.endsWith("星"))
            return true
    }
    println("★")
    return false
}

/**
 * ラベルリターン
 */
fun labelLocalRerutn(arrList: List<String>): Boolean {
    var returnFlg : Boolean = false
    listOfLoops2(arrList) here@{
        if(!it.endsWith("星"))
            returnFlg = true
            return@here
    }
    println("★★")
    return returnFlg
}