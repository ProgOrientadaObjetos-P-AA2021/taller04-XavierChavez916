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
        
        System.out.println(profIns);
        
        
        
        
    }
    
}
