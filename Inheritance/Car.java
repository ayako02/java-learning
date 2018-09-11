//child class

public class Car extends Machine {
  
  @Override   //check whether the method is overwritting the method in parent class
  public void start() {
    System.out.println("Car started!");
  }

  public void wipeWindshield() {
    System.out.println("Wipping windshield");
  }

  public void showInfo() {
    System.out.println("Car name is : " + name);
  }
}