package `class`.classes

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class MyClass{
    var _str : String? = null
    var str : String? by object{
        operator fun getValue(thisRef: MyClass,
                              property:KProperty<*>):String?{
            println("${property.name}をGET")
            return _str
        }

        operator fun setValue(thisRef:MyClass,
                              property : KProperty<*>,
                              value : String?){
            println("${property.name}に${value}をSET")
            _str = value
        }
    }
}


class User{
    var username : String by Hoge()
}

class Hoge<R> : ReadWriteProperty<R,String>{

    var _str : String = "abc"

    override fun setValue(thisRef: R, property: KProperty<*>, value: String) {
        println("${property.name}に${value}")
        _str = value
    }

    override fun getValue(thisRef: R, property: KProperty<*>): String {
        println("${property.name}")
        return _str
    }


}
