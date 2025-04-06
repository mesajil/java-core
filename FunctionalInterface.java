import classes.Operation;
import java.util.Scanner;

public class FunctionalInterface {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a: ");
      int a = sc.nextInt();

      System.out.print("Enter b: ");
      int b = sc.nextInt();

      Operation op = (x, y) -> x * y;
      System.out.println("Result: " + op.apply(a, b));
    }
  }
}
