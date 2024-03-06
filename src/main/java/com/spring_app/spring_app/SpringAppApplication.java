package com.spring_app.spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAppApplication {
	@GetMapping
	public String Message(){
		return "Welcome to Spring application deploy it to docker";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
