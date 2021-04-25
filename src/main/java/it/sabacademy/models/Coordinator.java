package it.sabacademy.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Modelization of a Coordinator User registered in the system
 */
@Entity
@DiscriminatorValue("C")
public class Coordinator extends User {
    public Coordinator(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

	public Coordinator() {

	}
    
    
}
