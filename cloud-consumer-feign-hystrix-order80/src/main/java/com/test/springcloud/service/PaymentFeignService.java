package com.test.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String getPaymentById(@PathVariable("id") Integer id);
}
