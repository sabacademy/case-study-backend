package it.sabacademy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.sabacademy.models.Coordinator;
import it.sabacademy.models.Tutor;
import it.sabacademy.models.User;
import it.sabacademy.repositories.UsersRepository;

@RestController
public class UsersController {
	
	@Autowired
	private UsersRepository usersRepository;
	
//	@GetMapping("/tutors/{id}")
//	public Tutor findById(@PathVariable long id) {
//	    return usersRepository.findById(id);
//	    		
//	}
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User newUser)
	{
		return usersRepository.save(newUser);
	}
	
	@PostMapping("/tutors")
	public Tutor saveTutor(@RequestBody Tutor newTutor)
	{
		return usersRepository.save(newTutor);
	}
	
	@PostMapping("/coordinators")
	public Coordinator saveCoordinator(@RequestBody Coordinator newCoordinator)
	{
		return usersRepository.save(newCoordinator);
	}


}
