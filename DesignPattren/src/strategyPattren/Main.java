package strategyPattren;

public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
		
		cart.setPaymentStrategy(creditCardPayment);
		cart.checkout(100);

		PaymentStrategy paypalPayment = new PayPalPayment("john@example.com");
		cart.setPaymentStrategy(paypalPayment);
		cart.checkout(50);	
	}

}
