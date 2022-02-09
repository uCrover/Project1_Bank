package com.p1.bank.deposit.model.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "deposit")
public class Deposit {

    @Id
    private String _id;
    private String numAccount;
    private double amount;
    private String date;

}

