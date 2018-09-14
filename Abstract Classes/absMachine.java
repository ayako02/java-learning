public abstract class absMachine {
  private int id;

  public int getID() {
    return id;
  }

  public void setID(int id) {
    this.id = id;
  }

  public abstract void startTask();

  public abstract void doStuff();

  public abstract void endTask();

  public void run() {
    startTask();
    doStuff();
    endTask();
  }
}