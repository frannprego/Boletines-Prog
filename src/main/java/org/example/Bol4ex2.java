package org.example;
import java.util.Scanner;

public class Bol4ex2 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Mostrar menú de opciones
            System.out.println("Seleccione a figura para calcular a superficie:");
            System.out.println("1 - Cadrado");
            System.out.println("2 - Triángulo");
            System.out.println("3 - Círculo");
            System.out.print("Escriba a opción desexada: ");

            int opcion = scanner.nextInt();

            // Procesar la opción elegida usando switch-case
            switch (opcion) {
                case 1:
                    // Calcular área del cuadrado
                    System.out.print("Introduce o lado do cadrado: ");
                    double lado = scanner.nextDouble();
                    double areaCadrado = lado * lado;
                    System.out.println("A superficie do cadrado é: " + areaCadrado);
                    break;

                case 2:
                    // Calcular área del triángulo
                    System.out.print("Introduce a base do triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Introduce a altura do triángulo: ");
                    double altura = scanner.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.println("A superficie do triángulo é: " + areaTriangulo);
                    break;

                case 3:
                    // Calcular área del círculo
                    System.out.print("Introduce o radio do círculo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = Math.PI * radio * radio;
                    System.out.println("A superficie do círculo é: " + areaCirculo);
                    break;

                default:
                    // Opción incorrecta
                    System.out.println("Opción incorrecta.");
                    break;
            }

            // Cerrar el scanner
            scanner.close();
        }
    }


