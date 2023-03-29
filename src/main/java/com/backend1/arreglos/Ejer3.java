/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend1.arreglos;

import java.util.Scanner;

/**
 *
 * @author Ruben
 * 
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 * 
 */
public class Ejer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int n = in.nextInt();
        
        int vector[] = new int[n];
        
        Cargar(vector);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " ");
        }
        System.out.println("\n\n");
        
        contar(vector);
    }
    
    public static void Cargar(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*99999)+1;
        }
    }
    
    public static void contar(int vector[]) {
        String longitud = "";
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        for (int i = 0; i < vector.length; i++) {
            
            longitud = Integer.toString(vector[i]);
            switch (longitud.length()) {
                case (1):
                    cont1++;
                    break;
                    case (2):
                    cont2++;
                    break;
                    case (3):
                    cont3++;
                    break;
                    case (4):
                    cont4++;
                    break;
                    case (5):
                    cont5++;
                    break;
            }
        }
        System.out.println("Cantidad de numeros de 1 digito: " + cont1);
        System.out.println("Cantidad de numeros de 2 digito: " + cont2);
        System.out.println("Cantidad de numeros de 3 digito: " + cont3);
        System.out.println("Cantidad de numeros de 4 digito: " + cont4);
        System.out.println("Cantidad de numeros de 5 digito: " + cont5 + "\n\n");
    }
}
