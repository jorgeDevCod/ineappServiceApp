package com.IneappPersonaservice.IneappPersonaservice.Persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @GetMapping
    @RequestMapping("/getAll")
    public List<Persona> getAll(){

        LocalDate date = LocalDate.of(1994, Month.SEPTEMBER, 5);

        Persona persona = Persona.builder()
                .id(1l)
                .nombre("German")
                .apellidos("Mesta")
                .dni("75116689")
                .email("Jgmesta@gmail.com")
                .birthDate(date).build();

        return List.of(persona);
    }


    @GetMapping
    @RequestMapping("/getbyid")
    public Persona getById(){
        LocalDate date = LocalDate.of(1999, Month.SEPTEMBER, 5);

        Persona persona = Persona.builder()
                .id(1l)
                .nombre("Jorge")
                .apellidos("Pasapera")
                .dni("75116789")
                .email("Jmesta@gmail.com")
                .birthDate(date).build();
        return persona;
    }

    //Put



    //post


    //Delete
}
