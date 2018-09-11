//anonymous classes

class Food {
  public void foodIntro() {
    System.out.println("Foodsss...");
  } 
}

interface FoodStall {
  public void sellFood() {
    System.out.println("");
  }
}

public class tutorialTwelve {
  public static void main(String[] args) {
    Food ramen = new Food() {
      @Override
      public void foodIntro() {
        System.out.println("ramen...");
      }
    };

    ramen.foodIntro();

    FoodStall fs1 = new FoodStall(){
    
      public void sellFood() {
        System.out.println("selling ramen...");
      }
    };

    fs1.sellFood();
  }
}