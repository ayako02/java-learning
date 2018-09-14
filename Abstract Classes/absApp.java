public class absApp {
  public static void main(String[] args) {

    absCamera cam1 = new absCamera();
    cam1.setID(5);

    absCar car1 = new absCar();
    car1.setID(3);
    car1.run();

    // cant define due to machine is abstract classes
    // absMachine m1 = new absMachine();
  }
}