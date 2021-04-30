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
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom = "Xavier Chávez";
        String nomBan = "Banco de Loja";
        double valChe = 1000.45;

        Cheque cheq = new Cheque(nom, nomBan, valChe);
        
        cheq.establecerNombreCliente(nom);
        cheq.establecerNombreBanco(nomBan);
        cheq.establecerValorCheque(valChe);
        cheq.establecerComisionCobrar();

        System.out.println(cheq);

    }

}
