public class HelloWorld {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    double sum = calculator.add(10.5, 6); // Sum any number of values
    int difference = calculator.subtract(10, 5);
    int product = calculator.multiply(10, 5);
    double quotient = calculator.divide(10, 5);

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
  }
}

class Calculator {
  public double add(double... numbers) {
    double sum = 0;
    for (double number : numbers) {
      sum += number;
    }
    return sum;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public double divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Division by zero is not allowed.");
    }
    return (double) a / b;
  }
}

