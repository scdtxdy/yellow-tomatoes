package com.scd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableCaching
@RestController
@SpringBootApplication
public class YellowTomatoesSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(YellowTomatoesSystemApplication.class, args);
    }

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

}
