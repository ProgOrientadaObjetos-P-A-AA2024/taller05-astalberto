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
public class EjecutorDos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cedula;
        String marca;
        String cadena = "";
        int anioFab;
        double valorVehi;
        boolean bandera = true;
        String status;
        int i = 1;
        while (bandera) {
            System.out.println("Automotor " + (i));
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
            System.out.println("Ingrese [n] para salir del ciclo");
            status = entrada.nextLine();
            i++;
            if (status.equals("n")) {
                bandera = false;
            }
        }
        System.out.println(cadena);
    }
}
