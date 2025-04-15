import java.util.Scanner;

public class AreaCalculator {

    // Area of square
    public double area(double side) {
        return side * side;
    }

    // Area of rectangle
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of triangle
    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return base * height;
        }
    }

    // Area of circle
    public double area(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Choose shape to calculate area:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side of square: ");
                double side = scanner.nextDouble();
                System.out.println("Area of square: " + calc.area(side));
                break;

            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double breadth = scanner.nextDouble();
                System.out.println("Area of rectangle: " + calc.area(length, breadth));
                break;

            case 3:
                System.out.print("Enter base of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of triangle: " + calc.area(base, height, true));
                break;

            case 4:
                System.out.print("Enter radius of circle: ");
                int radius = scanner.nextInt();
                System.out.println("Area of circle: " + calc.area(radius));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
