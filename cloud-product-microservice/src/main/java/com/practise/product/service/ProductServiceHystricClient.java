package com.practise.product.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceHystricClient {

    @Autowired
    private RestTemplate template;


    @HystrixCommand(fallbackMethod = "default")
    public String getData(){

        return template.getForEntity("http://localhost",String.class).getBody();
    }


    public String default(){

        "noo";
    }
}
