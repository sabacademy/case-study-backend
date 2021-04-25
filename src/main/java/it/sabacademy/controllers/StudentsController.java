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
public class StudentsController {

	@Autowired
	private StudentsRepository studentsRepository;
	
	@Autowired
	private CoursesRepository coursesRepository;
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable long id)
	{
		Student c = studentsRepository.findById(id);
		return c;
	}
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student newStudent)
	{
		return studentsRepository.save(newStudent);
	}
	

}
