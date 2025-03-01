/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasemana1;

/**
 *
 * @author angel
 */
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Estudiante> estudiantes;

    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public double calcularPromedio() {
        if (estudiantes.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getNotaFinal();
        }
        return suma / estudiantes.size();
    }

    public List<Estudiante> getEstudiantesAprobados() {
        List<Estudiante> aprobados = new ArrayList<>();
        for (Estudiante e : estudiantes) {
            if (e.getNotaFinal() >= 61) {
                aprobados.add(e);
            }
        }
        return aprobados;
    }

}
