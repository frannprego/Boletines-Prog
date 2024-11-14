package org.example;

public class Bol4ex4 {
    public static void main(String args[]) {
        int numero = 99;
        int decenas, unidades;
        String deCadea = "", uniCadea = "", conxuncion = "", espazo = "";
        decenas = numero / 10;
        unidades = numero % 10;
        switch (unidades) {
            case 0 -> uniCadea = "";
            case 1 -> uniCadea = "un";
            case 2 -> uniCadea = "dous";
            case 3 -> uniCadea = "tres";
            case 4 -> uniCadea = "catro";
            case 5 -> uniCadea = "cinco";
            case 6 -> uniCadea = "seis";
            case 7 -> uniCadea = "sete";
            case 8 -> uniCadea = "oito";
            case 9 -> uniCadea = "nove";
        }
        switch (decenas) {
            case 0: uniCadea = "";  break;
            case 1: switch (unidades){
                case 0 -> uniCadea = "dez";
                case 1 -> uniCadea = "once";
                case 2 -> uniCadea = "doce";
                case 3 -> uniCadea = "trece";
                case 4 -> uniCadea = "catorce";
                case 5 -> uniCadea = "quince";
                case 6 -> uniCadea = "dezaseis";
                case 7 -> uniCadea = "dezasete";
                case 8 -> uniCadea = "dezaoito";
                case 9 -> uniCadea = "dezanove";

            }
                /*
                if (unidades == 1) uniCadea = "once";
                else if(unidades == 2) uniCadea = "doce";
                else if(unidades == 3) uniCadea = "trece";
                else if(unidades == 4) uniCadea = "catorce";
                else if(unidades == 5) uniCadea = "quince";
                else if(unidades == 6) uniCadea = "dezaseis";
                else if(unidades == 7) uniCadea = "dezasete";
                else if(unidades == 8) uniCadea = "dezaoito";
                else if(unidades == 9) uniCadea = "dezanove";
                else if(unidades == 0) uniCadea = "dez";
                */
                break;
            case 2: deCadea = "vinte";    break;
            case 3: deCadea = "trinta";   break;
            case 4: deCadea = "corenta";  break;
            case 5: deCadea = "cincuenta";break;
            case 6: deCadea = "sesenta";  break;
            case 7: deCadea = "setenta";  break;
            case 8: deCadea = "oitenta";  break;
            case 9: deCadea = "noventa";  break;
        }
        conxuncion = (unidades == 00 || decenas == 0 || decenas == 1) ? "" : "e" ;
        System.out.println("O número é:" + deCadea + " " + conxuncion + " " + uniCadea );


    }
}

