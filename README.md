# springcloud
springcloud功能的简单实现：包括 Eureka（服务治理）、Hystrix（熔断器）、Ribbon（负载均衡）、Zuul（网关）等功能

随着spring的广泛应用，spring cloud便宜桶的不断应用。在只会dubbo的情况下，不少招聘单位还是很介意的。所以随手搭建一个cloud的demo学习一下吧。万丈高楼平地起，从demo不断的深化再进阶吧

模块介绍：  
eureka服务治理模块  
eureka_service/eureka_consumer请求服务模块  
eureka_zuul网关模块  

启动上面四个模块：  
直接请求链接：http://localhost:8764/hi?name=fys  
通过zuul请求：localhost:6001/apigateway/hi?name=fys  
