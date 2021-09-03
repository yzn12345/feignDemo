package com.zhennan.consumer.controller;


import com.zhennan.consumer.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ProviderFeign providerFeign;

    @GetMapping("send")
    public String send(){
        String send = providerFeign.send();
        return send + "consumer send get called";
    }

}
