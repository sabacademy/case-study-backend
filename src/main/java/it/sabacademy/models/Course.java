package it.sabacademy.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelization of a course
 */
public class Course {
    /**
     * course code
     */
    private final String code;
    /**
     * course name
     */
    private String name;
    /**
     * course active status
     */
    private boolean active;
    /**
     * tutor assigned to course
     */
    private Tutor tutor;
    /**
     * students attending course
     */
    private List<Student> students;

    /**
     * create a course
     *
     * @param code
     * @param name
     */
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
        this.students = new ArrayList<>();
    }

    /**
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @return
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return
     */
    public Tutor getTutor() {
        return tutor;
    }

    /**
     * @param tutor
     */
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    /**
     *
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }
}
