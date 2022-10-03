package com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.response;


import com.IneappPersonaservice.IneappPersonaservice.Persona.domain.entity.Persona;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class UserResponse {

   private List<Persona> personaList;
    private BasicResponse basicResponse;


}
