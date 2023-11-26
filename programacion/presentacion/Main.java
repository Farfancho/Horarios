package org.javeriana.programacion.presentacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase = "";
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Bienvenido al generador de horarios");
            System.out.println("1) Añadir una materia al archivo");
            System.out.println("2) Generar horarios");
            System.out.println("3) Editar Archivo");

            System.out.println("Desea continuar con la ejecucion del programa?");
            frase = s.nextLine();
        }while (frase.equals("S") || frase.equals("s"));
    }
}