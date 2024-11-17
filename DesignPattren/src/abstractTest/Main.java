package abstractTest;


public class Main {
    public static void main(String[] args) {
        // (b) Attempting to instantiate an abstract class (compile error)
        // Shape shape = new Shape();  // Compilation Error

        // (c) Using abstract class and subclasses
        Circle circle = new Circle(5,"white");
        Rectangle rectangle = new Rectangle(4, 6,"red");

        circle.display();
        System.out.println("Circle Area: " + circle.calculateArea()+" "+circle .getColor() );

        rectangle.display();
        System.out.println("Rectangle Area: " + rectangle.calculateArea()+" "+rectangle.getColor() );
    }
}