package com.springcloud.service;

import com.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") long id);

}
