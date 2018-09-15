public class recursion {
  public static void main(String[] args) {
    // calculateNum(4);

    // Factorial of 4! = 4*3*2*1
    System.out.println(calculateNum(4));
  }

  private static int calculateNum(int num) {

    System.out.println(num);

    if (num == 1)
      return 1;

    /* else statement: */
    // return calculateNum(num - 1);
    return calculateNum(num - 1) * num;
  }
}