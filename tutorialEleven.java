// Generics and Wildcards

import java.util.ArrayList;

class Machine {
  public String toString() {
    return "Machine";
  }
  public void start() {
    System.out.println("Machine started");
  }
}

class Camera extends Machine {
  public String toString() {
    return "Camera";
  }
}

public class tutorialEleven {
  public static void main(String[] args) {
    
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("one");
    list1.add("two");
    list1.add("three");

    ArrayList<Machine> list2 = new ArrayList<Machine>();
    list2.add(new Machine());
    list2.add(new Machine());

    ArrayList<Camera> list3 = new ArrayList<Camera>();
    list3.add(new Camera());
    list3.add(new Camera());

    showList(list2);
    showList2(list3);
    showList3(list3);
  }
  
  public static void showList(ArrayList<? extends Machine> list) {
    for(Machine value : list)
      System.out.println(value);
      //value.start();
  }

  public static void showList2(ArrayList<? super Camera> list) {
    for(Object value : list)
      System.out.println(value);
  }

  public static void showList3(ArrayList<?> list) {
    for(Object value : list)
      System.out.println(value);
  }
}