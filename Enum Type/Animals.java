public enum Animals {
  CAT("Tom"), DOG("Hero"), MOUSE("Jerry");

  private String name;

  Animals(String name) {
    this.name = name;
  }

  public String getAnimalName() {
    return name;
  }

  public String toString() {
    return "This animal calls: " + name;
  }
}