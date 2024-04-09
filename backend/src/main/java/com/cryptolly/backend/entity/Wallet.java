package com.cryptolly.backend.entity;

import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
@Table(name = "wallets")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long walletID;

    @OneToOne(mappedBy = "wallet")
    private User user;

    @Column(name = "currency", length = 100)
    private String currency;
    @Column(name = "address", length = 100, unique = true)
    private String address;
    @Column(name = "balance")
    private double balance;
}
