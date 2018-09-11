public class intMachine implements intInfo {
  
  private int id = 7;

  public void startMachine() {
    System.out.println("Machine started");
  }

  public void showInfo() {
    System.out.println("Machine ID is: " + id);
  }
}