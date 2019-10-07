package `class`.impl

import `class`.`interface`.TransferInterface

open class TransferImpl : TransferInterface{

    /**
     * 引数なし
     */
    override fun sayHello() {
        sayHello("匿名")
    }

    /**
     * 引数１つ
     */
    override fun sayHello(target: String) {
        println("Hello ${target}")
    }

}