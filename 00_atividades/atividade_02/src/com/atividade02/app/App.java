package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

//instancia o Scanner 
    Scanner leia = new Scanner(System.in);
       double a;
       double b;
       double x;

       //entrada de dados

       System.out.println("informe o valor de a");
        a = leia.nextDouble();
       System.out.println("informe o valor de b");
       b = leia.nextDouble();

       //calculadora a equacao do 1º grau a*x + b = 0
       if (a !=0) {
        x = -b/a;
        System.out.println("x = "+ x);

       }
       else{System.out.println("nao existe raiz real");}

       leia.close ();
    }
}
