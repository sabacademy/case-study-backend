package it.sabacademy.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Modelization of a Tutor User registered in the system
 */
@Entity
@DiscriminatorValue("T")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Tutor extends User {
    /**
     * courses assigned to teacher
     */
	@OneToMany(mappedBy = "tutor")
	//@JsonManagedReference
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

    
    public Tutor() {
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
