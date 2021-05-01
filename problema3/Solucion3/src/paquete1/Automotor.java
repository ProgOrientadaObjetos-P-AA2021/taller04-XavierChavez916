/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author xavierchavez
 */
public class Automotor {

    private String cedula;
    private String marca;
    private int anFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String ced, String marc, int anFabri, double valVehi) {
        cedula = ced;
        marca = marc;
        anFabricacion = anFabri;
        valorVehiculo = valVehi;

    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerMarca(String marc) {
        marca = marc;
    }

    public void establecerAnFabricacion(int anFab) {
        anFabricacion = anFab;
    }

    public void establecerValorVehiculo(double val) {
        valorVehiculo = val;
    }

    public void establecerValorMatricula() {
        valorMatricula = (2021 - anFabricacion) * (valorVehiculo * 0.002);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnFabricacion() {
        return anFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("--------Datos del Automotor-------\n"
                + "Cedula del dueño: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehículo: %.2f\n"
                + "Valor de la matricula: %.2f",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }

}
