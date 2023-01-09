package com.liviasilvasantos.pattern.strategy.demo;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String receivePayment(final String amount, final String paymentMethod) {
        if ("Paypal".equals(paymentMethod)) {
            return paypalPayment(amount);
        }
        if ("Stripe".equals(paymentMethod)) {
            return stripePayment(amount);
        }
        return "invalid payment method";
    }

    private String stripePayment(final String amount) {
        //paypal payment implementation
        return amount + "$ Stripe Payment was successful";
    }

    private String paypalPayment(final String amount) {
        //stripe payment implementation
        return amount + "$ Paypal Payment was successful";
    }
}
