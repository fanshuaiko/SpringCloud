package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * client3服务，供feign负载均衡测试
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudClient3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClient3Application.class, args);
    }
    //显示信息
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name") String name){
        return "hi: " + name + " this is client:" + port;
    }
}

