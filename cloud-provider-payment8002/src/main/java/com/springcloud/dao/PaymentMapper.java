package com.springcloud.dao;

import com.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") long id);
}
