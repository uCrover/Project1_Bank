package com.p1.users.project1NTTData.controller;

import com.p1.users.project1NTTData.model.GreetingsResponse;
import com.p1.users.project1NTTData.service.IGreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("greetings")
public class GeetingsController {

    private final IGreetingService service;

    @GetMapping
    public Flux<String> getAll(){
        return service.getAllGreetings().map(x -> x.toString());
    }

    @GetMapping("/names")
    public Flux<GreetingsResponse> getNames(){
        return service.getAllGreetings();
    }

}
