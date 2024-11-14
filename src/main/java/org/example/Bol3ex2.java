package org.example;
import java.util.Scanner;

/**
 Teclear 2 números onde Se o primeiro é maior ou igual que o segundo,visualizaremos a resta, en calquera caso visualizaremos a suma.
 @version 1.1
 @author: Fran Prego
 */

public class Bol3ex2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Leer dos números de tipo short
            System.out.print("Introduce o primeiro número (tipo short): ");
            short numero1 = scanner.nextShort();

            System.out.print("Introduce o segundo número (tipo short): ");
            short numero2 = scanner.nextShort();

            // Verificar si el primer número es mayor o igual que el segundo
            if (numero1 >= numero2) {
                short resta = (short) (numero1 - numero2);  // Calcular la resta
                System.out.println("A resta dos números é: " + resta);
            }

            // Calcular y mostrar la suma en cualquier caso
            short suma = (short) (numero1 + numero2);  // Calcular la suma
            System.out.println("A suma dos números é: " + suma);

            // Cerrar el scanner
            scanner.close();
        }
    }



