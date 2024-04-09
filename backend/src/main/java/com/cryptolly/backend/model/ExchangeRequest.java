package com.cryptolly.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeRequest {
    private String email;
    private String fromCurrency;
    private String toCurrency;
    private double amount;
}
