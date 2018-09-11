public class intPerson implements intInfo {

  private String name;

  public intPerson(String name) {
    this.name = name;
  }

  public void greet() {
    System.out.println("Hello world");
  }

  public void showInfo() {
    System.out.println("Person name is: " + name);
  }
}