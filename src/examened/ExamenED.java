/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examened;

/**
 *
 * @author yo
 */
public class ExamenED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        char respuesta;
        int horasSem;
        double precioHora, salarioSem;
        
        do{
            nombre = ES.leerCadena("Introduzca el nombre del trabajador");
            horasSem = ES.leerEnteroMayorCero("Introduzca las horas semanales trabajadas");
            precioHora = ES.leerRealMayorCero("Introduzca el precio de la hora de trabajo");
            if (horasSem <=10) salarioSem = horasSem * precioHora;
            else salarioSem = (10 * precioHora) + ((horasSem-10)*precioHora*1.5);
            System.out.println("El trabajador " +nombre +" tiene un salario semanal de: " +salarioSem +"€");
            System.out.println("Su salario mensual es de: " +salarioSem*4 +"€");
            respuesta = ES.leerCaracter("¿Quiere introducir otro trabajador?. Pulse N para salir");            
        }
        while(respuesta !='n'& respuesta!='N' );
        }
    
}
