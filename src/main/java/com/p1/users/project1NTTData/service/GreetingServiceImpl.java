package com.p1.users.project1NTTData.service;

import com.p1.users.project1NTTData.model.GreetingsResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GreetingServiceImpl implements IGreetingService{
    @Override
    public Flux<GreetingsResponse> getAllGreetings() {
        return Flux.just(new GreetingsResponse("Marco"),new GreetingsResponse("Pepe"));
    }
}
