package designPattren;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation outside the class.
    }
    public static Singleton getInstance() {
        if (instance == null) 
        {
            instance = new Singleton();
        }
        return instance;
    }
}
