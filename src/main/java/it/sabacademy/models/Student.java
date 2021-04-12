package it.sabacademy.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelization of a Student
 */
public class Student {
    /**
     * student first name
     */
    private String firstName;
    /**
     * student last name
     */
    private String lastName;
    /**
     * student email
     */
    private String email;
    /**
     * course attended by student
     */
    private List<Course> courses;

    /**
     * Create a student
     *
     * @param firstName
     * @param lastName
     * @param email
     */
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public List<Course> getCourses() {
        return courses;
    }
}
