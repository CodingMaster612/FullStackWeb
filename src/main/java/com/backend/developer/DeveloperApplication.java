package com.backend.developer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.backend.model"})
public class DeveloperApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeveloperApplication.class, args);
	}

}
