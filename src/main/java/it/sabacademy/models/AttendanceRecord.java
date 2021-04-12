package it.sabacademy.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Modelization of a attendancy record
 */
public class AttendanceRecord {
    /**
     * Course student is attending to
     */
    private Course course;
    /**
     * Tutor who record the attendance
     */
    private Tutor tutor;
    /**
     * Date
     */
    private LocalDateTime dateTime;
    /**
     * Notes
     */
    private String notes;
    /**
     * List of students attending to course
     */
    private List<Attendant> attendants;

    /**
     * Create a record
     *
     * @param course
     * @param tutor
     * @param dateTime
     */
    public AttendanceRecord(Course course, Tutor tutor, LocalDateTime dateTime) {
        this.course = course;
        this.tutor = tutor;
        this.dateTime = dateTime;
        this.attendants = new ArrayList<>();
    }

    /**
     * @param dateTime
     */
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return
     */
    public Course getCourse() {
        return course;
    }

    /**
     * @return
     */
    public Tutor getTutor() {
        return tutor;
    }

    /**
     * @return
     */
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * @return
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @return
     */
    public List<Attendant> getAttendants() {
        return attendants;
    }
}
