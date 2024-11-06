package org.example;
import java.util.Scanner;

/**Leer 2 números e calcular : 1º a suma , despois a resta, a continuación o producto e por último o cociente
 *@version 1.1
 *@author: Fran Prego
 */
public class Bol2ex4 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Leer dos números desde el teclado
            System.out.print("Introduce o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Introduce o segundo número: ");
            double num2 = scanner.nextDouble();

            // Calcular e amosar a suma
            double suma = num1 + num2;
            System.out.println("A suma é: " + suma);

            // Calcular e amosar a resta
            double resta = num1 - num2;
            System.out.println("A resta é: " + resta);

            // Calcular e amosar o producto
            double producto = num1 * num2;
            System.out.println("O produto é: " + producto);

            // Calcular e amosar o cociente
            if (num2 != 0) {
                double cociente = num1 / num2;
                System.out.println("O cociente é: " + cociente);
            } else {
                System.out.println("Non se pode dividir entre cero.");
            }

            // Cerrar o escáner
            scanner.close();
        }
    }

