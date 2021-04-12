package it.sabacademy.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelization of a Tutor User registered in the system
 */
public class Tutor extends User {
    /**
     * courses assigned to teacher
     */
    private List<Course> courses;

    /**
     * create a tutor
     *
     * @param firstName
     * @param lastName
     * @param email
     */
    public Tutor(String firstName, String lastName, String email) {
        super(firstName, lastName, email);

        this.courses = new ArrayList<>();
    }

    /**
     * return courses assigned to a tutor
     *
     * @return
     */
    public List<Course> getCourses() {
        return courses;
    }
}
