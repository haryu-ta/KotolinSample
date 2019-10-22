package `class`.classes

open class GenericsClass (var star : Int){
    val var1 : String  = "4"
    override fun toString() : String = "I have ${star} stars"
}

class SubGenericsClass ( star : Int) : GenericsClass(star){
    val var2 : String = "5"
    override fun toString() : String = "I have ${star} ★"
}

class GenericsBoxClass(var value : GenericsClass)

class AnyBoxClass(var value : Any)

class GenericsBox<T>(val value : T)

class OutGenericsBox<out T>(val value:T)