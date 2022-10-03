package com.IneappPersonaservice.IneappPersonaservice.Persona.application.services;

import com.IneappPersonaservice.IneappPersonaservice.Persona.domain.entity.Persona;
import com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.repository.PersonaRepository;
import com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.request.UserRequest;
import com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.response.BasicResponse;
import com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.response.UserResponse;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Builder
@Log4j2
@Service
public class PersonaServicesImplemen implements PersonaServices{

    private static final String Password = "123456";

   @Autowired
   private PersonaRepository personaRepository;

    @Override
    public BasicResponse addUser(UserRequest request) {

        try {

            if (request.getPassword().equals(Password)){
                personaRepository.save(this.buildPersonFromRequest(request));
                return BasicResponse.whenSuccess();
            }else {
                return BasicResponse.whenPassNotMatch();
            }
        }catch (Exception e){
            log.error(e.getMessage());
            return BasicResponse.whenError(e.getMessage());
        }
    }

    @Override
    public UserResponse getAll(){
        List<Persona> personaList = personaRepository.findAll();

        if (personaList.isEmpty()){
            return UserResponse.builder()
                    .personaList(null)
                    .basicResponse(BasicResponse.whenNoDataFound())
                    .build();
        }

        return UserResponse.builder()
                .personaList(personaList)
                .basicResponse(BasicResponse.whenSuccess())
                .build();
    }

    public Persona buildPersonFromRequest(UserRequest request){
        return Persona.builder()
                .nombre(request.getNombre())
                .apellidos(request.getApellidos())
                .dni(request.getDni())
                .email(request.getEmail())
                .birthDate(request.getBirthDate()).build();
    }
}
