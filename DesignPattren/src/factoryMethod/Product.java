package factoryMethod;

//Product Interface
interface Product {
 void display();
}

//Concrete Products
class ConcreteProductA implements Product {
 @Override
 public void display() {
     System.out.println("Product A");
 }
}

class ConcreteProductB implements Product {
 @Override
 public void display() {
     System.out.println("Product B");
 }
}

//Creator Interface
interface Creator {
 Product createProduct();
}

//Concrete Creators
class ConcreteCreatorA implements Creator {
 @Override
 public Product createProduct() {
     return new ConcreteProductA();
 }
}

class ConcreteCreatorB implements Creator {
 @Override
 public Product createProduct() {
     return new ConcreteProductB();
 }
}

