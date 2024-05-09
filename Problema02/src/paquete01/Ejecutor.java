/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import paquete02.Automotor;

/**
 *
 * @author alber
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numIteraciones;
        String cedula;
        String marca;
        String cadena = "";
        int anioFab;
        double valorVehi;

        System.out.println("Cuantas iteraciones se realizara?");
        numIteraciones = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < numIteraciones; i++) {
            System.out.println("Automotor "+(i+1));
            System.out.println("Ingrese la cedula del dueño:");
            cedula = entrada.nextLine();
            System.out.println("Ingrese la marca del Vehiculo:");
            marca = entrada.nextLine();
            System.out.println("Ingrese el año de Fabricacion:");
            anioFab = entrada.nextInt();
            System.out.println("Ingrese el valor de el Vehiculo");
            valorVehi = entrada.nextDouble();
            entrada.nextLine();
            Automotor automotor1 = new Automotor(cedula, marca, anioFab, valorVehi);
            automotor1.calcularValorMatricula();
            cadena = String.format("%s\n%s", cadena, automotor1);
        }
        System.out.println(cadena);
    }
}

