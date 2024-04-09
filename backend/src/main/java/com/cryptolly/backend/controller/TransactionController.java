package com.cryptolly.backend.controller;

import com.cryptolly.backend.service.TransactionService;
import org.springframework.web.bind.annotation.*;
import com.cryptolly.backend.entity.TransactionHistory;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/transactions") // http://localhost:8888/api/transactions
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    // Endpoint to retrieve all transactions
//    @GetMapping
//    public List<TransactionHistory> getAllTransactions() {
//        return transactionService.getAllTransactions();
//    }

    // Endpoint to create a new transaction
//    @PostMapping("/create")
//    public TransactionHistory createTransaction(@RequestBody TransactionHistory transactionHistory) {
//        return transactionService.createTransaction(transactionHistory);
//    }
//
//    // Endpoint to retrieve transactions by sender's wallet ID
//    @GetMapping("/sender/{walletId}")
//    public List<TransactionHistory> getTransactionsBySenderWalletId(@PathVariable int walletId) {
//        return transactionService.getTransactionsBySenderWalletId(walletId);
//    }
//
//    // Endpoint to retrieve transactions by receiver's wallet ID
//    @GetMapping("/receiver/{walletId}")
//    public List<TransactionHistory> getTransactionsByReceiverWalletId(@PathVariable int walletId) {
//        return transactionService.getTransactionsByReceiverWalletId(walletId);
//    }
}
