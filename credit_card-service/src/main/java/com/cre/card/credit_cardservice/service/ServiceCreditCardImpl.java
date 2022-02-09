package com.cre.card.credit_cardservice.service;

import com.cre.card.credit_cardservice.model.CreditCard;
import com.cre.card.credit_cardservice.repository.ICreditCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ServiceCreditCardImpl implements ServiceCreditCard{

    private final ICreditCardRepository repository;

    @Override
    public Flux<CreditCard> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<CreditCard> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<CreditCard> save(CreditCard creditCard) {
        return repository.save(creditCard);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();

    }
}
