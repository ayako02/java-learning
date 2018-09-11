public class interfaceApp {
  public static void main(String[] args) {
    
    System.out.println("Interfaces");
    System.out.println();

    intMachine mach1 = new intMachine();
    mach1.startMachine();

    intPerson person1 = new intPerson("john");
    person1.greet();

    intInfo info1 = new intMachine();
    info1.showInfo();

    intInfo info2 = person1;
    info2.showInfo();
    
    System.out.println();
    
    outputInfo(mach1);
    outputInfo(person1);
  }

  private static void outputInfo(intInfo info) {
    info.showInfo();
  }
}