package it.sabacademy.repositories;

import org.springframework.data.repository.CrudRepository;

import it.sabacademy.models.Student;

public interface StudentsRepository extends CrudRepository<Student, Long> {
	
	public Student findById(long id);
	
}
