package com.tcs.eval.java.controller;

import com.tcs.eval.java.model.Account;
import com.tcs.eval.java.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @PostMapping("/account")
    public void saveAccount(@RequestBody Account account){
        accountRepository.save(account);
    }

    @PutMapping("/account")
    public void updateAccount(@RequestBody Account account){
        accountRepository.save(account);
    }
}
