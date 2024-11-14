package org.example;
import java.util.Scanner;
public class Bol3ex5 {
    public static void main(String []args){

                Scanner scanner = new Scanner(System.in);

                // Leer tres números enteros
                System.out.print("Introduce o primeiro número: ");
                int numero1 = scanner.nextInt();

                System.out.print("Introduce o segundo número: ");
                int numero2 = scanner.nextInt();

                System.out.print("Introduce o terceiro número: ");
                int numero3 = scanner.nextInt();

                // Determinar el mayor de los tres números
                int maior;
                if (numero1 > numero2 && numero1 > numero3) {
                    maior = numero1;
                } else if (numero2 > numero1 && numero2 > numero3) {
                    maior = numero2;
                } else {
                    maior = numero3;
                }

                // Mostrar el mayor número
                System.out.println("O número maior é: " + maior);

                // Cerrar el scanner
                scanner.close();
            }
        }




