package com.liviasilvasantos.pattern.strategy.demo;

import org.springframework.stereotype.Service;

@Service("Stripe")
public class StripePayment implements PaymentMethod {
    @Override
    public String receivePayment(final String amount) {
        //stripe payment implementation
        return amount + "$ Stripe Payment was successful";
    }
}
