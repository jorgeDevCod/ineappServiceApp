package com.IneappPersonaservice.IneappPersonaservice.Persona;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name ="Persona")
@Table(
        name ="Persona",
        uniqueConstraints = {
                @UniqueConstraint(name = "persona_email_unique", columnNames = "email"),
                @UniqueConstraint(name = "persona_dni_unique", columnNames = "dni"),
            }
        )

@Getter
@Setter
@Builder
public class Persona{

    @SequenceGenerator(
            name = "persona_sequence",
            sequenceName = "persona_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "persona_sequence"
    )
    @Id
    Long id;
    String nombre;
    String apellidos;
    String dni;
    String email;
    LocalDate birthDate;

}
