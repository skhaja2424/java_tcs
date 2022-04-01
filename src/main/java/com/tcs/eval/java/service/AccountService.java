package com.tcs.eval.java.service;

import com.tcs.eval.java.model.Account;
import com.tcs.eval.java.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public void saveAccount(Account account){
        accountRepository.save(account);
    }

    public void updateAccount(Account account, int idAccount){
        accountRepository.save(account);
    }
}
