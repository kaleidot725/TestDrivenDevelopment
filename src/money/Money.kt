package money

import java.awt.event.MouseEvent
open class Money(amount : Int, currency : String) {
    val amount : Int = amount
    val currency : String = currency

    companion object {
        fun dollar(amount : Int) : Dollar = Dollar(amount, "USD")
        fun franc(amount : Int) : Franc = Franc(amount, "CHF")
    }

    override fun equals(any : Any?) : Boolean {
        val money : Money = any as Money
        return (amount == money.amount) && (this.currency == money.currency)
    }

    fun times(multiplier : Int) : Money = Money(amount * multiplier, currency)
}