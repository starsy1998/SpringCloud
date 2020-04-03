package com.yun.controller;


import com.yun.entity.Students;
import com.yun.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/Hello")
public class Controller {
    @Resource
    private StudentService studentService;
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

    @RequestMapping("/getStudent")
    public String getStudent(){
        Students students = studentService.selectByPrimaryKey(1L);
        String name = students.getName();
        return name;
    }

}