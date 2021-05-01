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
public class Cheque {
    private String nomCliente;
    private String nomBanco;
    private double valorCheque;
    private double comiCobrar;
    
    
    public Cheque(String nom, String nomBan, double valChe){
        nomCliente = nom;
        nomBanco = nomBan;
        valorCheque = valChe;
    }
    
    public void establecerNombreCliente(String nom) {
        nomCliente = nom;
    }

    public void establecerNombreBanco(String nomBan) {
        nomBanco = nomBan;
    }

    public void establecerValorCheque(double valChe) {
        valorCheque = valChe;
    }
    
    public void establecerComisionCobrar(){
        comiCobrar = (valorCheque * 0.003) ;
    }
   
    public String obtenerNombreCliente() {
        return nomCliente;
    }

    public String obtenerNombreBanco() {
        return nomBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionCobrar() {
        return comiCobrar;
    }
    
    
    
    @Override
    public String toString() {
        String cadena = String.format("-------Datos del Cheque--------\n"
                + "Nombre del cliente %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión que cobra el banco: %.2f",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComisionCobrar());
                
        return cadena;
    }
    
}
