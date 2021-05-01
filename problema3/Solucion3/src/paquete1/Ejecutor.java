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
        System.out.printf("%s\n", auto);

        String cedula2 = "1150582755";
        String marcVehi2 = "PBA-1024";
        int aFabri2 = 2002;
        double valVehi2 = 3513.45;

        Automotor auto2 = new Automotor(cedula2, marcVehi2, aFabri2, valVehi2);

        auto2.establecerCedula(cedula2);
        auto2.establecerMarca(marcVehi2);
        auto2.establecerAnFabricacion(aFabri2);
        auto2.establecerValorVehiculo(valVehi2);
        auto2.establecerValorMatricula();
        System.out.printf("\n%s\n", auto2);

    }

}
