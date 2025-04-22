import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}
class Circle implements Shape {
  private double radius;
  Circle(double radius) {
    this.radius = radius;
  }
  public double area() {
    return Math.PI * radius * radius;
  }
  public double perimeter() {
    return 2 * Math.PI * radius;
  }
}
class Rectangle implements Shape {
  private double length;
  private double width;

  Rectangle(double length,double width) {
     this.length = length;
     this.width = width;
  }
  public double area() {
     return length * width;
  }
  public double perimeter() {
     return 2 * (length + width);
  }
}

public class ShapeCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
        System.out.println("\n=== shape calculator menu===");
        System.out.println("1.circle");
        System.out.println("2.rectangle");
        System.out.println("3.exit");
        System.out.println("enter your choice:");
        choice = sc.nextInt();

        Shape shape;
        switch (choice) {
           case 1:
               System.out.print("enter radius of the circle:");
               double radius = sc.nextDouble();
               shape = new Circle(radius);
               System.out.printf("area: %2f\n", shape.area());
               System.out.printf("perimeter: %2f\n", shape.perimeter());
               break;
           case 2:
               System.out.print("enter length of the rectangle:");
               double length = sc.nextDouble();
               System.out.print("enter width of the rectangle:");
               double width = sc.nextDouble();
               shape = new Rectangle(length,width);
               System.out.printf("area: %2f\n", shape.area());
               System.out.printf("perimeter: %2f\n", shape.perimeter());
               break;
           case 3:
               System.out.println("exiting the program.");
               break;
           default:
               System.out.println("invalid choice");
       }
   } while (choice != 3);
     sc.close();
 }
}
