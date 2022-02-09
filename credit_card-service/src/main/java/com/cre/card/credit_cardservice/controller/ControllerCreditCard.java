package com.cre.card.credit_cardservice.controller;

import com.cre.card.credit_cardservice.model.CreditCard;
import com.cre.card.credit_cardservice.service.ServiceCreditCard;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/credit_card")

public class ControllerCreditCard {
    private final ServiceCreditCard service;
    @GetMapping
    public Flux<CreditCard> getCreditCards() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<CreditCard> getCreditCard(@PathVariable("id") String id) {
        return service.findByNroCuenta(id);
    }

    @PostMapping
    public Mono<CreditCard> saveCreditCard(@RequestBody CreditCard creditCard){
        return service.save(creditCard);
    }

    @PutMapping
    public Mono<CreditCard> updateCreditCard(@RequestBody CreditCard creditCard){
        return service.update(creditCard);
    }

    @DeleteMapping("/{id}")
    public void deleteCreditCard(@PathVariable("id") String id) {
        service.delete(id);
    }

}
