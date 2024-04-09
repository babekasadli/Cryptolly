package com.cryptolly.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "transactions")
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transactionID;

    @ManyToOne
    @JoinColumn(name = "sender_address")
    private Wallet senderAddress;

    @ManyToOne
    @JoinColumn(name = "receiver_address")
    private Wallet receiverAddress;

    private double amount;
    private Timestamp timestamp;
}
