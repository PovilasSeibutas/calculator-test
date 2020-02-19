package result;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import entites.Calculator;
import entites.CalculatorOperations;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class CalculatorResultTest {

  @Mock
  private Calculator calculator;

  @Mock
  private CalculatorOperations calculatorOperations;

  @InjectMocks
  private CalculatorResult calculatorResult;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void shouldReturnSubtractionResultOfTwoNumbers() {
    when(calculator.getOperand1()).thenReturn(1.0);
    when(calculator.getOperand2()).thenReturn(2.0);
    when(calculatorOperations.getOperation()).thenReturn("-");

    String result = calculatorResult.getResult();

    assertThat("Subtraction of two numbers should be made", result, equalTo("1.0-2.0=-1.0"));

  }

  @Test
  public void shouldReturnMultiplicationResultOfTwoNumbers() {
    when(calculator.getOperand1()).thenReturn(1.0);
    when(calculator.getOperand2()).thenReturn(2.0);
    when(calculatorOperations.getOperation()).thenReturn("*");

    String result = calculatorResult.getResult();

    assertThat("Multiplication of two numbers should be made", result, equalTo("1.0*2.0=2.0"));

  }

  @Test
  public void shouldReturnDevisionResultOfTwoNumbers() {
    when(calculator.getOperand1()).thenReturn(1.0);
    when(calculator.getOperand2()).thenReturn(2.0);
    when(calculatorOperations.getOperation()).thenReturn("/");

    String result = calculatorResult.getResult();

    assertThat("Devision of two numbers should be made", result, equalTo("1.0/2.0=0.5"));

  }

  @Test
  public void shouldReturnAdditionResultOfTwoNumbers() {
    when(calculator.getOperand1()).thenReturn(1.0);
    when(calculator.getOperand2()).thenReturn(2.0);
    when(calculatorOperations.getOperation()).thenReturn("+");

    String result = calculatorResult.getResult();

    assertThat("Addition of two numbers should be made", result, equalTo("1.0+2.0=3.0"));

  }
}