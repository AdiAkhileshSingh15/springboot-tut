package dev.springtut.springtut;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.springtut.springtut.model.Content;
import dev.springtut.springtut.model.Status;
import dev.springtut.springtut.model.Type;
import dev.springtut.springtut.repository.ContentRepository;

@SpringBootApplication
public class SpringTutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			// Insert some data into the database
			Content content = new Content(null,
					"About DRF",
					"Building DRF APIs!",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					null);
			repository.save(content);
		};
	}

}
