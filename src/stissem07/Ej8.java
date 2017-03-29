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
public class Ej8 {
    
    
    public void iniciar(){
        String x="";
        String y="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la coordenada en X");
        x= sc.nextLine();
         System.out.println("Ingrese la coordenada en Y");
        y= sc.nextLine(); 
        if(!(validarNumero(x) && validarNumero(y))){
            System.out.println("Ingrese solo numeros");
        }else{
            if(Integer.parseInt(x)==0 && Integer.parseInt(y)==0){
                System.out.println("Está en el origen");
            }
            else if(Integer.parseInt(x)>=0 && Integer.parseInt(y)>=0){
                System.out.println("Está en el primer cuadrante");
            }
            else if(Integer.parseInt(x)<=0 && Integer.parseInt(y)>=0){
                System.out.println("Está en el segundo cuadrante");
            }
            else if(Integer.parseInt(x)<=0 && Integer.parseInt(y)<=0){
                System.out.println("Está en el tercer cuadrante");
            }
            else if(Integer.parseInt(x)>=0 && Integer.parseInt(y)<=0){
                System.out.println("Está en el cuarto cuadrante");
            }
        }
        
    }
    
    public boolean validarNumero(String num){
        boolean bandera=true;
        if(!num.equals("")){
            for(int i=0;i<num.length();i++){
                if(!Character.isDigit(num.charAt(i))){
                    bandera=false;
                }
            }
        }
        return bandera;
    }
}
