package rmi;

import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

// StudentController class implements the StudentControllerInterface and extends UnicastRemoteObject for RMI functionality.
public class StudentController extends UnicastRemoteObject implements StudentControllerInterface {
    private ArrayList<Student> studentList;  // ArrayList to store the list of students
    private String fileName = "studentList.ser";  // File name for serializing and deserializing the student list

    // Constructor for the StudentController class
    public StudentController() throws RemoteException {
        studentList = new ArrayList<>();
        loadStudentList();  // Load the student list from the serialized file
    }

    // Private method to load the student list from the serialized file
    private void loadStudentList() {
        try (ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(fileName))) {
            studentList = (ArrayList<Student>) objectIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Private method to save the student list to the serialized file
    private void saveStudentList() {
        try (ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOut.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Implementation of the addStudent method from the StudentControllerInterface
    @Override
    public void addStudent(Student student) throws RemoteException {
        studentList.add(student);
        saveStudentList();  // Save the updated student list after adding a new student
    }

    // Implementation of the deleteStudent method from the StudentControllerInterface
    @Override
    public void deleteStudent(int index) throws RemoteException {
        if (index >= 0 && index < studentList.size()) {
            studentList.remove(index);
            saveStudentList();  // Save the updated student list after deleting a student
        }
    }

    // Implementation of the editStudent method from the StudentControllerInterface
    @Override
    public void editStudent(int index, Student updatedStudent) throws RemoteException {
        if (index >= 0 && index < studentList.size()) {
            studentList.set(index, updatedStudent);
            saveStudentList();  // Save the updated student list after editing a student
        }
    }

    // Implementation of the getStudentList method from the StudentControllerInterface
    @Override
    public ArrayList<Student> getStudentList() throws RemoteException {
        return studentList;  // Return the current list of students
    }
}
