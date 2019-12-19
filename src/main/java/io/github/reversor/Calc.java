package io.github.reversor;

import com.udojava.evalex.Expression;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s;
            while ((s = scanner.nextLine()) != null) {
                if (s.equalsIgnoreCase("exit")) {
                    System.exit(0);
                }

                Expression expression = new Expression(s);
                System.out.println(expression.eval(false));
            }
        }
    }

}
