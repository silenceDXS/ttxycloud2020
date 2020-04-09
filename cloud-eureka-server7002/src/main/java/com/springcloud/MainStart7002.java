package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import sun.applet.Main;

@SpringBootApplication
@EnableEurekaServer
public class MainStart7002 {
    public static void main(String[] args) {
        SpringApplication.run(MainStart7002.class,args);
    }
}
