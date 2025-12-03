package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // instância do objeto leia
        Scanner leia = new Scanner(System.in);

        //declaracao de variaveis
        String nome;
        String email;
        int idade;
        double altura;

        //entrada de dados
        System.out.println("informe seu nome:");
        nome = leia.nextLine();
        System.out.println("informe sua idade:");
        idade = leia.nextInt();
        System.out.println("informe sua altura em metros:");
        altura = leia.nextDouble();

        //limpeza de buffer
        leia .nextLine();
        System.out.println("coloque seu email");
        email = leia.nextLine();

        //saida de dados
        System.out.println("nome: " + nome);
        System.out.println("idade:" + idade);
        System.out.println("altura:" + altura + "m");
        System.out.println("E-mail: " + email);
        
        //fecha objeto close
        leia.close();

    }
}
