package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SbootEurekaAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootEurekaAssignmentApplication.class, args);
	}

}
