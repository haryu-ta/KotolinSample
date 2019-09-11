fun main(args:Array<String>){
    val name:String = args[1]
    var horsename : String = "ディープ"

    // リストの初期化（変更可能）
    val horseList = mutableListOf<String>()
    horseList.add("ディープインパクト")
    horseList.add("ウオッカ")
    horseList.add("キタサンブラック")

    for(name in args){
        println("${name}")
    }

    println(callName(args[0],args[1]))

    for( i in 1..horseList.size step 1){
        if( horseList.get(i - 1).equals("ウオッカ")){
            println(horseList.get(i))
        }
    }

    //再起呼び出し
    println("再起呼出")
    println(plusString(horseList))

    // 型推論
    // var func = ::callName
    var func : (String,String) -> String = ::callName
    println(func("abc","def"))

    // 高階関数（引数に関数をとる関数or戻り値に関数を戻す関数）
    val numlist = listOf(1,2,3,4)
    println("平方関数")
    println(map(numlist,::square))
    println("階乗関数")
    println(map(numlist,::factorial))

    // 関数リテラル
    println("関数リテラル")
    println(map(numlist,fun(n : Int):Int { return n * n }))
    println(map(numlist,{ n: Int -> n * n}))

    // 関数リテラル
    println("関数リテラル発展1")
    val cf : (n : Int) -> Int = {
        n -> n * n
    }
    println(cf(2))

    println("関数リテラル2")
    val cf2 : (List<Int>) -> Int = {
        n ->
        var cnt = 0
        for(ent in n){
            cnt = cnt + ent
        }
        cnt
    }
    println(cf2(listOf(1,2,3,4,5,6,7,8,9,10)))

    println("クロシージャ")
    var obj = counter()
    println(obj.invoke())
    println(obj())
}

fun callName(firstname : String,lastname : String ):String {
    return firstname + " " + lastname
}

/*
 * 再帰呼び出し
 */
fun plusString(lists : List<String>):String =
    if (lists.isEmpty()) ""
    else lists.first() + plusString(lists.drop(1))

/*
 * 高階関数（引数に関数をとる関数or戻り値に関数を戻す関数）
 */
fun map(IntList : List<Int>,f : (Int) -> Int):List<Int>{
    var resList = java.util.ArrayList<Int>()
    for( e in IntList ) {
        resList.add(f(e))
    }
    return resList
}

/**
 * 平方関数
 */
fun square(n : Int): Int =  n * n

/**
 * 階乗関数
 */
fun factorial(n : Int): Int{
    if ( n == 1 ) {
        return 1
    }else{
        return n * factorial(n-1)
    }

}

/**
 * 関数リテラルによる関数定義
 */
fun counter() : () -> Int {
    var count = 0
    return {
        count++
    }
}
