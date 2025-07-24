import java.util.Scanner ;

public class DigitAlphabateSpecialchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = sc.next().charAt(0);

        if (inputChar >= '0' && inputChar <= '9') {
            System.out.println(inputChar + " is a valid digit.");
        } else if ((inputChar >= 'A' && inputChar <= 'Z') || (inputChar >= 'a' && inputChar <= 'z')) {
            System.out.println(inputChar + " is a valid alphabet.");
        } else {
            System.out.println(inputChar + " is a special character.");
        }
    }
}