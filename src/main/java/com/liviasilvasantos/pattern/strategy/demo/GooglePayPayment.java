package com.liviasilvasantos.pattern.strategy.demo;

import org.springframework.stereotype.Service;

@Service("GooglePay")
public class GooglePayPayment implements PaymentMethod{
    @Override
    public String receivePayment(final String amount) {
        //googlepay payment implementation
        return amount + "$ GooglePay Payment was successful";
    }
}
