package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia class Scanner
        Scanner leia = new Scanner(System.in);

        //declaração de variáveis
        double x;
        double y;
        double resultado;
        String operador;

        //entrada de dados
        System.out.println("informe o valor de x:");
        x = leia.nextDouble();
        System.out.println("informe o valor de y:");
        y = leia.nextDouble();

        //Limpeza de buffer
        leia.nextLine();

        //menu
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");
        operador = leia.nextLine();

        switch(operador) {

        case "1":
            resultado = x+y;
            System.out.println("Valor da soma" + resultado);
                break;
        case "2":
            resultado = x-y;
            System.out.println("Valor da subtração" + resultado);
                break;
        case "3":
            resultado = x*y;
            System.out.println("Valor da multiplicação" + resultado);
                break;
        case "4":
            resultado = x/y;
            System.out.println("Valor da divisão" + resultado);
                break;
        default:
             System.out.println("Opção invalida.");
        
        }
        
       

        //fecha objeto Leia
        leia.close();
    }
}
