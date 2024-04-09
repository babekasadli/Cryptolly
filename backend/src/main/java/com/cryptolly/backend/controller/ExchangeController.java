package com.cryptolly.backend.controller;

import com.cryptolly.backend.dto.CurrencyConversionDTO;
import com.cryptolly.backend.entity.User;
import com.cryptolly.backend.entity.Wallet;
import com.cryptolly.backend.model.ExchangeRequest;
import com.cryptolly.backend.repository.UserRepository;
import com.cryptolly.backend.repository.WalletRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/exchange")
public class ExchangeController {
//private final WalletRepository walletRepository;
//    private final UserRepository userRepository;
//
//    public ExchangeController(WalletRepository walletRepository, UserRepository userRepository) {
//        this.walletRepository = walletRepository;
//        this.userRepository = userRepository;
//    }
//
//    @PostMapping
//    public ResponseEntity<Wallet> exchange(@RequestBody ExchangeRequest exchangeRequest) {
//        Optional<User> user = userRepository.findById(exchangeRequest.getUserId());
//        if (user.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//        Wallet wallet = walletRepository.findByUserId(exchangeRequest.getUserId());
//        if (wallet == null) {
//            return ResponseEntity.notFound().build();
//        }
//        RestTemplate restTemplate = new RestTemplate();
//        CurrencyConversionDTO currencyConversionDTO = restTemplate.getForObject("https://api.exchangeratesapi.io/latest?base=" + exchangeRequest.getFromCurrency() + "&symbols=" + exchangeRequest.getToCurrency(), CurrencyConversionDTO.class);
//        if (currencyConversionDTO == null) {
//            return ResponseEntity.notFound().build();
//        }
//        double exchangeRate = currencyConversionDTO.getRates().get(exchangeRequest.getToCurrency());
//        double amount = exchangeRequest.getAmount() * exchangeRate;
//        switch (exchangeRequest.getFromCurrency()) {
//            case "BTC":
//                wallet.setBTC(wallet.getBTC() - exchangeRequest.getAmount());
//                break;
//            case "ETH":
//                wallet.setETH(wallet.getETH() - exchangeRequest.getAmount());
//                break;
//            case "LTC":
//                wallet.setLTC(wallet.getLTC() - exchangeRequest.getAmount());
//                break;
//            case "DOGE":
//                wallet.setDOGE(wallet.getDOGE() - exchangeRequest.getAmount());
//                break;
//            case "XRP":
//                wallet.setXRP(wallet.getXRP() - exchangeRequest.getAmount());
//                break;
//            case "BCH":
//                wallet.setBCH(wallet.getBCH() - exchangeRequest.getAmount());
//                break;
//            default:
//                return ResponseEntity.notFound().build();
//        }
//        switch (exchangeRequest.getToCurrency()) {
//            case "BTC":
//                wallet.setBTC(wallet.getBTC() + amount);
//                break;
//            case "ETH":
//                wallet.setETH(wallet.getETH() + amount);
//                break;
//            case "LTC":
//                wallet.setLTC(wallet.getLTC() + amount);
//                break;
//            case "DOGE":
//                wallet.setDOGE(wallet.getDOGE() + amount);
//                break;
//            case "XRP":
//                wallet.setXRP(wallet.getXRP() + amount);
//        }
//        return null;
//    }
}
