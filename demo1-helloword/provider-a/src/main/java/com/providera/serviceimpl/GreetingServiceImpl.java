package com.providera.serviceimpl;


import com.serviceapi.providera.GreetingService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author liqihua
 * @since 2019/2/21
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public String sayHello(String name) {
        System.out.println("--- GreetingServiceImpl -> sayHello");
        return "hello : "+name;
    }
}
