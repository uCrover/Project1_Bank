package com.p1.bank.deposit.service;

import com.p1.bank.deposit.model.dto.Deposit;
import com.p1.bank.deposit.repository.IDepositRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class DepositServiceImpl implements IDepositService {

    private final IDepositRepository depositRepository;

    @Override
    public Flux<Deposit> getAllDeposits() {
        return this.depositRepository.findAll();
    }

    @Override
    public  Flux<Deposit> getDepositsForAccount(String numAccount){
        return this.depositRepository.findByNumAccount(numAccount);
    }

    @Override
    public Mono<Deposit> saveDeposit(Deposit deposit) {
        /*
        método para buscar el número de cuenta de la otra API bank_account-service, si encuentra...realizar restricciones
        Ahorro:con un límite máximo de movimientos mensuales.
        Cuenta corriente: sin límite de movimientos mensuales.
        Plazo fijo: solo permite un movimiento de retiro o depósito en un día específico del mes.
         */

        String today= LocalDateTime.now().toString();
        deposit.setDate(today);

        return this.depositRepository.save(deposit);
    }

    @Override
    public Mono<Deposit> updateDeposit(Deposit deposit) {
        String id = deposit.get_id();
        return this.depositRepository.findById(id).flatMap(dep -> {dep.set_id(id);
                    return this.depositRepository.save(deposit) ;})
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Mono<Deposit> deleteDeposit(String id) {
        return this.depositRepository.findById(id)
                .flatMap( d -> this.depositRepository.deleteById(d.get_id()).thenReturn(d));
    }
}
