import java.util.Scanner;
class Rectangle {
    double length, breadth;
    double getArea() {
        return length * breadth;
       }
    double getPerimeter(){
        return 2*(length + breadth);
       }
}
public class exp2 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          Rectangle rect = new Rectangle();
          System.out.println("enter length:");
          rect.length = scanner.nextDouble();
          System.out.println("enter breadth:");
          rect.breadth = scanner.nextDouble();
          System.out.println("area:"+rect.getArea());
          System.out.println("perimeter:"+rect.getPerimeter());
          scanner.close();
         }
}
"exp2.java" 24L, 720C                                         14,11         Top
