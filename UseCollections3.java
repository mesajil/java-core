import java.util.Arrays;
import java.util.List;

public class UseCollections3 {
  public static void main(String[] args) {
    // Create an ArrayList and add elements
    List<String> names = Arrays.asList("Ana", "Luis", "Pedro", "Laura");;

    // Print the ArrayList
    names.stream().filter(n -> n.startsWith("L")).map(String::toUpperCase)
        .forEach(System.out::println);
    System.out.println("List: " + names);
  }
}
