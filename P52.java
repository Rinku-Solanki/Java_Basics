package Programs;

interface Shape {
    // Abstract method 1
    void draw();

    // Abstract method 2
    double area();
}

// Implement the interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the draw method
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Implement the area method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class P52 
{
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        circle.draw();
        System.out.println("Circle area: " + circle.area());
    }
}