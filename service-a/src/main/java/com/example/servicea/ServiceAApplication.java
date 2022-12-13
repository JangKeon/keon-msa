package com.example.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ServiceAApplication {


    // Hi I
    @RequestMapping("/")
    public String servicea(){
        return "Keon's MSA WORK !";
    }

    @RequestMapping("/user")
    public String User() {
        return "Name : Jang Keon\nAge : 25\nHobby : Boarding";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }

}
