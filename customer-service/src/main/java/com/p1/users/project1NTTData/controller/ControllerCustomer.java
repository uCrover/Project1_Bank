package com.p1.users.project1NTTData.controller;

import com.p1.users.project1NTTData.model.Customer;
import com.p1.users.project1NTTData.service.ServiceCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class ControllerCustomer {

    private final ServiceCustomer service;
    @GetMapping
    public Flux<Customer> getCustomers() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Customer> getCustomer(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Customer> saveCustomer(@RequestBody Customer customer){
        return service.save(customer);
    }

    @PutMapping
    public Mono<Customer> updateCustomer(@RequestBody Customer customer){
        return service.update(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") String id) {
        service.delete(id);
    }


}