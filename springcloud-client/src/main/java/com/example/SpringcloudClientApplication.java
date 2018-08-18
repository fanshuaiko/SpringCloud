package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * client服务与client3服务相同，只是端口号不同，供feign负载均衡测试
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClientApplication.class, args);
    }

//显示信息
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name") String name){
        System.out.println("进入了client");
        //当调用该服务时，抛出异常，让熔断器fallback
        throw new RuntimeException();
//        return "hi: " + name + " this is client:" + port;
    }
}
