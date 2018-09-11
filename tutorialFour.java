class Robot {
  private String name;
  private int age;

  public void speak(String text) {
    System.out.println(text);
  }

  public void jump(int height) {
    System.out.println("Jumping: " + height);
  }

  public void move(String direction, double distance) {
    System.out.println("Moving " + distance + " metres in direction " + direction);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
  public void setInfo(String name, int age) {
    setName(name);
    setAge(age);
    System.out.println(name + " " + age);
  }
}

public class tutorialFour {
  public static void main(String[] args) {
    Robot hero = new Robot();

    String greeting = "Hello world";
    int h = 14;

    hero.speak(greeting);
    hero.jump(7);
    hero.move("East", 12.43);
    hero.jump(h);
    hero.setInfo("John Smith", 10);
  }
}