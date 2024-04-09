package com.cryptolly.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @Basic(optional = false)
    private long id;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "email", unique=true, length = 50, nullable = false)
    private String email;

    @Column(name = "password", length = 100, nullable = false)
    private String password;

    @Column(name = "username", unique = true, length = 100)
    private String username;

    @Column(name = "country", length = 100)
    private String country;

    @Column(name = "dob")
    private LocalDate dob;

    @OneToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;
}
