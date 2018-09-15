public class innerApp {
  public static void main(String[] args) {
    innerRobot robot1 = new innerRobot(6);
    robot1.startRobot();

    innerRobot.Brain brain = robot1.new Brain();
    brain.robotThink();

    innerRobot.Battery battery = new innerRobot.Battery();
    battery.chargeBattery();
  }
}