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
        
        String nom2 = "Dalto Vazquez";
        String nomBan2 = "Banco de Guayaquil";
        double valChe2 = 500.45;

        Cheque cheq1 = new Cheque(nom, nomBan, valChe);
        cheq1.establecerNombreCliente(nom);
        cheq1.establecerNombreBanco(nomBan);
        cheq1.establecerValorCheque(valChe);
        cheq1.establecerComisionCobrar();
        System.out.printf("%s\n",cheq1);

        Cheque cheq2 = new Cheque(nom, nomBan, valChe);
        cheq2.establecerNombreCliente(nom2);
        cheq2.establecerNombreBanco(nomBan2);
        cheq2.establecerValorCheque(valChe2);
        cheq2.establecerComisionCobrar();
        System.out.printf("\n%s\n",cheq2);
        
        
        
    }

}
