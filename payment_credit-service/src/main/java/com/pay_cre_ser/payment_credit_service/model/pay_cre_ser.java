package com.pay_cre_ser.payment_credit_service.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(collection = "pay_cre_ser")
public class pay_cre_ser {
    @Id
    private String id;
    private String nroDocumento;
    private int cantidad;
    private String fecha;

}
