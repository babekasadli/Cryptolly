package com.cryptolly.backend.request;

import lombok.Data;

@Data
public class SellRequest {
    private CryptoType cryptoType;
    private double amount;
}
