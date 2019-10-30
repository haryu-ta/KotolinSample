fun main(args:Array<String>){


    println("============= 安全呼出 =============")
    // ============　メンバー呼び出し　============
    var nullableval : Int? = null
    nullableval = 2
    //val safeval : Int = nullableval
    val safeval : Int? = nullableval?.inc()
    println(safeval)

    // ============　呼び出し引数　============
    fun function(num : Int):Int{
        return num.dec()
    }

    var num1 : Int? = null
    // println(function(num1))  //コンパイルエラー

    if( num1 != null){
        println(function(num1))
    }

    /**
     * 拡張関数let
     * public inline fun<T,R> T.let(block:(T)-> R):R = block(this)
     */
    num1 = 100
    println(num1?.let(::function))

    // ============ エルビス演算子 ============
    num1 = if( num1 != null ) num1 else 10

    // ============ 安全キャスト ============
    val strvar : String = "abc"
    var numvar : Int? = strvar as? Int
    println(numvar)

    val num2var : Number = 54
    numvar = num2var as? Int
    println(numvar)

    println("============= NULLの扱い =============")
//    val a : String = "aaa"
//    val b : String? = null
//
//    println(a.length)
//    if( a != null ){
//        println(a.length)
//    }
//
//    //println(b.length)  コンパイルエラー
//    if( b != null ){
//        println(b.length)
//    }
//
//    val variablelist : List<Any?> = listOf("itamura",false,1,1L,null)
//    for(e in variablelist){
//        val c : Any? = when(e){
//            is Int -> e
//            is String -> e
//            is Boolean -> e
//            is Long -> e
//            else -> null
//        }
//        println(e)
//    }
}