package observer;
public class Main {
	public static void main(String[] args) {
		ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
		ConcreteObserver observer2 = new ConcreteObserver("Observer 2");
		
		Subject subject = new Subject();
		
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.notifyObservers("Hello, observers!");
	}
}
