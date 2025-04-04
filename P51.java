package Programs;

//Abstract class
abstract class Bird {
 // Abstract method
 abstract void makeSound();
 
 // Concrete method
 void eat() {
     System.out.println("Eating food...");
 }
}

//Concrete subclass
class Cat extends Bird {
 void makeSound() {
     System.out.println("Bark!");
 }
}

public class P51 
{
 public static void main(String[] args) {
     Bird myCat = new Cat();
     myCat.makeSound(); // Calls abstract method implementation
     myCat.eat();       // Calls concrete method
 }
}
