package Programs;



abstract class Animal 
{
    abstract void makeSound();
}

// Concrete subclass
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark!");
    }
}

public class P50
{
    public static void main(String[] args)
    {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}