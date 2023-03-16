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
public class Ejer3Guia2 {
    public static void main (String[] args) {
        Scanner introducir = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase:");
        frase = introducir.next();
        
        System.out.println("EN MAYUSCULA: " + frase.toUpperCase()
        + "\nEn minuscula:" + frase.toLowerCase());
    }
}
