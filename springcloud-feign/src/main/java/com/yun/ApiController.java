package com.yun;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author YANGHAIWEN
 * @date 2020/3/17
 */
@RestController
@RequestMapping(value = "/feign")
public class ApiController {
    @Resource
    ConsumerService service;
    @RequestMapping(value = "/getPort")
    public String getPort(){
       return service.getPort();
    }
}
