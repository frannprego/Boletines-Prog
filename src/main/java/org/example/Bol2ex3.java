package org.example;

import java.util.Scanner;

/**
 * Algoritmo que cambie euros a dólares
 @version 1.1
 @author: Fran Prego*/

public class Bol2ex3 {
    public Bol2ex3() {
    }

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce o cambio euro-dolar do día de hoxe:");
        double cambio = entradaTeclado.nextDouble();
        System.out.println("Introduce a cantidade de euros a cambiar");
        double euros = entradaTeclado.nextDouble();
        double dolares = euros / cambio;
        System.out.println("" + dolares + " Dolares de cambio, por " + euros + "Euros.");
        entradaTeclado.close();
    }
}
