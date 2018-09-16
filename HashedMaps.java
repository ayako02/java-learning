import java.util.HashMap;
import java.util.Map;

public class HashedMaps {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();

    map.put(5, "Five");
    map.put(3, "Three");
    map.put(2, "Two");
    map.put(6, "Six");
    map.put(9, "Nine");

    // map.put(3, "Hello");
    String text = map.get(3);

    System.out.println(text);

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      int key = entry.getKey();
      String value = entry.getValue();

      System.out.println(key + ": " + value);
    }
  }
}