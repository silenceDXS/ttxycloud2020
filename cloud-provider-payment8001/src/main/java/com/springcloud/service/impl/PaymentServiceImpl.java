package com.springcloud.service.impl;

import com.springcloud.dao.PaymentMapper;
import com.springcloud.entity.Payment;
import com.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentMapper paymentMapper;
    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentMapper.getPaymentById(id);
    }
}
