package com.pruebas.sample.hexagonal.infra.inputport;

import java.math.BigDecimal;

import com.pruebas.sample.hexagonal.domain.Orders;

public interface OrderInputPort {
    public Orders createOrder( String customerId, BigDecimal total );
}
