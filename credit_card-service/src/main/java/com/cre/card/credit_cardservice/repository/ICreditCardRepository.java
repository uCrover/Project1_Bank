package com.cre.card.credit_cardservice.repository;

import com.cre.card.credit_cardservice.model.CreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICreditCardRepository extends ReactiveMongoRepository<CreditCard,String> {
}
