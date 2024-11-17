package rmi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

// StudentGUIController class manages the interaction between the StudentView and the StudentController
public class StudentGUIController {
	
    private StudentControllerInterface studentController;  // Reference to the remote StudentController
    private StudentView studentView;  // Reference to the GUI representation of students

    // Constructor for StudentGUIController, takes references to StudentController and StudentView
    public StudentGUIController(StudentControllerInterface studentController, StudentView studentView) {
        this.studentController = studentController;
        this.studentView = studentView;

        // Add listeners for the GUI buttons
        studentView.addAddButtonListener(new AddButtonListener());
        studentView.addDeleteButtonListener(new DeleteButtonListener());
        studentView.addEditButtonListener(new EditButtonListener());
    }

    // Update the student list in the GUI by retrieving the latest list from the server
    public void updateStudentList() {
        try {
            ArrayList<Student> students = studentController.getStudentList();
            studentView.updateStudentList(students);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    // ActionListener for the "Add" button in the GUI
    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Prompt the user to input details for a new student
            String name = JOptionPane.showInputDialog("Enter name:");
            String surname = JOptionPane.showInputDialog("Enter surname:");

            try {
                // Create a new Student with the provided name and surname
                Student newStudent = new Student(name, surname);
                
                // Add the new student to the server and update the GUI
                studentController.addStudent(newStudent);
                updateStudentList();
            } catch (RemoteException ex) {
                ex.printStackTrace();
            }
        }
    }

    // ActionListener for the "Delete" button in the GUI
    private class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the selected index from the GUI's student list
            int selectedIndex = studentView.getStudentList().getSelectedIndex();
            if (selectedIndex != -1) {
                try {
                    // Delete the selected student from the server and update the GUI
                    studentController.deleteStudent(selectedIndex);
                    updateStudentList();
                } catch (RemoteException ex) {
                    ex.printStackTrace();
                }
            } else {
                // Inform the user if no student is selected for deletion
                JOptionPane.showMessageDialog(studentView, "Select a student to delete.");
            }
        }
    }

    // ActionListener for the "Edit" button in the GUI
    private class EditButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the selected index from the GUI's student list
            int selectedIndex = studentView.getStudentList().getSelectedIndex();
            if (selectedIndex != -1) {
                try {
                    // Get the details of the selected student
                    Student selectedStudent = studentController.getStudentList().get(selectedIndex);
                    String name = JOptionPane.showInputDialog("Edit name:", selectedStudent.getName());
                    String surname = JOptionPane.showInputDialog("Edit surname:", selectedStudent.getSurname());

                    try {
                        // Create an updated Student with the edited details
                        Student updatedStudent = new Student(name, surname);
                        
                        // Edit the selected student on the server and update the GUI
                        studentController.editStudent(selectedIndex, updatedStudent);
                        updateStudentList();
                    } catch (RemoteException ex) {
                        ex.printStackTrace();
                    }
                } catch (RemoteException ex) {
                    ex.printStackTrace();
                }
            } else {
                // Inform the user if no student is selected for editing
                JOptionPane.showMessageDialog(studentView, "Select a student to edit.");
            }
        }
    }
}
