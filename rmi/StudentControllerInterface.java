package rmi;

import java.rmi.RemoteException;
import java.util.ArrayList;

public interface StudentControllerInterface {

	void deleteStudent(int index) throws RemoteException;

	void addStudent(Student student) throws RemoteException;

	void editStudent(int index, Student updatedStudent) throws RemoteException;

	ArrayList<Student> getStudentList() throws RemoteException;

}
