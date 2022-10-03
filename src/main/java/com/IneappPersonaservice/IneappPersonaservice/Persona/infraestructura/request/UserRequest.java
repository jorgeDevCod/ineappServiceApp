package com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.request;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class UserRequest {
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private LocalDate birthDate;
    private String password;
}
