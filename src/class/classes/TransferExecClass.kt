package `class`.classes

import `class`.`interface`.TransferInterface
import `class`.impl.TransferImpl

/**
 * 委譲
 * 既存の処理を活かしつつ処理を追加する際に便利
 */
// Interfaceを実装
class TransferExecClass : TransferInterface {

    // Interfaceを実装したクラスを継承
    private val transfer : TransferInterface = TransferImpl()

    private val _targets : MutableSet<String> = mutableSetOf()

    val targets : Set<String>
        get() = _targets

    // Interfaceで定義されたクラスをオーバーライド
    override fun sayHello() {
        // methodの本処理はインターフェースを実装した方に委ねる
        transfer.sayHello()
    }

    // Interfaceで定義されたクラスをオーバーライド
    override fun sayHello(target: String) {
        _targets += target
        transfer.sayHello(target)
    }

}