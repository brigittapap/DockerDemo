package com.springmysql.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerdemoApplication {

	@GetMapping("/")
	public String index(){
		return "Hello! Welcome to Docker Demo application!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoApplication.class, args);
	}

}
