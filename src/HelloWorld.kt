import `class`.classes.BuscketClass
import `class`.classes.lastChar
import `class`.classes.wordsConunt
import `class`.lambda.*

fun main(args:Array<String>){
    val name:String = args[1]
    var horsename : String = "ディープ"

//    // リストの初期化（変更可能）
//    val mutablehorseList = mutableListOf<String>()
//    mutablehorseList.add("ディープインパクト")
//    mutablehorseList.add("ウオッカ")
//    mutablehorseList.add("キタサンブラック")
//
//
//    for(name in args){
//        println("${name}")
//    }
//
//    println(callName(args[0],args[1]))
//
//    for( i in 1..mutablehorseList.size step 1){
//        if( mutablehorseList.get(i - 1).equals("ウオッカ")){
//            println(mutablehorseList.get(i))
//        }
//    }


    println("============= 拡張関数 =============")

    fun String.countWords() : Int =
         this.split("""\s+""".toRegex()).size


    // 拡張関数
    println("I love yout me to".countWords())

    println("============= 拡張プロパティ =============")
    // getterのみ
    println("I love yout me to".wordsConunt)

    // getter,setter
    val lastCh = StringBuilder()
        .append("Abcdefg")
        .lastChar

    println("Last char = $lastCh")


    val sb = StringBuilder()
        .append("Abcdefg")
    sb.lastChar = '@'

    println("StringBuilder = $sb")


//    println("============= ラムダ式 =============")
//    println(square(2))
//    println(devide(6))
//
//    println(strSearchReturnIndex("Hello World!",isSpace))
//    println(strSearchReturnIndex("Itamura Ryohei",isSpace))
//    println(strSearchReturnIndex("Hi Yamaguchi!!",{ it.isWhitespace() }))
//    println(strSearchReturnIndex("Draemon's eye"){it.isWhitespace()})
//
//    val arrList : List<String> = listOf("水星","金星","地球","火星","木星","土星","天王星","海王星","冥王星")
//    listOfLoops(arrList){
//            cnt : String , item : String ->
//        "${cnt} : ${item}"
//    }
//
//    nonLocalRerutn(arrList)
//    labelLocalRerutn(arrList)

//    println("============= コレクション =============")
//    collectionStudy()

//    println("============= 再起呼出 =============")
//    println(plusString(mutablehorseList))
//
//    // 型推論
//    // var func = ::callName
//    var func : (String,String) -> String = ::callName
//    println(func("abc","def"))
//
//    // 高階関数（引数に関数をとる関数or戻り値に関数を戻す関数）
//    println("============= 高階関数 =============")
//    val numlist = listOf(1,2,3,4)
//    println("平方関数")
//    println(map(numlist,::square))
//    println("階乗関数")
//    println(map(numlist,::factorial))
//
//    println("============= 関数リテラル =============")
//    println("関数リテラル")
//    println(map(numlist,fun(n : Int):Int { return n * n }))
//    println(map(numlist,{ n: Int -> n * n}))
//
//    println("関数リテラル2")
//    val cf2 : (List<Int>) -> Int = {
//        n ->
//        var cnt = 0
//        for(ent in n){
//            cnt = cnt + ent
//        }
//        cnt
//    }
//    println(cf2(listOf(1,2,3,4,5,6,7,8,9,10)))
//
//    println("============= クロシージャ =============")
//    var obj = counter()
//    println(obj.invoke())
//    println(obj())
//
//    println("============= 可変長変数 =============")
//    val intList = intArrayOf(1,2,3,4,5,6,7,8,9,10)
//    variableLengthfunc(*intList)
//    variableLengthfunc(0,1,2)
//
//    println("============= ローカル関数 =============")
//    localFunction()

//    println("============= その他 =============")
//
//    val cls1 = BuscketClass(2)
//    cls1.setSize(4)
//
//    val cls2 = BuscketClass(4)
//    cls2.setSize(4)
//
//    println(cls1.plus(cls2))

}

fun localFunction():Unit{
    var var1 :Int = 1
    /**
     * ローカル関数
     */
    fun innerFunction(var2 : Int ):Unit {
        var1 = var1 + var2
    }
    innerFunction(5)
    println(var1)
}

fun callName(firstname : String,lastname : String ):String {
    return firstname + " " + lastname
}

/*
 * 再帰呼び出し
 */
tailrec fun plusString(lists : List<String>):String =
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

/**
 * 可変長関数（vararg）
 */
fun variableLengthfunc(vararg intList : Int){
    println(intList.size)
}
