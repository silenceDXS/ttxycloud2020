package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* @Description:  ()
* @Param:  []
* @return:
* @Author: silence
* @Date: 2020/4/7
*/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMainStart8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainStart8002.class,args);
    }
}
