public class polyApp {
  public static void main(String[] args) {
    polyPlant p1 = new polyPlant();
    polyTree tree = new polyTree();

    polyPlant p2 = tree;
    p2.grow();

    doGrow(tree);
  }

  public static void doGrow(polyPlant plant) {
    plant.grow();
  }
}