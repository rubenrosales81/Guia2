/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend1.arreglos;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Ejer6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int matriz [][] = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero en ["+ (i+1) + "," + (j+1) + "]");
                matriz[i][j] = in.nextInt();
            }
        }
        
        //muestro
        System.out.println("\nLa matriz\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        //es magica
        // suma filas
        int fila1 = 0;
        int fila2 = 0;
        int fila3 = 0;
        
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;
        
        int diag1 = 0;
        int diag2 = 0;
        
        
        for (int i = 0; i < 3; i++) {
            fila1 += matriz[i][0];
        }
        for (int i = 0; i < 3; i++) {
            fila2 += matriz[i][1];
        }
        for (int i = 0; i < 3; i++) {
            fila3 += matriz[i][2];
        }
        

        for (int i = 0; i < 3; i++) {
            col1 += matriz[0][i];
        }
        for (int i = 0; i < 3; i++) {
            col2 += matriz[1][i];
        }
        for (int i = 0; i < 3; i++) {
            col3 += matriz[2][i];
        }
        
        for (int i = 0; i < 3; i++) {
            diag1 += matriz[i][i];
        }
        
        diag2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
        
        
        if (fila1 == fila2 && fila2 == fila3 && diag1 == diag2) {
            System.out.println("ES MAGICO!!!");
        }
        else {
            System.out.println("NO es magico");
        }
//        System.out.println(fila1);
//        System.out.println(fila2);
//        System.out.println(fila3);
//        System.out.println(col1);
//        System.out.println(col2);
//        System.out.println(col3);
//        System.out.println(diag1);
//        System.out.println(diag2);
        
    }
}
