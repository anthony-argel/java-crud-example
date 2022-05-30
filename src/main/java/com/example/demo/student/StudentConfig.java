package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Anthony = new Student( "Ynothna",  "anthony@gmail.com", LocalDate.of(1995, Month.AUGUST, 18));
            Student Tony = new Student("Tony",  "anthony@gmail.com", LocalDate.of(1995, Month.AUGUST, 18));

            studentRepository.saveAll(
                    List.of(Anthony, Tony)
            );
        };
    }
}
