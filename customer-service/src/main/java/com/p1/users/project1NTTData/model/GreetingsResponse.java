package com.p1.users.project1NTTData.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GreetingsResponse {

    private String name;

    public String toString(){
        return "Hola" + name + "!";
    }
}
