//class Message
//method messageInput  
//method displayMessage

import java.util.Scanner;   

public class Message {
    String message;

    void messageInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        message = sc.nextLine();
    }

    void displayMessage() {
       
        System.out.println("Your Messagge is: " + message);
        }

    public static void main(String[] args) {
        Message msg = new Message();
        msg.messageInput();
        msg.displayMessage();
        
    }
}