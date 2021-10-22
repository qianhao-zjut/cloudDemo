package com.test.springcloud.controller;


import com.test.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/consumer")
public class OrderController {

    @Resource
    PaymentFeignService paymentFeignService;

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String getPaymentById(@PathVariable("id") Integer id){

        return paymentFeignService.getPaymentById(id);
    }
}
