package com.ban.acc.bank_accountservice.service;

import com.ban.acc.bank_accountservice.model.BankAccount;
import com.ban.acc.bank_accountservice.repository.IBanckAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ServiceBankAccountImpl implements ServiceBankAccount{

    private final IBanckAccountRepository repository;

    @Override
    public Flux<BankAccount> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<BankAccount> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<BankAccount> save(BankAccount bankAccount) {
        return repository.save(bankAccount);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
    }
}
