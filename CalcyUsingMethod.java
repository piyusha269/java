import java.util.Scanner;

public class CalcyUsingMethod {

    int num1, num2, result;

    void inputNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }

    void add() {
        result = num1 + num2;
        System.out.println("Addition: " + result);
    }

    void subtract() {
        result = num1 - num2;
        System.out.println("Subtraction: " + result);
    }

    void multiply() {
        result = num1 * num2;
        System.out.println("Multiplication: " + result);
    }

    void divide() {
        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {

        CalcyUsingMethod calculator = new CalcyUsingMethod();
       
        
        System.out.println("------ Calculator ------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        calculator.inputNumbers();

        switch (choice) {
            case 1:
                calculator.add();
                break;
            case 2:
                calculator.subtract();
                break;
            case 3:
                calculator.multiply();
                break;
            case 4:
                calculator.divide();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
    
}
