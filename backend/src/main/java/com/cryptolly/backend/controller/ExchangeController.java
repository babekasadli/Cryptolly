package com.cryptolly.backend.controller;

import com.cryptolly.backend.dto.CurrencyConversionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchange")
public class ExchangeController {
    @PostMapping("/convert")
    public ResponseEntity<String> convertCurrency(@RequestBody CurrencyConversionDTO conversionDTO) {

        return ResponseEntity.ok("Currency converted successfully");
    }
}
