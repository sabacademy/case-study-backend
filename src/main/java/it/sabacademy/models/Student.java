package it.sabacademy.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Modelization of a Student
 */
@Entity(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
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
    @ManyToMany(mappedBy = "students")
    @JsonIgnoreProperties("students")
    private List<Course> courses;

    /**NO-ARGS constructor */
    public Student()
    {
    	
    }
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

    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
    
    
}
