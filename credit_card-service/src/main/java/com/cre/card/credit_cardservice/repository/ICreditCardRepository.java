package com.cre.card.credit_cardservice.repository;

import com.cre.card.credit_cardservice.model.CreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ICreditCardRepository extends ReactiveMongoRepository<CreditCard,String> {

    Mono<CreditCard> findByNroCuenta(String nroCuenta);

}
