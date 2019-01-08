public class EuclideanDistance {
  private static Point point1 = new Point(5.21, -7.32);
  private static Point point2 = new Point(-0.13, 3.14);
  private static Point point3 = new Point(-4.71, -8.41);

  public static void main(String[] args) {
    System.out.println("Euclidean Distance rounded to 2 decimal places.");
    new Line(point1, point2).euclideanDistance();
    new Line(point1, point3).euclideanDistance();
    new Line(point2, point3).euclideanDistance();
  }
}
