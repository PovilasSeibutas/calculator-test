package input;

import java.util.Scanner;

public class InputReader {

  private Scanner scanner;

  public String readInput(String text) {
    writeResponse(text);
    scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  public void writeResponse(String text) {
    System.out.println(text);
  }

  public void closeScanner() {
    scanner.close();
  }
}
