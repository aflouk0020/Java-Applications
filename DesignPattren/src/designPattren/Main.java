package designPattren;

public class Main {

	public static void main(String[] args) {
		Singleton singletonInstance1 = Singleton.getInstance();
		Singleton singletonInstance2 = Singleton.getInstance();
		Singleton s = Singleton.getInstance();

		// Both instances refer to the same object.
		System.out.println(singletonInstance1 == singletonInstance2 && s == singletonInstance2);  // Output: true

	}

}
