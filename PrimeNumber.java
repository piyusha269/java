import java.util.Scanner;

public class PrimeNumber {
public static void main( String[] args ) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter the Number : ");
    int num = sc.nextInt();

    if(num <=1) {
        System.out.println(num + " Number is not prime");
    }
    else if (num % 2 == 0 ){
        System.out.println(num + " Number is prime");
    }
    else {
        System.out.println(num + " Number is not prime");
    }
   

    sc.close();
  }
} 
    
