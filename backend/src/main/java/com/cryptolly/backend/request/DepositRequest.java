package com.cryptolly.backend.request;

import lombok.Data;

@Data
public class DepositRequest {
    private CryptoType cryptoType;
    private double amount;
}
