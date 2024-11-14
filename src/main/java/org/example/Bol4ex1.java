package org.example;
import java.util.Scanner;

public class Bol4ex1 {
        public static void main (String [] args) {
            Scanner scanner = new Scanner(System.in);

            int vendas_anuais=scanner.nextInt();;
            int artigo_consumo=scanner.nextInt();;
            System.out.println("Indica o tipo de vendas anuais");

            if (vendas_anuais > 100) {
                System.out.println("O  consumo é baixo");
            }
            if (vendas_anuais>100 || vendas_anuais<500) {
                System.out.println("O  consumo é medio");
            }
            if (vendas_anuais>500 || vendas_anuais<1000) {
                System.out.println("O  consumo é alto");
            }
            if (vendas_anuais == 1000) {
                System.out.println("O  consumo é medio");
            }


        }

    }


