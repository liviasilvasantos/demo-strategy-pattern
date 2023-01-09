package com.liviasilvasantos.pattern.strategy.demo;

import org.springframework.stereotype.Service;

@Service("Paypal")
public class PaypalPayment implements PaymentMethod{

    @Override
    public String receivePayment(final String amount) {
        //paypal payment implementation
        return amount + "$ Paypal Payment was successful";
    }
}
