/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

import java.util.Scanner;

/**
 *
 * @author XexuTorronteras
 */
public class Factorial {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int aux = Integer.parseInt(Args[0]);
        int factorial = 1;

        if (aux > 0) { // If arguments given
            for (int i = aux; i > 0; i--) {
                factorial = i * factorial;
            }
        } else { // If ask user 
            System.out.print("Introduzca un número a calcular su factorial: ");
            aux = sc.nextInt();
            for (int i = aux; i > 0; i--) {
                factorial = i * factorial;
            }
        }

        System.out.println("El factorial de " + aux + " es: " + factorial);
    }
}
