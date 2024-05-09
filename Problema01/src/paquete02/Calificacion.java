/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 * Se requiere representar una entidad que permita crear objetos con
 * características como: nombre de estudiante, calificación de materia 1,
 * calificación de materia 2, calificación de materia 3 y promedio de
 * calificaciones
 *
 * @author alber
 */
public class Calificacion {

    private String nombreEstudiante;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;

    public Calificacion(String nombre,double n1,double n2){
        nombreEstudiante=nombre;
        materia1=n1;
        materia2=n2;
        materia3=(materia1+materia2)/2;
    }
    public Calificacion(String nombre,double n1,double n2,double n3){
        nombreEstudiante=nombre;
        materia1=n1;
        materia2=n2;
        materia3=n3;
    }
    public void establecerNombreEstudiante(String x) {
        nombreEstudiante = x;
    }

    public void establecerMateria1(double n) {
        materia1 = n;
    }

    public void establecerMateria2(double n) {
        materia2 = n;
    }

    public void establecerMateria3(double n) {
        materia3 = n;
    }

    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerMateria1() {
        return materia1;
    }

    public double obtenerMateria2() {
        return materia2;
    }

    public double obtenerMateria3() {
        return materia3;
    }

    @Override
    public String toString() {
        String cadena = String.format("Tabla de Calificaciones\nNombre: %s"
                + "\nCalificacion de la Materia 1 %.2f\n"
                + "Calificacion de la Materia 2 %.2f\n"
                + "Calificacion de la Materia 3 %.2f\n"
                + "Promedio: %.2f\n",
                nombreEstudiante,
                materia1,
                materia2,
                materia3,
                promedio);
        return cadena;
    }
    
}
