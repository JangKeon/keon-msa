package com.example.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ServiceBApplication {

    @RequestMapping("/")
    public String serviceb(){
        return "MSA Process is fun !";
    }

    @RequestMapping("/grade")
    public String Grade() {
        return "Account Info : VIP";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class, args);
    }

}
