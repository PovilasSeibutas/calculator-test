package entites;

import java.util.Objects;

public class CalculatorOperations {

  private String operation;

  public CalculatorOperations(String opearation) {
    this.operation = opearation;
  }

  public String getOperation() {
    return operation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatorOperations that = (CalculatorOperations) o;
    return operation.equals(that.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation);
  }
}
