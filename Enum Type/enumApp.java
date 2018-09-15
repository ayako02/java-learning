public class enumApp {
  // public static final int CAT = 0;
  // public static final int DOG = 1;
  // public static final int MOUSE = 2;

  public static void main(String[] args) {

    // int animal = CAT;
    Animals animal = Animals.DOG;

    switch (animal) {
    case DOG:
      System.out.println("dog");
      break;
    case CAT:
      System.out.println("cat");
      break;
    case MOUSE:
      System.out.println("mouse");
      break;
    }

    System.out.println(Animals.DOG);
    System.out.println(Animals.MOUSE.getAnimalName());
    System.out.println("Enum name as a String: " + Animals.DOG.name());

    System.out.println(Animals.DOG.getClass());

    System.out.println(Animals.DOG instanceof Animals);
    System.out.println(Animals.DOG instanceof Enum);

    Animals animal2 = Animals.valueOf("CAT");
    System.out.println(animal2);
  }
}