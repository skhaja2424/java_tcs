package com.tcs.eval.java.controller;

import com.tcs.eval.java.model.Transaction;
import com.tcs.eval.java.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping("/transactions")
    private List<Transaction> getTransactions(){
        return transactionService.getTransactions();
    }

    @PostMapping("/transaction")
    private int saveTransaction(@RequestBody Transaction transaction){
        transactionService.saveTransaction(transaction);
        return transaction.getIdTransaction();
    }
    @DeleteMapping("/transaction/{transactionId}")
    private void deleteTransaction(@PathVariable("transactionId") int transactionId){
        transactionService.deleteTransaction(transactionId);
    }

}
