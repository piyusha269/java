    class Animal{
        void eat() {
        System.out.println("This is object of animal  class");
        }
    }

    class Dog extends Animal{
        void Bark(){
            System.out.println("This is object of Dog class");
        }
    }
    
    public class SimpleInheritance {
    public  static void main (String [] args){
        Dog D = new Dog();
        D.eat();
        D.Bark();

    }
}
