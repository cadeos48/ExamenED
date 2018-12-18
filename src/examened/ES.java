/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examened;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ES {
    
    
    public static int leerEnteroMayorCero(String mensaje) {        
        
        boolean validacion;
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println(mensaje);

        do {
            numero = 0;            
            try {
                numero = teclado.nextInt();
                validacion = true;
            } catch (Exception e) {
                System.out.println("Dato erróneo. Introduzca un número entero");
                teclado.nextLine();
                validacion = false;
            }
            if (numero < 0) System.out.println("Introduzca un número mayor que cero");
        } while (numero < 0 || validacion == false);
        return numero;
    }
    
    public static double leerRealMayorCero(String mensaje) {        
        
        boolean validacion;
        Scanner teclado = new Scanner(System.in);
        double numero;
        System.out.println(mensaje);

        do {
            numero = 0;            
            try {
                numero = teclado.nextDouble();
                validacion = true;
            } catch (Exception e) {
                System.out.println("Dato erróneo. Introduzca un número");
                teclado.nextLine();
                validacion = false;
            }
            if (numero < 0) System.out.println("Introduzca un número mayor que cero");
        } while (numero < 0 || validacion == false);
        return numero;
    }
    
    public static String leerCadena(String mensaje){
        String cadena;
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        cadena = teclado.nextLine();
        return cadena;        
    }
    
     public static char leerCaracter(String mensaje){
        char caracter;
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        caracter = teclado.nextLine().charAt(0);
        return caracter;
    }
}
