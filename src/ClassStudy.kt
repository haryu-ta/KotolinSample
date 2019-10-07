import `class`.ProfileClass
import `class`.UserClass
import `class`.impl.JapaneseGreetingImpl

fun main(args:Array<String>){

    println("============= UserClass =============")
//    var user = UserClass()
//    user.id = 2
//    user.name = "itamura"
//    user.old = 10
//    user.gender = "male"
//    user.printline()
//
//    var names : String = user.name

    println("============= ProfielClass =============")
    val pro = ProfileClass(1,"itamura.ryohei@tis.co.jp")
    println("${pro.id}")
    println("${pro.email}")

    println("============= Interface =============")
    var greet = JapaneseGreetingImpl()
    greet.greet()
    greet.defaultgreet()

    println("============= transfer（委譲） =============")



}
