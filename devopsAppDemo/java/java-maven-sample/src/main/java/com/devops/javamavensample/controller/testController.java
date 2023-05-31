package com.devops.javamavensample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class testController
{

    @GetMapping
    public String  sayHello() {
        for (int i = 1 ; i <= 10 ; i++) {
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } , "HelloThread - " + i);
            t.start();
        }
        System.out.println("test");
        return "index";
    }



}
