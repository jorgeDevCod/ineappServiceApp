package com.IneappPersonaservice.IneappPersonaservice.Persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @GetMapping
    @RequestMapping("/getAll")

    public String getPersona(){
        Persona persona = new Persona ("Jorge");
        Persona persona1 = new Persona();

        return persona.getNombre();
    }

    //Put



    //post


    //Delete
}
