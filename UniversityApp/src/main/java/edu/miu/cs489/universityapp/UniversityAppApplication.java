package edu.miu.cs489.universityapp;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class UniversityAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversityAppApplication.class, args);
    }

}
