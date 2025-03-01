

package com.mycompany.tareasemana1;

import java.util.List;
import java.util.Scanner;


public class TareaSemana1 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear un objeto Curso para gestionar los estudiantes
        Curso curso = new Curso();

        // Instrucciones para el usuario
        System.out.println("==========Ingrese los datos de los estudiantes========");

        // Bucle para ingresar estudiantes
        while (true) {
            System.out.println("Ingrese el nombre del estudiante (o 'fin' para terminar):");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break; // Salir del bucle si el usuario ingresa "fin"
            }

            System.out.println("Ingrese el carnet del estudiante:");
            String carnet = scanner.nextLine();

            double notaFinal;
            while (true) {
                System.out.println("Ingrese la nota final del estudiante (0-100):");
                String notaInput = scanner.nextLine();
                try {
                    notaFinal = Double.parseDouble(notaInput);
                    if (notaFinal < 0 || notaFinal > 100) {
                        System.out.println("La nota debe estar entre 0 y 100. Intente de nuevo.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("La nota debe ser un numero. Intente de nuevo.");
                }
            }

            // Crear un objeto Estudiante y agregarlo al curso
            Estudiante estudiante = new Estudiante(nombre, carnet, notaFinal);
            curso.agregarEstudiante(estudiante);
        }

        // Calcular y mostrar el promedio del curso
        double promedio = curso.calcularPromedio();
        System.out.println("Promedio del curso: " + promedio);

        // Mostrar los estudiantes aprobados
        List<Estudiante> aprobados = curso.getEstudiantesAprobados();
        System.out.println("Estudiantes aprobados:");
        for (Estudiante e : aprobados) {
            System.out.println(e.getNombre() + " - " + e.getNotaFinal());
        }

        scanner.close();
    }
    
}


