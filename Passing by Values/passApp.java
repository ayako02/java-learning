public class passApp {
  public static void main(String[] args) {
    passApp app = new passApp();

    passPerson person = new passPerson("Bob");
    System.out.println("1. " + person);

    app.showName(person);

    System.out.println("4. " + person);
  }

  public void showName(passPerson person) {
    System.out.println("2. " + person);

    /*
     * this object in line is pointing to - passPerson person = new
     * passPerson("Bob"); so it changes the default value instead of the balue in
     * this method
     */
    person.setName("Hero");

    person = new passPerson("Sulley");

    System.out.println("3. " + person);
  }
}