package com.p1.users.project1NTTData.service;

import com.p1.users.project1NTTData.model.Customer;
import com.p1.users.project1NTTData.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class ServiceCustomerImpl implements ServiceCustomer {

    private final ICustomerRepository repository;

    @Override
    public Flux<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Customer> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Customer> save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Mono<Customer> update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();

    }
}