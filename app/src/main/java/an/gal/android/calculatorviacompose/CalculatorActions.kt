package an.gal.android.calculatorviacompose

sealed class CalculatorActions{
    data class Number(val number: Int): CalculatorActions()
    object ClearAll: CalculatorActions()
    object DeleteLastSymbol: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    data class Operation(val operation: CalculatorOperation): CalculatorActions()
}
