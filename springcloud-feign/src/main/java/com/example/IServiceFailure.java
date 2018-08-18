package com.example;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * 当滴调用服务失败
 * 断路器fallback的方法
 */
@Component
@RestController
public class IServiceFailure implements IService {

    @Override
    public String getMessageFromClient(String name) {

        return "调用失败，当前服务不可用！";
    }
}
