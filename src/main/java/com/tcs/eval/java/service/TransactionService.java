package com.tcs.eval.java.service;

import com.tcs.eval.java.model.Transaction;
import com.tcs.eval.java.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;


    public void saveTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactions(){
        List<Transaction> transactions = new ArrayList<Transaction>();
        transactionRepository.findAll().forEach(transaction->transactions.add(transaction));
        return transactions;
    }

    public void deleteTransaction(int transactionId){
        transactionRepository.deleteById(transactionId);
    }


}
