public class EuclideanDistance {
  private static Point point1 = new Point(5.21, -7.32);
  private static Point point2 = new Point(-0.13, 3.14);
  private static Point point3 = new Point(-4.71, -8.41);

  public static void printResult(double distance) {
    System.out.printf("Distance between P1 and P2: %.2f\n", distance);
  }

  public static void euclideanDistance(Point point1, Point point2) {
    Line line = new Line(point1, point2);
    line.showPoints();
    printResult(line.calculateDistance());
  }

  public static void main(String[] args) {
    System.out.println("Euclidean Distance rounded to 2 decimal places.");
    euclideanDistance(point1, point2);
    euclideanDistance(point1, point3);
    euclideanDistance(point2, point3);
  }
}
