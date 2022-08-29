package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbDockerAssignmentQ1Application {

	public static void main(String[] args) {
		SpringApplication.run(SbDockerAssignmentQ1Application.class, args);
	}
	
	@GetMapping("/start")
	public String sayHi()
	{
		return "Assignment 4 Qusrtion 1";
	}

}
