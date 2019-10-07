package `class`

/**
 * 継承されるクラスにはopen修飾子が必要
 */
open class SuperClass {
    var id : Long = 1

    fun printline(){
        println("${id}")
    }
}