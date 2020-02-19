package result;

import entites.Calculator;
import entites.CalculatorOperations;

public class CalculatorResult {

  private Calculator calculator;
  private CalculatorOperations calculatorOperations;

  public CalculatorResult(Calculator calculator, CalculatorOperations calculatorOperations) {
    this.calculator = calculator;
    this.calculatorOperations = calculatorOperations;
  }

  public String getResult() {
    return calculator.getOperand1() + calculatorOperations.getOperation() + calculator.getOperand2() + "="
        + getOperationResult();
  }

  private Double getOperationResult() {
    switch (calculatorOperations.getOperation()) {
      case "+":
        return calculator.getOperand1() + calculator.getOperand2();
      case "-":
        return calculator.getOperand1() - calculator.getOperand2();
      case "*":
        return calculator.getOperand1() * calculator.getOperand2();
      case "/":
        return calculator.getOperand1() / calculator.getOperand2();
      default:
        return null;
    }
  }

  public Calculator getCalculator() {
    return calculator;
  }

  public CalculatorOperations getCalculatorOperations() {
    return calculatorOperations;
  }
}
