package dev.springtut.springtut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import dev.springtut.springtut.config.ContentCalendarProperties;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class SpringTutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutApplication.class, args);
	}

}
