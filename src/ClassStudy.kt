import `class`.ProfileClass
import `class`.UserClass
import `class`.`interface`.TransferInterface
import `class`.classes.*
import `class`.impl.JapaneseGreetingImpl
import `class`.impl.TransferImpl

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
    val target : TransferClass = TransferClass()
    target.sayHello("亮平")
    target.sayHello("佳奈")
    target.sayHello()
    println(target.targets)
    println("↓↓↓↓↓↓↓↓↓↓↓↓↓ transfer（委譲） ↓↓↓↓↓↓↓↓↓↓↓↓↓")
//    val target2 : TransferExecClass = TransferExecClass()
    // 委譲するクラスをインスタンス化
    val transferImpl : TransferImpl = TransferImpl()
    val target2 : TransferExecClass = TransferExecClass(transferImpl)
    target2.sayHello("亮平")
    target2.sayHello("佳奈")
    target2.sayHello()
    println(target2.targets)



//    println("============= Generics =============")
//    val generics =  GenericsClass(2)
//    var genericsBox : GenericsBoxClass = GenericsBoxClass(generics)
//    println(genericsBox.value)
//    println(generics)
//    println("↓↓↓↓↓↓↓↓↓↓↓↓↓ Any ↓↓↓↓↓↓↓↓↓↓↓↓↓")
//    var genericsBox2 : AnyBoxClass = AnyBoxClass(3)
//    var genericsBox3 : AnyBoxClass = AnyBoxClass(generics)
//    println(genericsBox2.value)
//    println(genericsBox3.value)
//
//    // caseしながら取り出せば問題ないが、ダウンキャストはNG（安全出ない）
//    val intvalue : Int = genericsBox2.value as Int
//    val genericvalue : GenericsClass  = genericsBox3.value as GenericsClass
//    println("↓↓↓↓↓↓↓↓↓↓↓↓↓ ジェネリクス ↓↓↓↓↓↓↓↓↓↓↓↓↓")
//    val geneboxInt = GenericsBox<Int>(2)
//    val geneboxString = GenericsBox<String>("3")
//    val geneboxLong = GenericsBox<Long>(4L)
//    val geneboxClass = GenericsBox<GenericsClass>(generics)
//
//    println(geneboxInt.value)
//    println(geneboxString.value)
//    println(geneboxLong.value)
//    println(geneboxClass.value)
//
//    val ext : GenericsClass = SubGenericsClass(5)
//    println(ext)
//
//    // サブクラスであっても代入はできない
//    // val extClass : GenericsBox<GenericsClass> = GenericsBox<SubGenericsClass>(SubGenericsClass(5))
//    val extClass : GenericsBox<GenericsClass> = GenericsBox<GenericsClass>(GenericsClass(5))
//    println(extClass.value)
//    val extOutClass : OutGenericsBox<GenericsClass> = OutGenericsBox<SubGenericsClass>(SubGenericsClass(5))



}
