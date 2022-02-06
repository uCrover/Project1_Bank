package com.p1.users.project1NTTData.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection="Personas")
public class PersonaEntity {

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private int edad;


}