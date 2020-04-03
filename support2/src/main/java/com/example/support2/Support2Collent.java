package com.example.support2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class Support2Collent {

    @Value(value = "${server.port}")
    String port;
    @RequestMapping("/World/{s}")
    public String helloWorld(@PathVariable String s){
        System.out.println("传入的值为："+s);
        return "传入的值为："+s;
    }

    @RequestMapping("/getPort")
    public String getPort(){
        return "服务提供者的端口号："+port;
    }

}
