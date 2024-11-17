package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

// StudentServer class sets up the RMI server for the StudentController
public class StudentServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the StudentController
            StudentController studentController = new StudentController();
            
            // Create a registry on the default port (1099)
            LocateRegistry.createRegistry(1099);
            
            // Bind the StudentController instance to the registry with the name "StudentController"
            Naming.rebind("StudentController", studentController);

            // Print a message indicating that the Student Server is running
            System.out.println("Student Server is running...");
        } catch (Exception e) {
            // Print the stack trace if an exception occurs during server setup
            e.printStackTrace();
        }
    }
}
