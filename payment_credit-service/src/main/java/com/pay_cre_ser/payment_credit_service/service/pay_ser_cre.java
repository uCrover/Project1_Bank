package com.pay_cre_ser.payment_credit_service.service;

import com.pay_cre_ser.payment_credit_service.model.pay_cre_ser;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface pay_ser_cre {
    public Flux<pay_cre_ser> findAll();
    public Mono<pay_cre_ser> findBy(String id);
    public Mono<pay_cre_ser> save(pay_cre_ser psc);
    public Mono<pay_cre_ser> update(pay_cre_ser psc);
    public void delete(String id);
}
