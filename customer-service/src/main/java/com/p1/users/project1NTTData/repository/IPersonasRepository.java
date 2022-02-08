package com.p1.users.project1NTTData.repository;

import com.p1.users.project1NTTData.model.PersonaEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
//Cambiamos string por Integer
@Repository
public interface IPersonasRepository extends ReactiveMongoRepository<PersonaEntity,Integer> {

}
