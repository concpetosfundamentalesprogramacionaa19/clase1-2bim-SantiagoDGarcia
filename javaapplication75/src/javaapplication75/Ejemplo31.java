/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        
        int[] datos = new int[6];
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20", 
            "20-adelante"};
        // Se determina la variable notas como double para determinar decimales
        double notas;
        String verificacion;
        System.out.println("Ingrese la cantidad de notas que desea:");
        boolean opcion = true;
        // Se usa un Mientras para determinar cuando el usuario desea terminar
        // de ingresar notas
        while (opcion == true) {
            
            System.out.println("Notas");
            notas = entrada.nextDouble();
            // condicional para que se determine las condiciones
          if(notas >= 0 && notas <=8){
            datos[0] = datos[0] + 1;
          }else{
            if(notas >=8.1 && notas <=12){
                datos[1] = datos[1] + 1;
            }else{
                if(notas >=12.1 && notas <=16){
                    datos[2] = datos[2] + 1;
                }else{
                    if(notas >=16.1 && notas <=19){
                        datos[3] = datos[3] + 1;
                    }else{
                        if(notas >=19.1 && notas <= 20){
                            datos[4] = datos[4] + 1;
                        }else{
                            if(notas >20){
                                datos[5] = datos[5] + 1;
                            }  
                        }
                    }
                 }
              }
           }
          // Se pregunta al usuario si desea continuar y se evalua la condicion
        System.out.printf("¿Desea ingresar mas notas?\n"
                            + "Escriba (si) para continuar o (no) para terminar"
                            + "\n");
                            verificacion = entrada.next();
                           
                            if (verificacion.equals("si")) {
                               opcion = true;
                            } else {
                               opcion = false;
                            }
         
        }                   
        System.out.printf("Notas ingresadas\nRangos:\n");
        // Se usa un for para imprimir los datos del array
        for(int i = 0; i<datos.length; i++){
            System.out.printf("%s = %d\n", rangos[i], datos[i]);    
        
        
        
        


    }
}
    }
    
