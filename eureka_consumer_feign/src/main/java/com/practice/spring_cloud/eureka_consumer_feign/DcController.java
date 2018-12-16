package com.practice.spring_cloud.eureka_consumer_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhenyu.yang@hand-china.com(杨振宇)
 * @version 1.0
 * @description
 * @name DcController
 * @date 2018/07/20
 */
@RestController
public class DcController {
    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }

}
