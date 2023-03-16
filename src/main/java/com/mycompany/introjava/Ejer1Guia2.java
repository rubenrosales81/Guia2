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
public class Ejer1Guia2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero 1:");
        num1 = leer.nextInt();
        System.out.println("Ingrese numero 2:");
        num2 = leer.nextInt();
        
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
