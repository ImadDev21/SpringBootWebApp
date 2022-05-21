package com.springboot.webapplication.todo;
//import com.springboot.webapplication.controller.*;

import com.vaadin.flow.spring.annotation.EnableVaadin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableVaadin({"com.springboot.webapplication.view"})
//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
public class TodoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
	
}
