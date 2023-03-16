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
public class Ejer2Guia2 {
    public static void main (String[] args) {
        Scanner teclear = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre:");
        nombre = teclear.next();
        
        System.out.println("Su nombre es: " + nombre + "\n\nBienvenido a JAVA!!!");
    }
}
