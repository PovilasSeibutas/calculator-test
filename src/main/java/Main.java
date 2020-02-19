import executor.CalculationExecutor;
import input.InputReader;

public class Main {

  public static void main(String[] args) {
    InputReader inputReader = new InputReader();

    CalculationExecutor calculationExecutor = new CalculationExecutor(inputReader);
    calculationExecutor.execute();
    inputReader.closeScanner();

  }
}
