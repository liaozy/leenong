package com.zliao.leenoog.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zliao.leenoog")
public class LeeServer {
    public static void main(String[] args) {
        SpringApplication.run(LeeServer.class, args);
    }
}
