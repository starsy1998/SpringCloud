package com.yun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
/**
 * Feign启动类
 * @author YANGHAIWEN
 * @date 2020/3/17
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(FeignApplication.class,args);
        System.out.println( "启动Feign服务!" );
    }
}
