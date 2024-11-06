package org.example;

import java.util.Scanner;

/**Pasar valor dunha distancia en millas a metros
 *@version 1.1
 *@author: Fran Prego
 */
public class Bol2ex5 {
    public Bol2ex5(){

    }

    public static void main(String[] args) {
        double cambio, millas, metros;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce o cambio milla-metro :");
        cambio = entradaTeclado.nextDouble();
        System.out.println("Introduce o número de millas a cambiar");
        millas = entradaTeclado.nextDouble();
        metros = millas/cambio;
        System.out.println(metros +" Dolares de cambio, por "+ millas+ "metros.");
        entradaTeclado.close();
    }
}