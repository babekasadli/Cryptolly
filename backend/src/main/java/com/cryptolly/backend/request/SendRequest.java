package com.cryptolly.backend.request;

import lombok.Data;

@Data
public class SendRequest {
    private CryptoType cryptoType;
    private double amount;
}
