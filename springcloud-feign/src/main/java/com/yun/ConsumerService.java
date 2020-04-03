package com.yun;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author  YANGHAIWEN
 * @date 2020/3/17
 */

@FeignClient(name = "eureka-service")
public interface ConsumerService {
    /**
     * 得到端口号
     * @return
     */
    @RequestMapping(value = "Hello/getPort",method = RequestMethod.GET)
    String getPort();
}
