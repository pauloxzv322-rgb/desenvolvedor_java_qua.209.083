package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        //declaracao de variáveis
        String nome;
        int idade;
        // entrada de dados
        System.out.println("informe o nome:");
        nome = leia.nextLine();
        System.out.println("informe idade");
        idade = leia.nextInt();

        //estrutura de decisao

        if (idade >=18){
            System.out.println(nome + "é maior de idade");
        }
        else {
            System.out.println(nome + "é menor de idade");
        }




        //fecha objeto Leia
        leia.close();


    }
}
