package com.consumerb.controller;

import com.serviceapib.GreetingService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liqihua
 * @since 2019/2/21
 */
//@Component("greetingController")
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Reference
    private GreetingService greetingService;


    @RequestMapping("/doSayHello")
    public String doSayHello(String name){
        System.out.println("--- GreetingController -> doSayHello");
        String result = greetingService.sayHello(name);
        System.out.println("--- result : "+result);
        return result;
    }


}
