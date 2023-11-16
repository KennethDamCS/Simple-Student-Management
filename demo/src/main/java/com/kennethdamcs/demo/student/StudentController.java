package com.kennethdamcs.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 5),
                        21
                )
        );
    }
}
