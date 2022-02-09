package com.cre.card.credit_cardservice.service;

import com.cre.card.credit_cardservice.model.CreditCard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceCreditCard {
    public Flux<CreditCard> findAll();
    public Mono<CreditCard> findByNroCuenta(String id);
    public Mono<CreditCard> save(CreditCard creditCard);
    public Mono<CreditCard> update(CreditCard creditCard);
    public void delete(String id);


}
