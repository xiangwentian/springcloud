package com.example.eureka_consumer.controller;

import com.example.eureka_consumer.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController(value = "/hello")
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        log.info("invoke hello controller method hi,param name:{}",name);
        return helloService.hiService(name);
    }
}
