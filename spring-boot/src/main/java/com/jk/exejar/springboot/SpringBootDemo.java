package com.jk.exejar.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jacky. 2019/4/25 2:15 PM
 */
@SpringBootApplication
@RestController
@Configuration
public class SpringBootDemo {

    @Value("${config.name}")
    private String name;


    @RequestMapping("name")
    public String getName() {
        return name;
    }

    @RequestMapping("ping")
    public String greet() {
        return "pong";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo.class, args);
    }
}
