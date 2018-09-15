public class innerRobot {
  private int id;

  public class Brain {
    public void robotThink() {
      System.out.println("Robot " + id + " is thinking");
    }
  }

  // static class can only access static value
  public static class Battery {
    public void chargeBattery() {
      System.out.println("Battery is charging..");
    }
  }

  public innerRobot(int id) {
    this.id = id;
  }

  public void startRobot() {
    System.out.println("Starting robot " + id);

    Brain b1 = new Brain();
    b1.robotThink();

    final String name = "Kobayashi";

    class Temp {
      public void robotSays() {
        System.out.println("my ID is: " + id);
        System.out.println("My name is " + name);
      }
    }

    Temp temp = new Temp();
    temp.robotSays();
  }
}