package it.sabacademy.root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("it.sabacademy.repositories")
@ComponentScan(basePackages = {"it.sabacademy.*"})
@EntityScan("it.sabacademy.models")
public class AcademyManagerApplication {
	
    public static void main(String[] args) {

        SpringApplication.run(AcademyManagerApplication.class, args);
    }

}
