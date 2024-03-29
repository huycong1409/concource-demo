package com.example.concourcedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConcourseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcourseDemoApplication.class, args);
	}

	@GetMapping("/getHello")
	public ResponseEntity<String> getHello() {
		return new ResponseEntity<>("Concourse test!", HttpStatus.OK);
	}

}
