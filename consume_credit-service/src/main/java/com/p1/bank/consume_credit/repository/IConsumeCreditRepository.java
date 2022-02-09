package com.p1.bank.consume_credit.repository;

import com.p1.bank.consume_credit.model.dto.ConsumeCredit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface IConsumeCreditRepository extends ReactiveMongoRepository<ConsumeCredit,String> {

    Flux<ConsumeCredit> findByNroTarjetaCredito (String nroTarjetaCredito);
}
