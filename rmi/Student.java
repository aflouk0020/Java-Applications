package rmi;

import java.io.Serializable;

// Student class represents a student and implements Serializable for object serialization
public class Student implements Serializable {
    private String name;  // Name of the student
    private String surname;  // Surname of the student

    // Constructor to initialize the Student with name and surname
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Getter method to retrieve the name of the student
    public String getName() {
        return name;
    }

    // Getter method to retrieve the surname of the student
    public String getSurname() {
        return surname;
    }

    // Override the toString method to represent the Student as a string
    @Override
    public String toString() {
        return name + " " + surname;
    }
}
