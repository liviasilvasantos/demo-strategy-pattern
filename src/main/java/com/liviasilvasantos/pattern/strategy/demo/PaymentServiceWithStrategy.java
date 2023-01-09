package com.liviasilvasantos.pattern.strategy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class PaymentServiceWithStrategy {

    @Autowired
    private Map<String, PaymentMethod> paymentMethodMap;

    public String receivePayment(final String amount, final String paymentMethod) {
        final var payment = paymentMethodMap.get(paymentMethod);
        final var result = Optional.ofNullable(payment)
                .map(p -> p.receivePayment(amount))
                .orElse("invalid payment method");
        return result;
    }
}
