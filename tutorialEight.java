class Frog {
  private String name;
  private int ID;

  public Frog(int ID, String name) {
    this.ID = ID;
    this.name = name;
  }

  public String toString() {
    // return ID + ": " + name;     inefficient way 

    /*
    StringBuilder sb = new StringBuilder();
    sb.append(ID).append(": ").append(name);
    return sb.toString();
    */

    return String.format("%d: %s", ID, name);
  }
}

public class tutorialEight {
  public static void main(String[] args) {
    Frog frog1 = new Frog(7, "froggy");
    Frog frog2 = new Frog(8, "chubby");

    System.out.println(frog1);
    System.out.println(frog2);
  }
}