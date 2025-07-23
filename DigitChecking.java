import java.util.Scanner;

public class DigitChecking {
    public static void main( String[] args){
        Scanner sc = new Scanner ( System.in);
        System.out.print("Enter a digit: ");
        char digit = sc.next().charAt(0);      

        if(digit >= '0' && digit <= '9'){    // Check if the character is a digit '' is used to insure its not checking Ascii value
            System.out.println(digit + " is a valid single digit.");
        } else {
            System.out.println(digit + " is not a valid single digit.");
        }
    }
}
