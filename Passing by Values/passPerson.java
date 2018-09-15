public class passPerson {
  public String name;

  public passPerson(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return "Person [name = " + name + "]";
  }
}