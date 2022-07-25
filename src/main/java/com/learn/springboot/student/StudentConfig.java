package com.learn.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student argiKumar = new Student("Argi kumar","argi@gmail.com",
                    LocalDate.of(2002, Month.MAY,29));

            Student alexNani = new Student( "Alex nani","alex@gmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER,23));

            repository.saveAll(List.of(alexNani,argiKumar));
        };
    }
}
