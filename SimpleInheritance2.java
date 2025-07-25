import java.util.Scanner;

class PersonDetails{
    String name;
    int age;

    Scanner sc = new Scanner(System.in);

    void basicInfo(){
        System.out.print("Enter the Name = ");
        name = sc.nextLine();

        System.out.print("Enter the Age = ");
        age = sc.nextInt(); 
    }

    void displayBasicDetails(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}

class StudentDetails extends PersonDetails{
    int rollno;
    
    Scanner sc = new Scanner(System.in);

    void rollNo(){
        System.err.print("Enter the roll no = ");
        rollno = sc.nextInt();
    }

    void displyRollno(){
        System.out.print("Rollno = "+rollno);
    }

}

public class SimpleInheritance2 {
    public static void main(String[] args) {
        
    StudentDetails S =  new StudentDetails();

    S.basicInfo();
    S.rollNo();
    System.out.println("----------------------------------------");
    S.displayBasicDetails();
    S.displyRollno();
    }
}

