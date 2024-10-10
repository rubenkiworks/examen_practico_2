package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        // INICIO EJERCICIO 4
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
        //FIN EJERCICIO 4

        //INICIO EJERCICIO 6
        List<? super Persona> empleadosYEstudiantes;
        empleadosYEstudiantes = new ArrayList<>();
        empleadosYEstudiantes.add(Empleado.builder().nombre("Manuel").genero(Genero.HOMBRE)
                .departamento(Departamento.INFORMATICA).salario(1200.5).build());
        empleadosYEstudiantes.add(Estudiante.builder().nombre("Ruben").genero(Genero.HOMBRE)
                .facultad(Facultad.BIOLOGIA).totalAsignaturasMatriculadas(10).build());
        empleadosYEstudiantes.add(Estudiante.builder().nombre("Lidia").genero(Genero.MUJER)
                .facultad(Facultad.INFORMATICA).totalAsignaturasMatriculadas(11).build());
        empleadosYEstudiantes.add(Estudiante.builder().nombre("Laura").genero(Genero.MUJER)
                .facultad(Facultad.FILOLOGIA).totalAsignaturasMatriculadas(9).build());
        empleadosYEstudiantes.add(Empleado.builder().nombre("Miriam").genero(Genero.MUJER)
                .departamento(Departamento.RRHH).salario(1100.5).build());
        empleadosYEstudiantes.add(Empleado.builder().nombre("Alba").genero(Genero.MUJER)
                .departamento(Departamento.CONTABILIDAD).salario(1470.21).build());
        empleadosYEstudiantes.add(Empleado.builder().nombre("Laura").genero(Genero.MUJER)
                .departamento(Departamento.FINANZAS).salario(1700.89).build());
        empleadosYEstudiantes.add(Estudiante.builder().nombre("Carmen").genero(Genero.MUJER)
                .facultad(Facultad.FILOLOGIA).totalAsignaturasMatriculadas(11).build());
        empleadosYEstudiantes.add(Estudiante.builder().nombre("Celeste").genero(Genero.MUJER)
                .facultad(Facultad.FILOLOGIA).totalAsignaturasMatriculadas(11).build());
        empleadosYEstudiantes.add(Estudiante.builder().nombre("Violeta").genero(Genero.MUJER)
                .facultad(Facultad.FILOSOFIA).totalAsignaturasMatriculadas(11).build());

        // FIN EJERCICIO 6

        // INICIO EJERCICIO 7
        double sumatoriaAsignaturas = 0;
        int studentCounter = 0;
        double promedioAsignaturas = 0;

        for (Object obj : empleadosYEstudiantes) {
            if (obj instanceof Estudiante estudiante) {
                sumatoriaAsignaturas += estudiante.getTotalAsignaturasMatriculadas();
                studentCounter++;
            }

        }

        promedioAsignaturas = sumatoriaAsignaturas / studentCounter;

        List<Estudiante> soloEstudiantes = new ArrayList<>();

        for (Object obj : empleadosYEstudiantes) {
            // Como saber de que clase es el objeto que sacamos en cada iteracion
            // Utilizando el operador instanceof y tambien pattern matching
            if (obj instanceof Estudiante estudiante && estudiante.getGenero().equals(Genero.MUJER) && estudiante.getTotalAsignaturasMatriculadas() >= promedioAsignaturas) {
                soloEstudiantes.add(Estudiante.builder()
                .nombre(estudiante.getNombre())
                .totalAsignaturasMatriculadas(estudiante.getTotalAsignaturasMatriculadas())
                .genero(estudiante.getGenero())
                .facultad(estudiante.getFacultad())
                .build());
            }

        }

        System.out.println("Lista solo estudiantes: " + soloEstudiantes);

    }
}
