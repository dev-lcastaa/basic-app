package net.tutorial.basic_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicAppApplication {

	public static void main(String[] args) {
		System.out.println("Hi");
		SpringApplication.run(BasicAppApplication.class, args);
	}

}
