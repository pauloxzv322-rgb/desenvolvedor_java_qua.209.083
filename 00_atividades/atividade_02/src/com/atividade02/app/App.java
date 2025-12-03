package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // declaração de varíaveis
        double a;
        double b;
        double x;

        // equação do 1ºgrau
        System.out.println("Cálculo da equação do 1º Grau ");
        System.out.println("A equação tem a forma ax + b = 0");

        // calcule a equação do 1ºgrau
        System.out.println("Informe o valor de a: ");
        a = leia.nextDouble();
        System.out.println("Informe o valor de b: ");
        b = leia.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do 1ºGrau (a deve ser diferente de 0)");
        }
        else {
            x = -b / a;
            System.out.println("A raiz da equação é: x = " + x);
        }
        
        // fecha objeto leia
        leia.close();
    }
}
