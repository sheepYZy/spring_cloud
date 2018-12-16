package com.practice.spring_cloud.eureka_consumer_feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhenyu.yang@hand-china.com(杨振宇)
 * @version 1.0
 * @description
 * @name DcClient
 * @date 2018/07/20
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
