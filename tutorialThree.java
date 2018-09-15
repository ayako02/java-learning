class Person {
  int age;
  String name;

  int calYears() {
    int yearsLeft = 65 - age;
    return yearsLeft;
  }

  int getAge() {
    return age;
  }

  String getName() {
    return name;
  }
}

public class tutorialThree {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "John";
    person1.age = 30;
    int years = person1.calYears();
    System.out.println("Years till retirements: " + years);

    int age = person1.getAge();
    System.out.println("Age: " + age);

    String name = person1.getName();
    System.out.println("Name: " + name);
  }
}