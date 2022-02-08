package com.p1.users.project1NTTData.controller;

import com.p1.users.project1NTTData.model.PersonaEntity;
import com.p1.users.project1NTTData.service.ServicePersona;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ControllerPersona {

    private final ServicePersona service;

    @GetMapping("/getPersonas")
    public Flux<PersonaEntity> getPersons(){
        return service.findAll();
    }

    @PostMapping("/postPersonas")
    public Mono<PersonaEntity> postPersons(@RequestBody PersonaEntity persona){
        return service.save(persona);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        service.deleteProduct(id);
    }

    @GetMapping(
            value = "/ok",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public Flux<String> ok() {
        return Flux.just("ok");
    }

}