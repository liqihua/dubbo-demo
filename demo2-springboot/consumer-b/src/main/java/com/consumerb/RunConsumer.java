package com.consumerb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author liqihua
 * @since 2019/2/21
 */
@SpringBootApplication
public class RunConsumer {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RunConsumer.class, args);
    }

}
