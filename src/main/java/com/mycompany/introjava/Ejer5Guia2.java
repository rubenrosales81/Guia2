/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introjava;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */

/**
 * Escribir un programa que lea un número entero por teclado
 * y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */

public class Ejer5Guia2 {
    public static void main (String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        num = in.nextInt();
        
        System.out.println("\nEl numero " + num + 
                "\nSu dobre es: " + (2 * num) +
                "\nSu triple es: " + (3 * num) +
                "\nSu raiz cuadrada es: " + Math.sqrt(num));
        
    }
}
