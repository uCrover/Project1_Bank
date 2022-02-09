package com.pay_cre_ser.payment_credit_service.controller;

import com.pay_cre_ser.payment_credit_service.model.pay_cre_ser;
import com.pay_cre_ser.payment_credit_service.service.pay_ser_cre;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class controller_pay_cre_ser {
    private final pay_ser_cre service;

    @GetMapping
    public Flux<pay_cre_ser> getCreditCards() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<pay_cre_ser> getCreditCard(@PathVariable("id") String id) {
        return service.findBy(id);
    }

    @PostMapping
    public Mono<pay_cre_ser> saveCreditCard(@RequestBody pay_cre_ser psc){
        return service.save(psc);
    }

    @PutMapping
    public Mono<pay_cre_ser> updateCreditCard(@RequestBody pay_cre_ser psc){
        return service.update(psc);
    }

    @DeleteMapping("/{id}")
    public void deleteCreditCard(@PathVariable("id") String id) {
        service.delete(id);
    }



}
