class Thing {
  public String name;
  public static String desc;
  public static int count = 0;
  public int id;

  // final constant unable to reassign/change
  public final static int age = 2;

  //constructor 
  public Thing() {
    id = count;
    count++;
  }

  public void showName() {
    //System.out.println(name);
    System.out.println("Object id: " + id + ", " + desc + ": " + name);
  }

  /* 
    1. static method can access static data because both belongs to the class
    2. cannot make a static reference to the non-static field name
      - unable to access "name" in this class
  */
  public static void showInfo() {
    System.out.println(desc);
    // won't work: System.out.println(name);
  }
}

public class tutorialSix {
  public static void main(String[] args) {
    System.out.println("before creating object: " + Thing.count);

    Thing thing1 = new Thing();
    Thing thing2 = new Thing();

    System.out.println("after creating object: " + Thing.count);

    Thing.desc = "hero is a boxer";
    Thing.showInfo();

    thing1.name = "Hero";
    thing2.name = "boxer";

    thing1.showName();
    thing2.showName();

    System.out.println(Thing.age);
  }
}