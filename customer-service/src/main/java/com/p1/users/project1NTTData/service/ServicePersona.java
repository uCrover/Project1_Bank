package com.p1.users.project1NTTData.service;

import com.p1.users.project1NTTData.model.PersonaEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServicePersona {
    Flux<PersonaEntity> findAll();

    Mono<PersonaEntity> save(PersonaEntity persona);

    void deleteProduct(Integer id);

}
