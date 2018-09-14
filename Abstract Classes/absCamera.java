public class absCamera extends absMachine {
  public void startTask() {
    System.out.println("starting camera...");
  }

  public void doStuff() {
    System.out.println("snapping photos");
  }

  public void endTask() {
    System.out.println("camera off");
  }
}