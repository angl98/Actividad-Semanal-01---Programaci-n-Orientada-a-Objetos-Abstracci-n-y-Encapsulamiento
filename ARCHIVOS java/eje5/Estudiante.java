
package com.mycompany.tareasemana1;

/**
 *
 * @author angel
 */
public class Estudiante {
    private String nombre;
    private String carnet;
    private double notaFinal;

    public Estudiante(String nombre, String carnet, double notaFinal) {
        this.nombre = nombre;
        this.carnet = carnet;
        setNotaFinal(notaFinal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("La nota debe estar entre 0 y 100");
            this.notaFinal = 0; // Default value
        }
    }
}
