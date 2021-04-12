package it.sabacademy.models;

/**
 * Modelization of a course Attendant
 */
public class Attendant {
    /**
     * partecipating student
     */
    private Student student;
    /**
     * notes
     */
    private String notes;
    /**
     * partecipating status
     */
    private boolean partecipating;

    /**
     * Create an attendant
     *
     * @param student
     */
    public Attendant(Student student) {
        this(student, false);
    }

    /**
     * Create an attendant
     *
     * @param student
     */
    public Attendant(Student student, boolean partecipating) {
        this.student = student;
        this.partecipating = partecipating;
    }

    /**
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @param partecipating
     */
    public void setPartecipating(boolean partecipating) {
        this.partecipating = partecipating;
    }

    /**
     * @return
     */
    public Student getStudent() {
        return student;
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
    public boolean isPartecipating() {
        return partecipating;
    }
}
