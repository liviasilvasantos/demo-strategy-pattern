package com.liviasilvasantos.pattern.strategy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoRunner implements ApplicationRunner {

    @Autowired
    private PaymentService paymentService;
    @Autowired
    private PaymentServiceWithStrategy paymentServiceWithStrategy;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(":<:<: Demo Runner :>:>:");
        System.out.println(paymentService.receivePayment("100", "Paypal"));
        System.out.println(paymentService.receivePayment("100", "Stripe"));
        System.out.println(paymentService.receivePayment("100", "Unknown"));

        System.out.println(":<:<: Demo Runner - Now With Strategy :>:>:");
        System.out.println(paymentServiceWithStrategy.receivePayment("100", "Paypal"));
        System.out.println(paymentServiceWithStrategy.receivePayment("100", "Stripe"));
        System.out.println(paymentServiceWithStrategy.receivePayment("100", "GooglePay"));
        System.out.println(paymentServiceWithStrategy.receivePayment("100", "Unknown"));
    }
}
