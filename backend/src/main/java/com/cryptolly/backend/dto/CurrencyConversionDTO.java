package com.cryptolly.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConversionDTO {
    private String fromCurrency;
    private String toCurrency;
    private double amount;
}
