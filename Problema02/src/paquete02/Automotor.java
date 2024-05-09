/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author alber
 */
public class Automotor {

    private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String cD, String mV, int aF, double vVe) {
        cedulaDuenio = cD;
        marcaVehiculo = mV;
        anioFabricacion = aF;
        valorVehiculo = vVe;
    }

    public void establecerCedulaDuenio(String x) {
        cedulaDuenio = x;
    }

    public void establecerMarcaVehiculo(String x) {
        marcaVehiculo = x;
    }

    public void establecerAnioFabricacion(int n) {
        anioFabricacion = n;
    }

    public void establecerValorVehiculo(double n) {
        valorVehiculo = n;
    }

    public void calcularValorMatricula() {
        valorMatricula = ((valorVehiculo * 0.002) / 100) * (2024 - anioFabricacion);
    }

    public String obtenerCedulaDuenio() {
        return cedulaDuenio;
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAbioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Automotor\nCedula: %s\nMarca del Vehiculo: %s\n"
                + "Año de Fabricación del Vehiculo: %d\nValor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n",
                cedulaDuenio,
                marcaVehiculo,
                anioFabricacion,
                valorVehiculo,
                valorMatricula);
        return cadena;
    }

}
