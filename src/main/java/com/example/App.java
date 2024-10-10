package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(Empleado.builder()
                .nombre("Ruben")
                .primerApellido("Gomez")
                .segundoApellido("Sabio")
                .genero(Genero.HOMBRE)
                .departamento(Departamento.INFORMATICA)
                .salario(2500)
                .build());
        empleados.add(Empleado.builder()
                .nombre("Maria")
                .primerApellido("Jimenez")
                .segundoApellido("Losa")
                .genero(Genero.MUJER)
                .departamento(Departamento.RRHH)
                .salario(4500)
                .build());
        empleados.add(Empleado.builder()
                .nombre("Milagros")
                .primerApellido("Martin")
                .segundoApellido("Sanchez")
                .genero(Genero.MUJER)
                .departamento(Departamento.FINANZAS)
                .salario(1500)
                .build());
        empleados.add(Empleado.builder()
                .nombre("Jacinto")
                .primerApellido("Benavente")
                .segundoApellido("Sol")
                .genero(Genero.HOMBRE)
                .departamento(Departamento.CONTABILIDAD)
                .salario(3000)
                .build());
        empleados.add(Empleado.builder()
                .nombre("Jeremias")
                .primerApellido("Paredes")
                .segundoApellido("Lopez")
                .genero(Genero.HOMBRE)
                .departamento(Departamento.INFORMATICA)
                .salario(3100)
                .build());

        double sumatoriaSalarios = 0;
        int workerCounter = 0;
        double promedioSalarios = 0;

        for (Empleado obj : empleados) {
            sumatoriaSalarios += obj.getSalario();
            workerCounter++;
        }

        promedioSalarios = sumatoriaSalarios / workerCounter;

        for (Empleado obj : empleados) {
            if (obj.getSalario() >= promedioSalarios && obj.getGenero().equals(Genero.MUJER)) {
                System.out.println(obj);
            }
        }
    }
}
