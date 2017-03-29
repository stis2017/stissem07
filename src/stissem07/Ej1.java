/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stissem07;

import java.util.Scanner;

/**
 *
 * @author LAP
 */

/*Ejercicio uno de su practica guiada*/
public class Ej1 {
    
    public void iniciar(){
        Scanner sc= new Scanner(System.in);
        int num1=0;
        int num2=0;
        System.out.println("Ingrese el primer Numero");
        num1= sc.nextInt();
        System.out.println("Ingrese el segundo Numero");
        num2= sc.nextInt();
        System.out.println("El resultado es: "+ String.valueOf(procesar(num1,num2)));
    }
    
    
    public int procesar(int num1, int num2){
        int resultado=0;
        if(num1==num2){
            resultado= num1+num2;
        }
        else{
            resultado= num1*num2;
        }
        return resultado;
    }
    
}
