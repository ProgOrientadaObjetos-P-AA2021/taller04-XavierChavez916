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
        String cedula = "1150582755";
        String marcVehi = "LBA-2353";
        int aFabri = 2004;
        double valVehi = 3013.45;

        Automotor auto = new Automotor(cedula, marcVehi, aFabri, valVehi);

        auto.establecerCedula(cedula);
        auto.establecerMarca(marcVehi);
        auto.establecerAnFabricacion(aFabri);
        auto.establecerValorVehiculo(valVehi);
        auto.establecerValorMatricula();
        System.out.println(auto);

    }

}
