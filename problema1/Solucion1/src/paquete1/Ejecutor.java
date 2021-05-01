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
        String nombreEstudiante = "Jose";
        double caliMat1 = 7.8;
        double caliMat2 = 8.8;
        double caliMat3 = 9.8;

        PromedioEstudiante promEst = new PromedioEstudiante(nombreEstudiante,
                caliMat1, caliMat2, caliMat3);

        promEst.establecerNombreEstudiante(nombreEstudiante);
        promEst.establecerCalificacionMateria1(caliMat1);
        promEst.establecerCalificacionMateria2(caliMat2);
        promEst.establecerCalificacionMateria3(caliMat3);
        promEst.establecerPromedioCalificacion();

        System.out.println(promEst);

        String nombreEstudiante2 = "Snider";
        double caliiMat1 = 8.8;
        double caliiMat2 = 4.8;
        double caliiMat3 = 5.8;

        PromedioEstudiante promEst2 = new PromedioEstudiante(nombreEstudiante2,
                caliiMat1, caliiMat2, caliiMat3);

        promEst2.establecerNombreEstudiante(nombreEstudiante2);
        promEst2.establecerCalificacionMateria1(caliiMat1);
        promEst2.establecerCalificacionMateria2(caliiMat2);
        promEst2.establecerCalificacionMateria3(caliiMat3);
        promEst2.establecerPromedioCalificacion();

        System.out.println(promEst2);
    }

}
