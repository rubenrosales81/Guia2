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
 * Realizar un algoritmo que llene un vector con los 100 primeros números enteros
 * y los muestre por pantalla en orden descendente.
 * 
 */
public class Ejer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num[] = new int [100];
        
        int cont = 100;
        for (int i = 0; i < 100; i++) {
            num[i] = cont;
            System.out.println(cont);
            cont--;
        }
    }
}
