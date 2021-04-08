package io.harmed.spring.springboot.spring_course_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "io.harmed")
public class SpringCourseSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCourseSpringbootApplication.class, args);
    }

}
