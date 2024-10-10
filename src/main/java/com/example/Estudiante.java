package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)

public class Estudiante extends Persona{
    private Facultad facultad;
    private int totalAsignaturasMatriculadas;
}
