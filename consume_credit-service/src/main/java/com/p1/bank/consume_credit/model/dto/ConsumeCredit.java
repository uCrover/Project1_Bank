package com.p1.bank.consume_credit.model.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("consume_credit")
public class ConsumeCredit {

    @Id
    private String _id;
    private String nroTarjetaCredito;
    private double amount;
    private String date;
}
