package rmi;

import java.rmi.Naming;

public class StudentClient {
    public static void main(String[] args) {
        try {
            // Look up the remote object (StudentController) from the RMI registry
            StudentControllerInterface studentController = (StudentControllerInterface) Naming.lookup("rmi://localhost/StudentController");

            // Create instances of StudentView and StudentGUIController
            StudentView studentView = new StudentView();
            StudentGUIController studentGUIController = new StudentGUIController(studentController, studentView);

            // Update the list of students using the GUI controller
            studentGUIController.updateStudentList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
