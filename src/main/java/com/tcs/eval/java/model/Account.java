package com.tcs.eval.java.model;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAccount;
    private String customerName;
    private String accountType;
    private double balance;
    @OneToMany(targetEntity = Transaction.class)
    private List<Transaction> transactions;

}
