package result;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import entites.Calculator;
import entites.CalculatorOperations;
import org.junit.Test;

public class CalculatorResultTest {

  @Test
  public void shouldReturnSubtractionResultOfTwoNumbers() {
    String result = new CalculatorResult(new Calculator(1.0,2.0),new CalculatorOperations("-")).getResult();
    assertThat("Subtraction of two numbers should be made", result, equalTo("1.0-2.0=-1.0"));
  }

  @Test
  public void shouldReturnMultiplicationResultOfTwoNumbers() {
    String result = new CalculatorResult(new Calculator(1.0,2.0),new CalculatorOperations("*")).getResult();

    assertThat("Multiplication of two numbers should be made", result, equalTo("1.0*2.0=2.0"));

  }

  @Test
  public void shouldReturnDevisionResultOfTwoNumbers() {
    String result = new CalculatorResult(new Calculator(1.0,2.0),new CalculatorOperations("/")).getResult();

    assertThat("Devision of two numbers should be made", result, equalTo("1.0/2.0=0.5"));

  }

  @Test
  public void shouldReturnAdditionResultOfTwoNumbers() {
    String result = new CalculatorResult(new Calculator(1.0,2.0),new CalculatorOperations("+")).getResult();

    assertThat("Addition of two numbers should be made", result, equalTo("1.0+2.0=3.0"));

  }
}