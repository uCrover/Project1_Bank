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

    @GetMapping("/getPersonas")
    public Flux<pay_cre_ser> getPersons(){
        return service.findAll();
    }

    @PostMapping("/postPersonas")
    public Mono<pay_cre_ser> postPersons(@RequestBody pay_cre_ser persona){
        return service.save(persona);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        service.deletePay_Ser_Cre(id);
    }


}
