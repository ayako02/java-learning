public class tutorialSeven {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    
    s.append("belloooo ")
    .append("Hellloooo");

    System.out.println(s.toString());

    // formatting intergers
    System.out.printf("Total cost %-2d; quantity is %d\n", 5 , 120);

    for(int i = 0; i < 10 ;i++){
      System.out.printf("%2d: Some text here\n", i);
    }

    //formatting float value
    System.out.printf("display float numbers with maths rounding: %.2f\n", 3.5876);
    System.out.printf("display float numbers with specific amount of char: %5.1f", 123.765);
  }
}