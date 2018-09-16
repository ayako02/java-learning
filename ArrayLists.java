import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    // Adding
    numbers.add(100);
    numbers.add(20);
    numbers.add(400);

    // Retrieving
    System.out.println(numbers.get(0));

    System.out.println("\nIteration 1: ");
    // Indexed for loop iteration
    for (int x = 0; x < numbers.size(); x++) {
      System.out.println(numbers.get(x));
    }

    // Removing items
    numbers.remove(numbers.size() - 1);
    numbers.remove(0);

    System.out.println("\nIteration 2: ");
    for (Integer x : numbers) {
      System.out.println(x);
    }
  }
}