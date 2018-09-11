public class tutorialTwo {
  public static void main(String[] args) {
    String[] fruits = {"banana", "apple", "grapes", "kiwi"};

    for(String fruit: fruits) {
      System.out.println(fruit);
    }

    //multi-dimensional array
    int[][] grid = {
      {11, 22, 33},
      {2, 4},
      {7, 89}
    };

    System.out.println(grid[0][2]);   // 33
    System.out.println(grid[1][0]);   // 2
    System.out.println(grid[2][1]);   // 89
    System.out.println();

    for(int row = 0; row < grid.length; row++) {
      for(int col = 0; col < grid[row].length; col++) {
        System.out.print(grid[row][col] + "\t");
      }
      System.out.println();
    }
  }
}