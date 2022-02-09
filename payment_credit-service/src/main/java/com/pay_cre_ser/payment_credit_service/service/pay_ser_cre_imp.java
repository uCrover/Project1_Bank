package com.pay_cre_ser.payment_credit_service.service;

import com.pay_cre_ser.payment_credit_service.model.pay_cre_ser;
import com.pay_cre_ser.payment_credit_service.repository.Ipay_cre_ser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class pay_ser_cre_imp implements pay_ser_cre{

    private final Ipay_cre_ser repository;


    @Override
    public Flux<pay_cre_ser> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<pay_cre_ser> findBy(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<pay_cre_ser> save(pay_cre_ser psc) {
        String today= LocalDateTime.now().toString();
        psc.setFecha(today);
        return repository.save(psc);
    }

    @Override
    public Mono<pay_cre_ser> update(pay_cre_ser psc) {
        return repository.save(psc);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
    }
}
