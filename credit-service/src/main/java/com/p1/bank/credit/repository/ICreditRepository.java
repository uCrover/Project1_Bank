package com.p1.bank.credit.repository;

import com.p1.bank.credit.model.dto.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ICreditRepository extends ReactiveMongoRepository<Credit,String> {

    Mono<Credit> findByCode(String code);

    Mono<Credit> findByNumDocument(String numDocument);

}
