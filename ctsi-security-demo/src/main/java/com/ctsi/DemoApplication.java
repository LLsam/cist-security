package com.ctsi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by llsam on 2018/5/6.
 */

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
