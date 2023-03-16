/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.introjava;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class IntroJava {

    public static void main(String[] args) {
        
        String frase;
        int opcion;
        
        System.out.println("Hola Mundo!\n\nIngrese su nombre");
        Scanner introducir = new Scanner(System.in);
         
        frase = introducir.next();
        System.out.println("Senior: " + frase + " Bienvenido a JAVA!!!\n\n");
        
        System.out.println("Califique el curso del 1 al 10:");
        
        opcion = introducir.nextInt();
        
        if (opcion >= 1 && opcion <= 5) {
            switch (opcion) {
                case 1:
                case 2: {
                    System.out.println("\nLamentamos que no hayas tenido una buena experiencia durante el cursasdo\n\n");
                    break;
                }
                case 3: {
                    System.out.println("Ha calificado el curso como Bueno");
                    break;
                }
                case 4: {
                    System.out.println("Buenísimo, nos alegramos que haya aprendido mucho con nosotros!\n");
                    break;
                }    
                case 5: {
                    System.out.println("Excelente! has tenido una hermosa experiencia y ha tenido un buen aprendizaje\n");
                    break;
                }
            }
        } else if (opcion < 0) {
            System.out.println("Tan malo fue?\n");
        } else if (opcion == 0) {
            System.out.println("\"0\" opcion no valida, no se toma en cuenta\n");
        } else {
            System.out.println("tan, pero tan bueno fue?\n");
        }
    }
}
