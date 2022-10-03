package com.IneappPersonaservice.IneappPersonaservice.Persona.application.services;

import com.IneappPersonaservice.IneappPersonaservice.Persona.domain.entity.Persona;
import com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.request.UserRequest;
import com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.response.BasicResponse;
import com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.response.UserResponse;

import java.util.List;

public interface PersonaServices {

    public BasicResponse addUser(UserRequest request);

    public UserResponse getAll();
}
