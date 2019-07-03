package com.clmen.taskmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
public class TaskmasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmasterApplication.class, args);
	}

}
