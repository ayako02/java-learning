class Machine {
  public void start() {
    System.out.println("Machine started");
  }
}

class Camera extends Machine {
  public void start() {
    System.out.println("Camera started");
  }

  public void snap() {
    System.out.println("Photo taken");
  }
}

public class tutorialTen {
  public static void main(String[] args) {
    Machine mach1 = new Machine();
    Camera cam1 = new Camera();

    mach1.start();
    cam1.start();
    cam1.snap();

    //upcasting
    Machine mach2 = cam1;
    mach2.start();
    //error: mach2.snap();

    //downcasting
    Machine mach3 = new Camera();
    Camera cam2 = (Camera)mach3;
    cam2.start();
    cam2.snap();

    // Doesn't work --- runtime error
    Machine mach4 = new Machine();
    // Camera cam3 = (Camera)mach4;
    // cam3.start();
    // cam3.snap();

  }
}