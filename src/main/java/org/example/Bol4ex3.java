package org.example;
import java.util.Scanner;


public class Bol4ex3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario un número
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            // Calcular el valor absoluto utilizando el operador ternario
            int valorAbsoluto = (numero < 0) ? -numero : numero;

            // Mostrar el resultado
            System.out.println("O valor absoluto de " + numero + " é: " + valorAbsoluto);

            // Cerrar el scanner
            scanner.close();
        }
    }


