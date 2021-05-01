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
public class ProfesorInstituto {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public ProfesorInstituto(String nom, String apell, double sueldbas,
            String ced) {
        nombre = nom;
        apellido = apell;
        sueldoBasico = sueldbas;
        cedula = ced;

    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String apell) {
        apellido = apell;
    }

    public void establecerSueldoBasico(double sulbas) {
        sueldoBasico = sulbas;
    }

    public void establecerSueldoTotal() {
        sueldoTotal = (sueldoBasico * 20) / 100 + sueldoBasico;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("-------Profesores del Instituto--------\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula: %s",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal(),
                obtenerCedula());
        return cadena;
    }

}
