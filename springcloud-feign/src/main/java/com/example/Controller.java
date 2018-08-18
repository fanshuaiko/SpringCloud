package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private IService iService;

    //访问路径  http://localhost:8763/hello?name=lisi
    @RequestMapping("/hello")
    public String printMessage(@RequestParam(value = "name")String name){
        return iService.getMessageFromClient(name);
    }
}
