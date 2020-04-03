package com.example.support2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Support2Application {

    public static void main(String[] args) {
        SpringApplication.run(Support2Application.class, args);
    }

}
