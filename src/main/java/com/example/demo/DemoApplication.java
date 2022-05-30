package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World";
	}

	@GetMapping("/")
	public List list() {
		return List.of("Pog", "Champ", "poggies");
	}

	@GetMapping("/student")
	public List<Student> students() {
		return List.of(
				new Student(1L, "Anthony", "anthony@gmail.com", LocalDate.of(1995, Month.AUGUST, 18))
		);
	}

}
