public class tutorialNine {
  public static void main(String[] args) {
    byte byteValue = 20;
    short shortValue = 33;
    int intValue = 666;
    long longValue = 23780;
    double doubleValue = 122.2;

    float floatValue = 8823.8f;
    float floatValue2 = (float)33.11;
    
    doubleValue = intValue;
    System.out.println(doubleValue);
    
    intValue = (int)longValue;
    System.out.println(intValue);
    
    intValue = (int)floatValue;
    System.out.println(intValue);
    
    System.out.println(Byte.MAX_VALUE);
    byteValue = (byte)128;
    System.out.println(byteValue);
  }
}