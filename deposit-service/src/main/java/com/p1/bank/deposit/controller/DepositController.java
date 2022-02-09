package com.p1.bank.deposit.controller;

import com.p1.bank.deposit.model.dto.Deposit;
import com.p1.bank.deposit.service.IDepositService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/deposit")
public class DepositController {

    private final IDepositService service;

    @GetMapping
    public Flux<Deposit> getAllDeposits(){
        return this.service.getAllDeposits();
    }

    @GetMapping("/{numAc}")
    public Flux<Deposit> getDepositForNumAccount(@PathVariable("numAc") String numAccount){
        return this.service.getDepositsForAccount(numAccount);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Deposit> save(@RequestBody Deposit deposit){
        return this.service.saveDeposit(deposit);
    }

    @PutMapping
    public Mono<ResponseEntity<Deposit>> update(@RequestBody Deposit deposit){
        return this.service.updateDeposit(deposit).flatMap(dep -> Mono.just(ResponseEntity.ok(dep)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Deposit>> delete(@PathVariable("id") String id){
        return this.service.deleteDeposit(id).flatMap(dep -> Mono.just(ResponseEntity.ok(dep)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }




}