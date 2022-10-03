package com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.controller;

import com.IneappPersonaservice.IneappPersonaservice.Persona.domain.entity.Persona;
import com.IneappPersonaservice.IneappPersonaservice.Persona.application.services.PersonaServices;
import com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.request.UserRequest;
import com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.response.BasicResponse;
import com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {


    @Autowired
    private PersonaServices personaServices;


    @GetMapping
    @RequestMapping("/getAll")
    public UserResponse getAll(){

        return personaServices.getAll();

    }


    @GetMapping
    @RequestMapping("/getbyid")
    public Persona getById(){ return null;}



    //Put



    //post
    @PostMapping
    @RequestMapping("/adduser")
    public ResponseEntity <BasicResponse> adduser(@RequestBody UserRequest request){
        BasicResponse response = personaServices.addUser(request);
        return ResponseEntity.status(response.getCode()).body(response);
    }

    //Delete
}
