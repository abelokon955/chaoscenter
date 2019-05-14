package com.studienarbeit.chaoscenter.services.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeesServer {

	public static void main(String[] args) {
		// Tell server to look for registration.properties or registration.yml
		System.setProperty("spring.config.name", "employees-server");

		SpringApplication.run(EmployeesServer.class, args);
	}

}