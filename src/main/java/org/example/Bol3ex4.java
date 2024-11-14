package org.example;

import java.util.Scanner;

public class Bol3ex4 {
    public Bol3ex4() {
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe o nome da persoa 1");
        String nome1 = sc.next();
        System.out.println("Escribe o peso da persoa 1");
        int peso1 = sc.nextInt();
        System.out.println("Escribe o nome da persoa 2");
        String nome2 = sc.next();
        System.out.println("Escribe o peso da persoa 2");
        int peso2 = sc.nextInt();
        int pesoPesado;
        String nomePesado;
        if (peso1 > peso2) {
            nomePesado = nome2;
            pesoPesado = peso2;
        } else {
            nomePesado = nome2;
            pesoPesado = peso2;
        }

        System.out.println("A persoa máis pesada é" + nomePesado + "e o seu nome é" + pesoPesado + "kg");
        sc = new Scanner(System.in);
        System.out.println("Escribe o nome da persoa 1");
        nome1 = sc.next();
        System.out.println("Escribe o peso da persoa 1");
        peso1 = sc.nextInt();
        System.out.println("Escribe o nome da persoa 2");
        nome2 = sc.next();
        System.out.println("Escribe o peso da persoa 2");
        peso2 = sc.nextInt();
        pesoPesado = peso1 > peso2 ? peso1 : peso2;
        nomePesado = peso1 > peso2 ? nome1 : nome2;
        System.out.println("A persoa máis pesada é"  +  nomePesado  +  "e o seu nome é"  +  pesoPesado  +  "kg");
    }
}


