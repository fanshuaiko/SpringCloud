package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试配置中心服务
 */
@RestController
@SpringBootApplication
//开启refresh机制， 需要给加载变量的类上面加载@RefreshScope注解，其它代码可不做任何改变，
// 那么在客户端执行/refresh的时候就会更新此类下面的变量值，包括通过config client从GIT获取的配置
@RefreshScope
public class SpringcloudConfClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfClientApplication.class, args);
    }

    @Value("${hello}")
    String hello;
    //访问路径http://localhost:8881/hello
    @RequestMapping("/hello")
    public String hello(){
        return hello;
    }
}
