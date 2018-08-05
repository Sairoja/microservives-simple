package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.ooms.controller","com.ooms.service"})
@EntityScan(basePackages= {"com.ooms.model"})
@EnableJpaRepositories(basePackages= {"com.ooms.Repository"})
public class SpringBootOomsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOomsApplication.class, args);
	}
}
