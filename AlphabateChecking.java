import java.util.Scanner;

public class AlphabateChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char alphabet = sc.next().charAt(0);

        if ((alphabet >= 'A' && alphabet <= 'Z') || (alphabet >= 'a' && alphabet <= 'z')) {
            System.out.println(alphabet + " is a valid alphabet.");
        } else {
            System.out.println(alphabet + " is not a valid alphabet.");
        }
    }
    
}
