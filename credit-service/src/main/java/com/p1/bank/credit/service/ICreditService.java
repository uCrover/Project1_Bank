package com.p1.bank.credit.service;

import com.p1.bank.credit.model.dto.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICreditService {

    Flux<Credit> getAllCredits();

    Mono<Credit> getCredit(String code);

    Mono<Credit> createCredit(Credit credit);

    Mono<Credit> updateCredit(Credit credit);

    Mono<Credit> deleteCredit(String code);

}
