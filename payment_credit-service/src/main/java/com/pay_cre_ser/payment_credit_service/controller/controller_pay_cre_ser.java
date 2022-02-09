package com.pay_cre_ser.payment_credit_service.controller;

import com.pay_cre_ser.payment_credit_service.model.Pay_cre_ser;
import com.pay_cre_ser.payment_credit_service.service.Pay_ser_cre;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pay_cre_ser")
public class Controller_pay_cre_ser {
    private final Pay_ser_cre service;

    @GetMapping
    public Flux<Pay_cre_ser> getPay_cre_sers() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Pay_cre_ser> getPay_cre_ser(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Pay_cre_ser> savePay_cre_ser(@RequestBody Pay_cre_ser psc){
        return service.save(psc);
    }

    @PutMapping
    public Mono<Pay_cre_ser> updatePay_cre_ser(@RequestBody Pay_cre_ser psc){
        return service.save(psc);
    }

    @DeleteMapping("/{id}")
    public void deletePay_cre_ser(@PathVariable("id") String id) {
        service.delete(id);
    }


}
