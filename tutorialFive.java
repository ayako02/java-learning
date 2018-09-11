class Machine {
  private String name;
  private int age;

  public Machine() {
    // using "this" to call the constructor
    // it is calling thr 3rd constructor method here
    this("John", 0);

    name = "John";
    System.out.println("Constructor running " + name);
  }

  public Machine(String name) {
    this(name, 0);
    System.out.println("2nd constructor running " + name);
    this.name = name;
  }

  public Machine(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("3rd constructor running " + name);
  }
}

public class tutorialFive {
  public static void main(String[] args) {
    Machine machine1 = new Machine();

    Machine machine2 = new Machine("Hugo");

    Machine machine3 = new Machine("Hero", 5);
  }
}