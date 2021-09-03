package com.zhennan.consumer.feign;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("provider")
public interface ProviderFeign {

    @RequestMapping("provider/send")
    String send();
}
