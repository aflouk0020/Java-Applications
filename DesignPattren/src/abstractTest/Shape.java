package abstractTest;

//(a) Purpose of Abstract Classes
abstract class Shape {
  // Abstract method - to be implemented by subclasses
	abstract double calculateArea();
 
 
	 String getColor() {
		return "no color specified";
	}
 // Concrete method - shared implementation
 void display() {
     System.out.println("This is a shape.");
 }
}


class Circle extends Shape {
 double radius;
 private String color;

 Circle(double radius,String color) {
     this.radius = radius;
     this.color= color;
 }
 
 @Override
 double calculateArea() {
     return Math.PI * radius * radius;
 }


 String getColor()
{
	return this.color;
}
}
class Rectangle extends Shape 
{
 double length;
 double width;
 private String color;

 Rectangle(double length, double width, String color)
 {
     this.length = length;
     this.width = width;
     this.color = color;
 }
 @Override
 double calculateArea() {
     return length * width;
 }

public String getColor() {
	return this.color;
}
}
