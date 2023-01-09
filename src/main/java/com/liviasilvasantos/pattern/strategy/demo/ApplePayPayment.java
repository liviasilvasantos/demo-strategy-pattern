package com.liviasilvasantos.pattern.strategy.demo;

import org.springframework.stereotype.Service;

@Service("ApplePay")
public class ApplePayPayment implements PaymentMethod{
    @Override
    public String receivePayment(final String amount) {
        //applepay payment implementation
        return amount + "$ ApplePay Payment was successful";
    }
}
