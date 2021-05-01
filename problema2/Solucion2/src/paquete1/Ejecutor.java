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
       
        String nombre = "Jose";
        String apellido = "Enriquez";
        double sueldoBasico = 400.00;
        String cedula = "1150582755";
        
        ProfesorInstituto profIns = new ProfesorInstituto(nombre, 
                apellido, sueldoBasico,cedula); 
        
        profIns.establecerNombre(nombre);
        profIns.establecerApellido(apellido);
        profIns.establecerSueldoBasico(sueldoBasico);
        profIns.establecerSueldoTotal();
        profIns.establecerCedula(cedula);
        
        System.out.printf("%s\n",profIns);
        
        String nombre2 = "Xavier";
        String apellido2 = "Chavez";
        double sueldoBasico2 = 430.00;
        String cedula2 = "1123656555";
        
        ProfesorInstituto profIns2 = new ProfesorInstituto(nombre, 
                apellido, sueldoBasico,cedula); 
        
        profIns2.establecerNombre(nombre2);
        profIns2.establecerApellido(apellido2);
        profIns2.establecerSueldoBasico(sueldoBasico2);
        profIns2.establecerSueldoTotal();
        profIns2.establecerCedula(cedula2);
        
        System.out.printf("\n%s\n",profIns2);
        
        
        
        
    }
    
}
