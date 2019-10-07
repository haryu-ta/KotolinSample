package `class`.classes

import `class`.impl.TransferImpl

class TransferClass : TransferImpl() {

    private val _targets : MutableSet<String> = mutableSetOf()

    val targets : Set<String>
        get() = _targets

    override fun sayHello(target: String) {
        _targets += target
        super.sayHello(target)
    }

}
