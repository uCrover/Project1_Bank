package com.p1.users.project1NTTData.service;

import com.p1.users.project1NTTData.model.GreetingsResponse;
import reactor.core.publisher.Flux;

public interface IGreetingService {

    Flux<GreetingsResponse> getAllGreetings();
}
