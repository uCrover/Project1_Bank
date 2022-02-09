package com.ban.acc.bank_accountservice.repository;

import com.ban.acc.bank_accountservice.model.BankAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBanckAccountRepository extends ReactiveMongoRepository<BankAccount,String> {
}
