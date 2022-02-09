package com.pay_cre_ser.payment_credit_service.service;

import com.pay_cre_ser.payment_credit_service.model.Pay_cre_ser;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface Pay_ser_cre {
    public Flux<Pay_cre_ser> findAll();
    public Mono<Pay_cre_ser> findById(String id);
    public Mono<Pay_cre_ser> save(Pay_cre_ser psc);
    public void delete(String id);

}
