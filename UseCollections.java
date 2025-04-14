import java.util.ArrayList;
import java.util.Collections;

public class UseCollections {
  public static void main(String[] args) {
    // Create an ArrayList and add elements
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(43);
    numbers.add(31);
    numbers.add(72);
    numbers.add(29);

    // Sorting based on the second digit
    Collections.sort(numbers, (n1, n2) -> {
      int secondDigitA = (n1) % 10; // Extract second digit
      int secondDigitB = (n2) % 10; // Extract second digit
      return Integer.compare(secondDigitA, secondDigitB);
    });

    // Print the ArrayList
    System.out.println("ArrayList elements sorted by second digit: " + numbers);
  }
}
