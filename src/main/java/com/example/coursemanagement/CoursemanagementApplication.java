package com.example.coursemanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.coursemanagement.mapper")
public class CoursemanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursemanagementApplication.class, args);
    }
}
