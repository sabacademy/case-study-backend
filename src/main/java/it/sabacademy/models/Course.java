package it.sabacademy.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Modelization of a course
 */
@Entity
@Table(name = "courses")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
    /**
     * course code
     */
    private String code;
    /**
     * course name
     */
    private String name;
    /**
     * course active status
     */
    @Column(name = "start_time")
    private LocalDate startTime;
    
    @Column(name = "end_time")
    private LocalDate endTime;
    
    @Column(name = "fl_active")
    private boolean active;
    /**
     * tutor assigned to course
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="fk_tutor")
    //@JsonBackReference
    private Tutor tutor;
    
    /**
     * students attending course
     */
    @ManyToMany
    @JoinTable(
      name = "courses_students", 
      joinColumns = @JoinColumn(name = "fk_course"), 
      inverseJoinColumns = @JoinColumn(name = "fk_student"))
    @JsonIgnoreProperties("courses")
    private List<Student> students;

    /**
     * create a course
     *
     * @param code
     * @param name
     */
    public Course(String code, String name, LocalDate startTime, LocalDate endTime) {
        this.code = code;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.students = new ArrayList<>();
    }

    public Course() {
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

    
    public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setCode(String code) {
		this.code = code;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
    
}
