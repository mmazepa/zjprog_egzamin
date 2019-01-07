public class EuclideanDistance {
  private static double point1_x;
  private static double point1_y;
  private static double point2_x;
  private static double point2_y;
  private static double point3_x;
  private static double point3_y;

  public static double calculateDistance(double p1x, double p1y, double p2x, double p2y) {
    double power_subtracted1and2_x = Math.pow(p1x - p2x, 2);
    double power_subtracted1and2_y = Math.pow(p1y - p2y, 2);
    double distance_points1and2 = Math.sqrt(power_subtracted1and2_x + power_subtracted1and2_y);
    return distance_points1and2;
  }

  public static void showPoints() {
    System.out.println("P1 = (" + point1_x + ", " + point1_y + ")");
    System.out.println("P2 = (" + point2_x + ", " + point2_y + ")");
    System.out.println("P3 = (" + point3_x + ", " + point3_y + ")");
  }

  public static void printResult(double distance) {
    System.out.printf("Distance between P1 and P2: %.2f\n", distance);
  }

  public static void main(String[] args) {
    point1_x = 5.21;
    point1_y = -7.32;
    point2_x = -0.13;
    point2_y = 3.14;
    point3_x = -4.71;
    point3_y = -8.41;
    System.out.println("Euclidean Distance rounded to 2 decimal places.");
    showPoints();
    printResult(calculateDistance(point1_x, point1_y, point2_x, point2_y));
    printResult(calculateDistance(point1_x, point1_y, point3_x, point3_y));
    printResult(calculateDistance(point2_x, point2_y, point3_x, point3_y));
  }
}
