package com.example.springbootscheduleddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootScheduledDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootScheduledDemoApplication.class, args);
    }

}
