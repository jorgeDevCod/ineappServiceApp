package com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BasicResponse {


    private int code;
    private String message;

    public static BasicResponse whenSuccess(){
        return BasicResponse.builder()
                .code(200)
                .message("Success")
                .build();
    }

    public static BasicResponse whenPassNotMatch(){
        return BasicResponse.builder()
                .code(500)
                .message("Password incorrecto")
                .build();
    }

    public static BasicResponse whenError( String message){
        return BasicResponse.builder()
                .code(500)
                .message(message)
                .build();
    }

    public static BasicResponse whenNoDataFound(){
        return BasicResponse.builder()
                .code(404)
                .message("Datos no encontrados")
                .build();
    }
}
