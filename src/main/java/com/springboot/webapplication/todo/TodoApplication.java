package com.springboot.webapplication.todo;
//import com.springboot.webapplication.controller.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = "com.springboot.webapplication.client")
@EntityScan(basePackages = "com.springboot.webapplication.client")
@EnableJpaRepositories(basePackages = "com.springboot.webapplication.client")
//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
public class TodoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
	
}
