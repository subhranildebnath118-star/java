import java.util.Scanner;

class Point {
    int x, y;
    void input(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void display() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

class Circle {
    double radius;
    Point center; 
    
    void input(int x, int y, double r) {
        center = new Point();
        center.input(x, y);
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

   
    void display() {
        center.display();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }
}


public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();


        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        c.input(x, y, r);

     
        System.out.println("\nCircle Details:");
        c.display();

       
    }
}