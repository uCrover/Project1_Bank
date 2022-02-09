package com.p1.users.project1NTTData.repository;

import com.p1.users.project1NTTData.model.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends ReactiveMongoRepository<Customer,String> {

}
