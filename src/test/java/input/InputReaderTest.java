package input;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;

public class InputReaderTest {

  @Test
  public void shouldReturnInputStringUsingReadInput() {
    InputReader inputReader = new InputReader();
    String input = "input";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    assertEquals("input", inputReader.readInput(input));
  }

}