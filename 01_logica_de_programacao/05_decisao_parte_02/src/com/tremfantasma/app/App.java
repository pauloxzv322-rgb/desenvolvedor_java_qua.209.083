package com.tremfantasma.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        // declaracao de variaveis
        String nome;
        int idade;
        double altura;

        //entrada de dados
        System.out.println("informe o nome");
        nome = leia.nextLine();
        System.out.println("informe a idade");
        idade = leia.nextInt();
        System.out.println("informe a altura em metros");
        altura = leia.nextDouble();

        //estrutura de decisao
        if(idade >= 14 && altura >=1.5) {
            System.out.println(nome + " foi liberado");
        }
            else{
            System.out.println(nome + " nao foi altorizado");
        }
        //fecha objeto scanner
        leia.close();

    }
}
