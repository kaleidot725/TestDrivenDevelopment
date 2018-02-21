package money

// Value Objectパターン
// Value Objectには、コンストラクタで設定した
// インスタンス変数の値が変わってはならないという制約がある
class Franc(amount : Int) : Money(amount) {
    fun times(multiplier : Int) : Franc {
        return Franc(amount * multiplier)
    }
}