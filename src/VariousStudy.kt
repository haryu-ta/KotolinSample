fun main(args: Array<String>) {

    println("============ オブジェクト宣言 ============")
    val greet: JapaneseGreeter = JapaneseGreeter
    greet.greeter("Hello!!")

    println("============ コンパニオンオブジェクト ============")
    println(Horse.getStable())

    println("============ 列挙型 ============")
    println(COUNTRY.valueOf("AMERICA").country + ":" + COUNTRY.valueOf("AMERICA").name + ":" + COUNTRY.valueOf("AMERICA").capital)
    println(COUNTRY.AMERICA.message());

}

/**
 * シングルトンオブジェクトはオブジェクト宣言を使用して作成
 */
object JapaneseGreeter {
    fun greeter(hello: String) {
        println("${hello}")
    }
}

/**
 * コンパニオンオブジェクト
 */
class Horse(val name: String, val stable: String) {
    companion object {
        val HORSE = Horse("ディープインパクト", "池江")

        fun getStable(): String {
            return Horse.HORSE.stable;
        }
    }
}

/**
 * 列挙型
 */
enum class COUNTRY(val country: String, val capital: String) {
    JAPAN("日本", "東京"){
        override fun message() : String = "${JAPAN.name}"
    },
    AMERICA("米国", "ワシントン"){
        override fun message() : String = "${AMERICA.name}だよ"
    },
    AUSTRALIA("オーストラリア", "シドニー"){
        override fun message() : String = ""
    },
    FRANCE("フランス", "パリ"){
        override fun message() : String = ""
    };
    abstract fun message() : String
}