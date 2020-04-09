package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
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
@EnableDiscoveryClient
public class PaymentMainStart8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainStart8001.class,args);
    }
}
