public class Triangle implements DistanseInterface{
  private Point point1;
  private Point point2;
  private Point point3;

  public Triangle() {}

  public Triangle(Point point1, Point point2, Point point3) {
    this.point1 = point1;
    this.point2 = point2;
    this.point3 = point3;
  }

  public void setPoint1(Point point1) {
    this.point1 = point1;
  }
  public Point getPoint1() {
    return point1;
  }
  public void setPoint2(Point point2) {
    this.point2 = point2;
  }
  public Point getPoint2() {
    return point2;
  }
  public void setPoint3(Point point3) {
    this.point3 = point3;
  }
  public Point getPoint3() {
    return point3;
  }

  public void showPoints() {
    System.out.println("P1 = (" + this.point1.getX() + ", " + this.point1.getY() + ")");
    System.out.println("P2 = (" + this.point2.getX() + ", " + this.point2.getY() + ")");
    System.out.println("P3 = (" + this.point3.getX() + ", " + this.point3.getY() + ")");
  }

  public double calculateDistance() {
    double distanse = Math.sqrt(Math.pow(this.point1.getX() - this.point2.getX(), 2) 
          + Math.pow(this.point1.getY() - this.point2.getY(), 2));
    distanse += Math.sqrt(Math.pow(this.point2.getX() - this.point3.getX(), 2) 
          + Math.pow(this.point2.getY() - this.point3.getY(), 2));
    distanse += Math.sqrt(Math.pow(this.point1.getX() - this.point3.getX(), 2) 
          + Math.pow(this.point1.getY() - this.point3.getY(), 2));
    return distanse;
  }

  public static void printResult(double distance) {
    System.out.printf("Distance between P1 and P2 and P3: %.2f\n", distance);
  }

  public void euclideanDistance() {
    this.showPoints();
    printResult(this.calculateDistance());
  }
}
