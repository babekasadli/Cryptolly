package com.cryptolly.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "exchanges")
public class ExchangeHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long exchangeID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String fromCurrency;
    private String toCurrency;
    private double amount;
    private double exchangeRate;
    private Timestamp timestamp;
}
