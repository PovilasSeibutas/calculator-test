package executor;

import initialization.CalculationInitialization;
import input.InputReader;
import result.CalculatorResult;

public class CalculationExecutor {

  private InputReader inputReader;

  public CalculationExecutor(InputReader inputReader) {
    this.inputReader = inputReader;
  }

  public void execute() {
    String continueExecution = "y";
    while (continueExecution.equals("y")) {
      executeSingleOperation();
      continueExecution = userContinue();
    }
  }

  private void executeSingleOperation() {
    try {
      CalculationInitialization calculationInitialization = new CalculationInitialization(inputReader);
      CalculatorResult calculatorResult = calculationInitialization.getCalculationResult();
      System.out.println(calculatorResult.getResult());
    } catch (Exception e) {
      inputReader.writeResponse(e.getMessage());
    }
  }

  private String userContinue() {
    return inputReader.readInput("Do you want to continue?(Y/N)").toLowerCase();

  }

}
