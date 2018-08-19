package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心服务
 */

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringcloudConfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfApplication.class, args);
    }

}
