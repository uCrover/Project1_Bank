package com.p1.bank.consume_credit.service;

import com.p1.bank.consume_credit.model.dto.ConsumeCredit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IConsumeCreditService {

    Flux<ConsumeCredit> getAllConsumeCredit();

    //Mono<Deposit> getDeposit();
    Flux<ConsumeCredit> getForNroTarjCred(String code);

    Mono<ConsumeCredit> saveConsumeCredit(ConsumeCredit consumeCredit);

    Mono<ConsumeCredit> updateConsumeCredit(ConsumeCredit consumeCredit);

    Mono<ConsumeCredit> deleteConsumeCredit(String id);

}
