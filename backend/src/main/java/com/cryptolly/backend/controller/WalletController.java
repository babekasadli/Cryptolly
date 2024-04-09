package com.cryptolly.backend.controller;

import com.cryptolly.backend.entity.Wallet;
import com.cryptolly.backend.request.DepositRequest;
import com.cryptolly.backend.request.SellRequest;
import com.cryptolly.backend.request.SendRequest;
import com.cryptolly.backend.service.WalletService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value="/wallets") // http://localhost:8888/api/wallets
public class WalletController {
//    private final WalletService walletService;
//
//    public WalletController(WalletService walletService) {
//        this.walletService = walletService;
//    }
//
//    @GetMapping("/{userId}")
//    public ResponseEntity<Wallet> getWallet(@PathVariable long userId) {
//        Wallet wallet = walletService.getWalletByUserId(userId);
//        if (wallet == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(wallet);
//    }
//
//    @PostMapping("/{userId}/deposit")
//    public ResponseEntity<Wallet> deposit(@PathVariable long userId, @RequestBody DepositRequest depositRequest) {
//        Wallet wallet = walletService.deposit(userId, depositRequest);
//        if (wallet == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(wallet);
//    }
//
//    @PostMapping("/{userId}/send")
//    public ResponseEntity<Wallet> send(@PathVariable long userId, @RequestBody SendRequest sendRequest) {
//        Wallet wallet = walletService.send(userId, sendRequest);
//        if (wallet == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(wallet);
//    }
//
//    @PostMapping("/{userId}/sell")
//    public ResponseEntity<Wallet> sell(@PathVariable long userId, @RequestBody SellRequest sellRequest) {
//        Wallet wallet = walletService.sell(userId, sellRequest);
//        if (wallet == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(wallet);
//    }
}
