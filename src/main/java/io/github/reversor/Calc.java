package io.github.reversor;

import com.udojava.evalex.Expression;
import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      for (; ; ) {
        String s = scanner.nextLine();

        if (s.equalsIgnoreCase("exit")) {
          break;
        }

        Expression expression = new Expression(s);
        System.out.println(expression.eval(false));
      }
    }
  }

}
