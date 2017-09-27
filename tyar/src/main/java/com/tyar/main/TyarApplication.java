package com.tyar.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@ComponentScan(basePackages = "com.tyar.*")
@SpringBootApplication
@EnableMongoRepositories("com.tyar.repository")
public class TyarApplication {

	public static void main(String[] args) {
		SpringApplication.run(TyarApplication.class, args);
	}
}
