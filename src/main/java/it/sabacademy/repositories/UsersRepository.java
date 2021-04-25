package it.sabacademy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.sabacademy.models.Coordinator;
import it.sabacademy.models.Tutor;
import it.sabacademy.models.User;

public interface UsersRepository extends CrudRepository<User, Long> {

	public List<User> findAll();
	
//	@Query("SELECT t FROM Tutor t WHERE t.id")
//	public Tutor findTutorById(long id);
	
	@Query("SELECT t FROM Tutor t")
	List<Tutor> findAllTutors();
	
	@Query("SELECT c FROM Coordinator c")
	List<Coordinator> findAllCoordiantors();
}
