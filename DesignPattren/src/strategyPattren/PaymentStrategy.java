package strategyPattren;

//Strategy Interface
interface PaymentStrategy {
	void pay(int amount);
}

//Concrete Strategies
class CreditCardPayment implements PaymentStrategy {
	 private String cardNumber;
	
	 public CreditCardPayment(String cardNumber) {
	     this.cardNumber = cardNumber;
	 }
	
	 @Override
	 public void pay(int amount) {
	     System.out.println("Paid " + amount + " using credit card: " + cardNumber);
	 }
}


// 
class PayPalPayment implements PaymentStrategy {
	 private String email;
	
	 public PayPalPayment(String email) {
	     this.email = email;
	 }
	
	 @Override
	 public void pay(int amount) {
	     System.out.println("Paid " + amount + " using PayPal: " + email);
	 }
}

//Context
class ShoppingCart {
	 private PaymentStrategy paymentStrategy;
	
	 public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
	     this.paymentStrategy = paymentStrategy;
	 }
	
	 public void checkout(int amount) {
	     paymentStrategy.pay(amount);
	 }
}
