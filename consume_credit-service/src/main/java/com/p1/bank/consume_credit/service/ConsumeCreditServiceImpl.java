package com.p1.bank.consume_credit.service;

import com.p1.bank.consume_credit.model.dto.ConsumeCredit;
import com.p1.bank.consume_credit.repository.IConsumeCreditRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class ConsumeCreditServiceImpl implements IConsumeCreditService{

    private final IConsumeCreditRepository repository;


    @Override
    public Flux<ConsumeCredit> getAllConsumeCredit() {
        return this.repository.findAll();
    }

    @Override
    public Flux<ConsumeCredit> getForNroTarjCred(String nroTarjetaCredito) {
        return this.repository.findByNroTarjetaCredito(nroTarjetaCredito);
    }

    @Override
    public Mono<ConsumeCredit> saveConsumeCredit(ConsumeCredit consumeCredit) {

        //fecha actual
        String today= LocalDateTime.now().toString();
        consumeCredit.setDate(today);

            //consumir servicio de tarjeta de créditos y sacar limite de sueldo
            Integer limitSueldo=1000;
            double consumoTotal=300;
            double consumoDisponible=limitSueldo-consumoTotal;
            if(consumoDisponible>consumeCredit.getAmount()){
                return this.repository.save(consumeCredit);
            }
            else{
                return null;
            }


    }

    @Override
    public Mono<ConsumeCredit> updateConsumeCredit(ConsumeCredit consumeCredit) {
               return this.repository.save(consumeCredit);
    }

    @Override
    public Mono<ConsumeCredit> deleteConsumeCredit(String id) {
        return this.repository.findById(id)
                .flatMap( d -> this.repository.deleteById(d.get_id()).thenReturn(d));
    }
}
