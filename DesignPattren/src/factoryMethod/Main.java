package factoryMethod;

public class Main {

	public static void main(String[] args) {
		Creator creatorA = new ConcreteCreatorA();
		Product productA = creatorA.createProduct();
		
		productA.display();  // Output: Product A

		Creator creatorB = new ConcreteCreatorB();
		Product productB = creatorB.createProduct();
		
		productB.display();  // Output: Product B

	}

}
