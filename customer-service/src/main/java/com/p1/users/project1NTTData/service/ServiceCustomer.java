package com.p1.users.project1NTTData.service;

import com.p1.users.project1NTTData.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceCustomer {
    public Flux<Customer> findAll();
    public Mono<Customer> findById(String id);
    public Mono<Customer> save(Customer psc);
    public Mono<Customer> update(Customer psc);
    public void delete(String id);

}
