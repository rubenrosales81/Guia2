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
public class Ejer4Guia2 {
    public static void main (String[] args) {
        Scanner introducir = new Scanner(System.in);
        float temperat;
        System.out.println("Ingrese la temperatura en grados centigrados:");
        temperat = introducir.nextFloat();
        System.out.println("La temperatura " + temperat + " C"
                + "\nEquivale a " + (32 + (9 * temperat / 5)) + " F");
    }
    
}
