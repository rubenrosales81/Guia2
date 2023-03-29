/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend1.arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * 
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 * 
 */
public class Ejer2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        
        int[] vector = crearVector(n);
        
        System.out.println("Qué numero desea buscar");
     
        int num = sc.nextInt();
        
        buscarNumero (vector, num, n);
        
    }
    
    public static int[] crearVector(int n){
        
        int[] vector = new int[n];
        Random randomNum = new Random();
        
        
        for (int i = 0; i < n; i++) {      
            vector[i] = randomNum.nextInt(100); 
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
        
        
        return vector;
    }
    
    public static boolean buscarNumero (int[] vector, int num, int n){
        
        boolean encontrado = false;
        
        int counter = 0;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == num){
                encontrado = true;
                counter ++;
                System.out.println("El numero se encuentra en la posicion " + i);
                
                
            }
        }
        
        System.out.println("Aparece un total de: " + counter + " veces");
        return encontrado;
    }
}
