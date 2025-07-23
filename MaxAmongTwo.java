import java.util.Scanner;

public class MaxAmongTwo {
    public static void main( String[] args){
        Scanner sc= new  Scanner(System.in);
        System.out.print("Enter 1st numbers:");      
        int a = sc.nextInt();
        System.out.print("Enter 2nd numbers:");       
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Maximum number is: " + a);
        } else if (b > a) {
            System.out.println("Maximum number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }     
    }
}