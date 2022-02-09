package com.pay_cre_ser.payment_credit_service.service;

import com.pay_cre_ser.payment_credit_service.model.Pay_cre_ser;
import com.pay_cre_ser.payment_credit_service.repository.Ipay_cre_ser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class Pay_ser_cre_imp implements Pay_ser_cre {

    private final Ipay_cre_ser repository;


    @Override
    public Flux<Pay_cre_ser> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Pay_cre_ser> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Pay_cre_ser> save(Pay_cre_ser psc) {
        return repository.save(psc);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
    }
}
