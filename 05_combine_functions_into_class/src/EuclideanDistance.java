public class EuclideanDistance {
  private static Point point1 = new Point(5.21, -7.32);
  private static Point point2 = new Point(-0.13, 3.14);
  private static Point point3 = new Point(-4.71, -8.41);

  public static double calculateDistance(Point point1, Point point2) {
    return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
  }

  public static void showPoints(Point point1, Point point2) {
    System.out.println("P1 = (" + point1.getX() + ", " + point1.getY() + ")");
    System.out.println("P2 = (" + point2.getX() + ", " + point2.getY() + ")");
  }

  public static void printResult(double distance) {
    System.out.printf("Distance between P1 and P2: %.2f\n", distance);
  }

  public static void euclideanDistance(Point point1, Point point2) {
    showPoints(point1, point2);
    printResult(calculateDistance(point1, point2));
  }

  public static void main(String[] args) {
    System.out.println("Euclidean Distance rounded to 2 decimal places.");
    euclideanDistance(point1, point2);
    euclideanDistance(point1, point3);
    euclideanDistance(point2, point3);
  }
}
