package entites;

import java.util.Objects;

public class Calculator {

  private Double operand1;
  private Double operand2;

  public Calculator(Double operand1, Double operand2) {
    this.operand1 = operand1;
    this.operand2 = operand2;
  }

  public Double getOperand1() {
    return operand1;
  }


  public Double getOperand2() {
    return operand2;
  }

  @Override
  public String toString() {
    return "Calculator{" +
        "operand1=" + operand1 +
        ", operand2=" + operand2 +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calculator that = (Calculator) o;
    return operand1.equals(that.operand1) &&
        operand2.equals(that.operand2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operand1, operand2);
  }
}
