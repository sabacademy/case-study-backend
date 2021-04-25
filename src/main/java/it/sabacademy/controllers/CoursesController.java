package it.sabacademy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.sabacademy.models.Course;
import it.sabacademy.models.Student;
import it.sabacademy.repositories.CoursesRepository;
import it.sabacademy.repositories.StudentsRepository;

@RestController
public class CoursesController {

	@Autowired
	private CoursesRepository coursesRepository;
	
	@Autowired
	private StudentsRepository studentsRepository;
	
	@GetMapping("/courses/{id}")
	public Course getCourseById(@PathVariable long id)
	{
		Course c = coursesRepository.findById(id);
		return c;
	}
	
	@PostMapping("/courses")
	public Course saveCourse(@RequestBody Course newCorso)
	{
		return coursesRepository.save(newCorso);
	}
	
	@PutMapping("/courses/{id}")
	public Course updateCorso(@RequestBody Course courseToUpdate, @PathVariable long id)
	{
		return coursesRepository.save(courseToUpdate);
	}
	
	@PutMapping("/courses/{courseId}/add-student")
	public Course addStudentToCourse(@PathVariable long courseId, @RequestParam long studentId)
	{
		Course c = coursesRepository.findById(courseId);
		
		if(c!=null)
		{
			Student s = studentsRepository.findById(studentId);
			c.getStudents().add(s);
			
		}
		return coursesRepository.save(c);
	}
}
