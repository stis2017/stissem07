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
public class Ej7 {

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        String num = "";
        System.out.println("Ingrese un numero");
        num= sc.nextLine();
        if(validarNumero(num)){
            if(Integer.parseInt(num)%2==0){
                System.out.println("El numero es par");
            }
            else{
                System.out.println("El numero es impar");
            }
        }
        else{
            System.out.println("Ingrese un numero por favor");
        }

    }

    public boolean validarNumero(String num) {
        boolean bandera = true;
        if (!num.equals("")) {
            for (int i = 0; i < num.length(); i++) {
                if (!Character.isDigit(num.charAt(i))) {
                    bandera = false;
                }
            }
        }
        return bandera;
    }
}
