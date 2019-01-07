public class EuclideanDistance {
  private static double p1x;
  private static double p1y;
  private static double p2x;
  private static double p2y;
  private static double p3x;
  private static double p3y;
  private static double pow_1_2x;
  private static double pow_1_2y;
  private static double pow_1_3x;
  private static double pow_1_3y;
  private static double pow_2_3x;
  private static double pow_2_3y;
  private static double d_1_2;
  private static double d_1_3;
  private static double d_2_3;

  public static void main(String[] args) {
    p1x = 5.21;
    p1y = -7.32;
    p2x = -0.13;
    p2y = 3.14;
    p3x = -4.71;
    p3y = -8.41;
    pow_1_2x = Math.pow(p1x - p2x, 2);
    pow_1_2y = Math.pow(p1y - p2y, 2);
    pow_1_3x = Math.pow(p1x - p3x, 2);
    pow_1_3y = Math.pow(p1y - p3y, 2);
    pow_2_3x = Math.pow(p2x - p3x, 2);
    pow_2_3y = Math.pow(p2y - p3y, 2);
    d_1_2 = Math.sqrt(pow_1_2x + pow_1_2y);
    d_1_3 = Math.sqrt(pow_1_3x + pow_1_3y);
    d_2_3 = Math.sqrt(pow_2_3x + pow_2_3y);
    System.out.println("Euclidean Distance rounded to 2 decimal places.");
    System.out.println("P1 = (" + p1x + ", " + p1y + ")");
    System.out.println("P2 = (" + p2x + ", " + p2y + ")");
    System.out.printf("Distance between P1 and P2: %.2f\n", d_1_2);
    System.out.println("P1 = (" + p1x + ", " + p1y + ")");
    System.out.println("P2 = (" + p3x + ", " + p3y + ")");
    System.out.printf("Distance between P1 and P2: %.2f\n", d_1_3);
    System.out.println("P1 = (" + p2x + ", " + p2y + ")");
    System.out.println("P2 = (" + p3x + ", " + p3y + ")");
    System.out.printf("Distance between P1 and P2: %.2f\n", d_2_3);
  }
}
