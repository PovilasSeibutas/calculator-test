package initialization;

import entites.Calculator;
import entites.CalculatorOperations;
import exceptions.InvalidInputException;
import input.InputReader;
import result.CalculatorResult;

public class CalculationInitialization {

  private InputReader inputReader;

  public CalculationInitialization(InputReader inputReader) {
    this.inputReader = inputReader;
  }

  public CalculatorResult getCalculationResult() throws InvalidInputException {
    String operation;
    Double operand1;
    Double operand2;

    operation = inputReader.readInput("Enter operation (+ - * /): ");
    if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
    } else {
      throw new InvalidInputException("Wrong operation: " + operation);
    }

    try {
      operand1 = Double.valueOf(inputReader.readInput("Enter first operand: "));
    } catch (Exception e) {
      throw new InvalidInputException("First operand must be number!");
    }

    try {
      operand2 = Double.valueOf(inputReader.readInput("Enter second operand: "));
    } catch (Exception e) {
      throw new InvalidInputException("Invalid second operand!");
    }
    if (operand2 == 0.0){
      throw  new InvalidInputException("Division by 0 is not possible!");
    }

    return new CalculatorResult(new Calculator(operand1, operand2), new CalculatorOperations(operation));
  }

}
