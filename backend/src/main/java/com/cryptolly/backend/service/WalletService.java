package com.cryptolly.backend.service;

import com.cryptolly.backend.entity.Wallet;
import com.cryptolly.backend.repository.WalletRepository;
import com.cryptolly.backend.request.DepositRequest;
import com.cryptolly.backend.request.SellRequest;
import com.cryptolly.backend.request.SendRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WalletService {
    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }
    
}

