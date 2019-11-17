

fun main(args : Array<String>){

    println("============== let ==============")
    // public inline fun <T, R> T.let(block: (T) -> R): R = block(this)
    val num1 = 10
    val num2 : Int = num1.let{it + 1}
    num2.display()

    println("============== with ==============")
    // public inline fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
    val num3 : Int = with(num2){ this + 1 }
    num3.display()

    val result = with(testClass("hello")){
        println(gender)
        setSex("female")
        println(gender)
        println(length())
        this
    }
    println(result.toString())

    // methodの関数オブジェクト
    val method : testClass.() -> String = testClass::toString
    println(result.method())

    println("============== run ==============")
    // public inline fun <T,R> run(block: T.() -> R): R = block()
    var tests : testClass? = null
    tests = testClass("こんにちは亮平")
    val result2 : testClass? = tests?.run{
        println(gender)
        setSex("no gender")
        println(gender)
        println(length())
        this
    }
    println(result2?.method())

    println("============== apply ==============")
    val result3 = testClass("Hello World!!").apply{
        println(gender)
        setSex("Okama")
        println(gender)
        println(length())
    }
    println(result3.method())

}


class testClass(var msg : String ){
    var gender : String = "male"

    fun length() : Int{
        return this.msg.length
    }

    fun setSex(sex : String){
        gender = sex
    }

    override fun toString():String{
        return "testClass(gender=${gender},msg=${msg})"
    }
}

/*
 * 結果表示
 */
fun Int.display():Unit{
    println("result : ${this}")
}