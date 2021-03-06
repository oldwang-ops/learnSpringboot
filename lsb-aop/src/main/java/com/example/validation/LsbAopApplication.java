package com.example.validation;

import com.example.validation.service.Idemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class LsbAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(LsbAopApplication.class, args);
    }
    @Autowired
    private Idemo idemoImpl;
    @RequestMapping
    public void test(){
        idemoImpl.demo(new Entity(1,"sa"));
        System.out.println("执行controller方法");
    }


}
