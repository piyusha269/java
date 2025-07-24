import java.util.Scanner;

public class AreaCalculatorUsingOl {

    //  area of a square
    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square: " + result);
    }

    // area of a rectangle
    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }

    //  area of a circle
    void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculatorUsingOl calc = new AreaCalculatorUsingOl();
        int choice;

        do {
            System.out.println("\n----- Area Calculator Menu -----");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter side of square: ");
                    int side = sc.nextInt();
                    calc.area(side);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    int length = sc.nextInt();
                    System.out.print("Enter breadth: ");
                    int breadth = sc.nextInt();
                    calc.area(length, breadth);
                    break;
                case 3:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    calc.area(radius);
                    break;
                case 4:
                    System.out.println("Exiting Area Calculator. Bye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }
}


