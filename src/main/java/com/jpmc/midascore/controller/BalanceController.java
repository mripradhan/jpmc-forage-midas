package com.jpmc.midascore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpmc.midascore.foundation.Balance;
import com.jpmc.midascore.service.TransactionService;

@RestController
public class BalanceController {
    private final TransactionService transactionService;

    public BalanceController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/balance")
    public Balance getBalance(@RequestParam Long userId) {
        float balance = transactionService.getUserBalanceById(userId);
        return new Balance(balance);
    }
} 