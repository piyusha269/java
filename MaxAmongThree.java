import java.util.Scanner;

public class MaxAmongThree {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();       
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        

        int max = a; 
        if (b > max) {      
            max = b; 
        }

        if (c > max) {
            max = c; 
        }
        if (a == b && b == c) {
            System.out.println("All numbers are equal.");
            return;
        }
     
        System.out.println("The maximum number is: " + max);
        sc.close();
    }
}