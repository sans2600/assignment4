package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbootEurekaAssignmentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootEurekaAssignmentClientApplication.class, args);
	}

	@GetMapping
	public String hi()
	{
		return "Assignment Question 4";
	}
}
