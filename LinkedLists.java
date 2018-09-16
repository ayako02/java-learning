import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class LinkedLists {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<Integer>();
    List<Integer> linkedList = new LinkedList<Integer>();

    doTimings("Array List ", arrayList);
    doTimings("Linked list ", linkedList);
  }

  private static void doTimings(String type, List<Integer> list) {
    for (int i = 0; i < 1E5; i++) {
      list.add(i);
    }

    long start = System.currentTimeMillis();

    // Add items at end of list
    // for(int i=0; i<1E5; i++) { list.add(i); }

    // Add items elsewhere in list
    for (int i = 0; i < 1E5; i++) {
      list.add(0, i);
    }

    long end = System.currentTimeMillis();

    System.out.println("Time taken " + (end - start) + "ms for " + type);
  }
}