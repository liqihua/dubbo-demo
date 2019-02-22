package com.consumera;

import com.consumera.controller.GreetingController;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

/**
 * @author liqihua
 * @since 2019/2/21
 */
public class Run {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        final GreetingController annotationAction = (GreetingController) context.getBean("greetingController");
        String hello = annotationAction.doSayHello("world");
        System.out.println("result :" + hello);
        System.in.read();
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.consumera.controller")
    @PropertySource("classpath:/dubbo-consumer.properties")
    @ComponentScan(value = {"com.consumera.controller"})
    static public class ConsumerConfiguration {

    }

}
