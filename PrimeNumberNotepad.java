import java.util.Scanner;

public class PrimeNumberNotepad {
	public static void main ( String [] args ){
	
	Scanner sc = new Scanner ( System.in);
        System.out.print( "Enter the number : ");
	int num = sc.nextInt();
	
	if(num <= 1){
		System.out.println (num + " is not Prime Number ");
       }
       
    	else if (num % 2 == 0){
 		System.out.println (num + " is  Prime Number ");
       }

	else{
		System.out.println (num + " is not Prime Number ");
       }
     }

}