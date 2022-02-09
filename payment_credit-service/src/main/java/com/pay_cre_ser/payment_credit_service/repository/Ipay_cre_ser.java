package com.pay_cre_ser.payment_credit_service.repository;

import com.pay_cre_ser.payment_credit_service.model.pay_cre_ser;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ipay_cre_ser extends ReactiveMongoRepository<pay_cre_ser,String> {

}
