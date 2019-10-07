package `class`

class UserClass : SuperClass(){
    var name : String = ""

    set(val1 : String){
        println("設定された")
        field = val1
    }

    get(){
        println("取得された")
        return field
    }

    var old : Int = 0

    set(old : Int){
        println("設定された2")
        field = old
    }
    var gender : String = ""

    set(val2 : String){
        println("設定された3")
        field = val2
    }
    var telno : String = ""
}