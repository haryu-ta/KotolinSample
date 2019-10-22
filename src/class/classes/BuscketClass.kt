package `class`.classes

class BuscketClass(size : Int){

    var _size : Int = size

    fun setSize(i : Int){
        _size = _size + i
    }

    fun getSize() : Int{
        return _size
    }

    fun plus(that : BuscketClass) : Int {
        return _size + that._size
    }
}

/**
 * 拡張プロパティの定義
 */
val String.wordsConunt : Int
    get() = split("""\s+""".toRegex()).size

var StringBuilder.lastChar: Char
    get() = this.get(0)
    set(value) {
        this.setCharAt(lastIndex , value)
    }
