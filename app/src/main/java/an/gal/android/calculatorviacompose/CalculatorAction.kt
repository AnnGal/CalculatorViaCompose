package an.gal.android.calculatorviacompose

sealed class CalculatorAction{
    data class Number(val number: Int): CalculatorAction()
    object ClearAll: CalculatorAction()
    object DeleteLastSymbol: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}
