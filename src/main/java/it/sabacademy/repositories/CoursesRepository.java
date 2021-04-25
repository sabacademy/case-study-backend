package it.sabacademy.repositories;

import org.springframework.data.repository.CrudRepository;

import it.sabacademy.models.Course;

public interface CoursesRepository extends CrudRepository<Course, Long> {

	public Course findById(long id);
}
