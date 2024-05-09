/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import paquete02.Calificacion;

/**
 *
 * @author alber
 */
public class Ejecutor {

    /**
     *
     * En un clase llamada Ejecutor, se debe presentar un menú. Si el usuario
     * ingresa el número 1, podrá crear un objeto de tipo Estudiante donde se
     * use un contructor que espere parámetros para: nombre, calificación de
     * materia 1 y calificación de materia 2; la matería 3, será igual al
     * promedio de la calificación 1 y calificación 2. Si el usuario ingresa el
     * número 2, podrá crear un objeto donde se debe usar un constructor que
     * espere como parámtros nombre, calificación 1, 2 y 3.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double n1, n2, n3;
        int i;

        System.out.println("Ingrese 1 para ingresar nombre, nota 1 y nota 2");
        System.out.println("Ingrese 2 para ingresar nombre, nota 1, nota 2 "
                + "y nota 3");
        i = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese nota 1");
        n1 = entrada.nextDouble();
        System.out.println("Ingrese nota 2");
        n2 = entrada.nextDouble();
        switch (i) {

            case 1 -> {
                Calificacion v1 = new Calificacion(nombre, n1, n2);
                v1.calcularPromedio();
                System.out.printf("%s", v1);
            }
            case 2 -> {
                System.out.println("Ingrese nota 3");
                n3 = entrada.nextDouble();
                Calificacion v2 = new Calificacion(nombre, n1, n2, n3);
                v2.calcularPromedio();
                System.out.printf("%s", v2);
            }
            default ->
                throw new AssertionError();
        }

    }
}
