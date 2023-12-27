package com.example.springbootkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKubernetesApplication {

	// I created this empty spring-boot project just for testing purpose.
	// You can check if the app is 'working correctly' through the actuator health endpoint (...actuator/health)

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKubernetesApplication.class, args);
	}

}
