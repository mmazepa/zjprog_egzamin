public class EuclideanDistance {
  private static double point1_x;
  private static double point1_y;
  private static double point2_x;
  private static double point2_y;
  private static double point3_x;
  private static double point3_y;
  private static double power_subtracted1and2_x;
  private static double power_subtracted1and2_y;
  private static double power_subtracted1and3_x;
  private static double power_subtracted1and3_y;
  private static double power_subtracted2and3_x;
  private static double power_subtracted2and3_y;
  private static double distance_points1and2;
  private static double distance_points1and3;
  private static double distance_points2and3;

  public static void main(String[] args) {
    point1_x = 5.21;
    point1_y = -7.32;
    point2_x = -0.13;
    point2_y = 3.14;
    point3_x = -4.71;
    point3_y = -8.41;
    power_subtracted1and2_x = Math.pow(point1_x - point2_x, 2);
    power_subtracted1and2_y = Math.pow(point1_y - point2_y, 2);
    power_subtracted1and3_x = Math.pow(point1_x - point3_x, 2);
    power_subtracted1and3_y = Math.pow(point1_y - point3_y, 2);
    power_subtracted2and3_x = Math.pow(point2_x - point3_x, 2);
    power_subtracted2and3_y = Math.pow(point2_y - point3_y, 2);
    distance_points1and2 = Math.sqrt(power_subtracted1and2_x + power_subtracted1and2_y);
    distance_points1and3 = Math.sqrt(power_subtracted1and3_x + power_subtracted1and3_y);
    distance_points2and3 = Math.sqrt(power_subtracted2and3_x + power_subtracted2and3_y);
    System.out.println("Euclidean Distance rounded to 2 decimal places.");
    System.out.println("P1 = (" + point1_x + ", " + point1_y + ")");
    System.out.println("P2 = (" + point2_x + ", " + point2_y + ")");
    System.out.printf("Distance between P1 and P2: %.2f\n", distance_points1and2);
    System.out.println("P1 = (" + point1_x + ", " + point1_y + ")");
    System.out.println("P2 = (" + point3_x + ", " + point3_y + ")");
    System.out.printf("Distance between P1 and P2: %.2f\n", distance_points1and3);
    System.out.println("P1 = (" + point3_x + ", " + point3_y + ")");
    System.out.println("P2 = (" + point2_x + ", " + point2_y + ")");
    System.out.printf("Distance between P1 and P2: %.2f\n", distance_points2and3);
  }
}
