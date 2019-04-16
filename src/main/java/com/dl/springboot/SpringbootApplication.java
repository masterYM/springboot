package com.dl.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication  //核心注解 开启自动配置
@RestController
public class SpringbootApplication {

    /*
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;


    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot" + ",my name is " + name + "and age is " + age;
    }
    */

    @Autowired
    PeopleSettings peopleSettings;

    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot" + ",my name is " + peopleSettings.getName() + "and age is " + peopleSettings.getAge();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
