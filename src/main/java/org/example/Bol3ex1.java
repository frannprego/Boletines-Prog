package org.example;

import java.util.Scanner;
/**
 Sacar un número un número positivo por teclado coa mensaxe "é positivo"
 @version 1.1
 @author: Fran Prego
 */
public class Bol3ex1 {
    public Bol3ex1(){

    }
        public static void main (String[]arg){
            int numero;
            Scanner sc;
            sc = new Scanner(System.in);
            System.out.println("Imprime un número por teclado");

            numero = sc.nextInt();
            if (numero > 0) ;
            System.out.println("0 é número" + numero + "é positivo");

        }
    }
