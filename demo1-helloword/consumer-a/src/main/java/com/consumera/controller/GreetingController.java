package com.consumera.controller;

import com.serviceapi.providera.GreetingService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author liqihua
 * @since 2019/2/21
 */
@Component("greetingController")
public class GreetingController {

    @Reference
    private GreetingService greetingService;

    public String doSayHello(String name){
        System.out.println("--- GreetingController -> doSayHello");
        return greetingService.sayHello(name);
    }


}
