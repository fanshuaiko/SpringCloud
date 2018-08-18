package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
//要调用的服务名称
@FeignClient(value = "client" ,fallback = IServiceFailure.class)//当服务不可用时fallback的类
public interface IService {

    //此处的路径要与调用的服务接口的路径一致
    @GetMapping("/hi")
    //参数传递给服务接口
    String getMessageFromClient(@RequestParam(value = "name")String name);

}
