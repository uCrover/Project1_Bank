package com.p1.users.project1NTTData.service;

import com.p1.users.project1NTTData.model.PersonaEntity;
import com.p1.users.project1NTTData.repository.IPersonasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class ServicePersonaImpl implements ServicePersona {

    private final IPersonasRepository repository;

    @Override
    public Flux<PersonaEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<PersonaEntity> save(PersonaEntity persona) {
        return repository.save(persona);
    }
}