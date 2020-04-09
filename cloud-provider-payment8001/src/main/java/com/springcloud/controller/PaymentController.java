package com.springcloud.controller;

import com.springcloud.entity.CommonResult;
import com.springcloud.entity.Payment;
import com.springcloud.service.PaymentService;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.rmi.ServerError;
import java.util.List;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @Value("${server.port}")
    private String servicePort;
    @Resource
    DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result=paymentService.create(payment);
        log.info("******插入结果"+result);
        if(result>0){
            return  new CommonResult(200,"插入成功"+servicePort,result);
        }else {
            return  new CommonResult(444,"插入失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id){
        Payment payment=paymentService.getPaymentById(id);
        log.info("*****查询成功"+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功"+servicePort,payment);
        }else {
            return  new CommonResult(444,"查询失败,id为"+id,null);
        }
    }

    @GetMapping("/payment/discovery")
    public  Object  getDiscovery(){
        List<String> resultList =discoveryClient.getServices();
        for(String service:resultList){
            log.info("*****服务名称*****"+service);
        }
        List<ServiceInstance> list=discoveryClient.getInstances("CLOUD-PROVIDER-SERVICE");
        for(ServiceInstance instance:list){
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
