package com.example.eureka_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class EurekaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulApplication.class, args);
    }

}
//demo 请求链接：http://localhost:6001/apigateway/hi?name=fys
//正常请求链接 ：http://localhost:8764/hi?name=fys
