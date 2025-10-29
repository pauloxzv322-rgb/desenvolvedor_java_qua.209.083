package com.alfandega.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner Leia = new Scanner(System.in);

        //declaração de variaveis

        String nome;
        String resultado;
        double valor;

        //entrada de dados
        System.out.println("informe o nome do passageiro");
        nome = Leia.nextLine();
        System.out.println("informe o valor da bagagem em dólares:");
        valor = Leia.nextDouble();

        //verifica o valor
        resultado = (valor <= 1000) ? " está liberado." : "está retido.";
        
        //mostra resultado
        System.out.println(nome + resultado);

        //fecha objeto Leia
        Leia.close();
    }
}
