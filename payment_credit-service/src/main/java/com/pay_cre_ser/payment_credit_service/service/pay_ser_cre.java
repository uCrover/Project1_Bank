package com.pay_cre_ser.payment_credit_service.service;

import com.pay_cre_ser.payment_credit_service.model.pay_cre_ser;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface pay_ser_cre {
    Flux<pay_cre_ser> findAll();
    Mono<pay_cre_ser> save(pay_cre_ser pcs);
    void deletePay_Ser_Cre(Integer id);
}
