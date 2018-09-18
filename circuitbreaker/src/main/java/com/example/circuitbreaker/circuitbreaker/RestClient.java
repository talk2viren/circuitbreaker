package com.example.circuitbreaker.circuitbreaker;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/hystrix")
public class RestClient {

    @HystrixCommand(fallbackMethod = "fallBack" , commandKey = "hello", groupKey = "hello")
    @RequestMapping(value = "/client/{id}",method = RequestMethod.GET)
    public String client(@PathVariable("id") Long id){

        if (id == 1)
            return "Success Call";
        else
            throw new RuntimeException("Faied");
    }


    public String fallBack(Long id){
        return "Fallback Called";
    }
}
