package initialization;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import entites.Calculator;
import entites.CalculatorOperations;
import exceptions.InvalidInputException;
import input.InputReader;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import result.CalculatorResult;

public class CalculationInitializationTest {

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Mock
  private InputReader inputReader;

  @InjectMocks
  private CalculationInitialization calculationInitialization;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void fails_whenInvalidOperationProvided() throws Exception {
    expectedException.expect(InvalidInputException.class);
    expectedException.expectMessage("Wrong operation: add");

    when(inputReader.readInput("Enter operation (+ - * /): ")).thenReturn("add");

    calculationInitialization.getCalculationResult();

  }

  @Test
  public void fails_whenInvalidFirstOperandProvided() throws Exception {
    expectedException.expect(InvalidInputException.class);
    expectedException.expectMessage("First operand must be number!");

    when(inputReader.readInput("Enter operation (+ - * /): ")).thenReturn("+");
    when(inputReader.readInput("Enter first operand: ")).thenReturn("add");

    calculationInitialization.getCalculationResult();

  }

  @Test
  public void fails_whenInvalidSecondOperandProvided() throws Exception {
    expectedException.expect(InvalidInputException.class);
    expectedException.expectMessage("Invalid second operand!");

    when(inputReader.readInput("Enter operation (+ - * /): ")).thenReturn("+");
    when(inputReader.readInput("Enter first operand: ")).thenReturn("3.0");
    when(inputReader.readInput("Enter second operand: ")).thenReturn("two");

    calculationInitialization.getCalculationResult();

  }
  @Test
  public void fails_whenSecondOperandZeroValueProvided() throws Exception {
    expectedException.expect(InvalidInputException.class);
    expectedException.expectMessage("Division by 0 is not possible!");

    when(inputReader.readInput("Enter operation (+ - * /): ")).thenReturn("/");
    when(inputReader.readInput("Enter first operand: ")).thenReturn("3.0");
    when(inputReader.readInput("Enter second operand: ")).thenReturn("0");

    calculationInitialization.getCalculationResult();

  }

  @Test
  public void returnCalculationResultObiject_getCalculationResultMethodCalled() throws Exception {
    when(inputReader.readInput("Enter operation (+ - * /): ")).thenReturn("+");
    when(inputReader.readInput("Enter first operand: ")).thenReturn("3.1");
    when(inputReader.readInput("Enter second operand: ")).thenReturn("2.1");

    CalculatorResult calculatorResult = calculationInitialization.getCalculationResult();

    assertEquals(calculatorResult.getCalculator(), new Calculator(3.1, 2.1));
    assertEquals(calculatorResult.getCalculatorOperations(), new CalculatorOperations("+"));

  }


}