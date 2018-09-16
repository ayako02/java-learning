import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class SortedMaps {
  public static void main(String[] args) {
    Map<Integer, String> hashMap = new HashMap<Integer, String>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    Map<Integer, String> treeMap = new TreeMap<Integer, String>();

    System.out.println("Tree map: ");
    testMap(treeMap);

    System.out.println("\nHash map: ");
    testMap(hashMap);

    System.out.println("\nLinked hash map: ");
    testMap(linkedHashMap);
  }

  private static void testMap(Map<Integer, String> map) {
    map.put(9, "fox");
    map.put(4, "cat");
    map.put(8, "dog");
    map.put(1, "giraffe");
    map.put(0, "swan");
    map.put(15, "bear");
    map.put(6, "snake");

    for (Integer key : map.keySet()) {
      String value = map.get(key);

      System.out.println(key + ": " + value);
    }
  }
}