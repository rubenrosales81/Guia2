/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.backend1.arreglos;

import java.util.Scanner;

/**
 *
 * @author Ruben
 * 
 * EJERCICIO 13 - MATERIAL DE ESTUDIO
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
 * de equipo y define su tipo de dato de tal manera que te permita alojar
 * sus nombres más adelante.
 * 
 */
public class Arreglos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de miembros del grupo");
        int num = in.nextInt();
        
        //defino el vector
        
        String equipo [] = new String[num];
        
        //cargo los integrantes en el vector
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingrese el miembro " + (i+1) + " del equipo:");
            equipo [i] = in.next();
        }
        
        //muestro
        System.out.println("\nLos integrantes del equipo son:\n");
        for (int i = 0; i < equipo.length; i++) {
            System.out.print(equipo[i] + " ");
        }
        System.out.println("\n");
    }
}
