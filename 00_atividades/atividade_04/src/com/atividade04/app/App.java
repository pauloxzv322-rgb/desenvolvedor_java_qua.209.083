package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

         //instancia o Scanner
        Scanner leia = new Scanner(System.in);
        
    //declaracao de variáveis
    String[] salas = new String[5];
    String nome;
    String sala;
    int idade;
    int idadeMinima = 0;
    

    // inicializar o array
    salas [0] = "A roda quadrada";
    salas [1] = "A volta dos que nao foram";
    salas [2] = "Poeira em alto mar";
    salas [3] = "As tranca do rei careca";
    salas [4] = "Avinganca do peixe frito";

    //entrada de dados
    System.out.println("informe o mome:");
    nome = leia.nextLine();
    System.out.println("informe a idade:");
    idade = leia.nextInt();

    // Loop

   //limpeza de buffer
   leia.nextLine();

    do {
        //menu

        System.out.println("sala 1 - " + salas [0] + "- livre");
        System.out.println("sala 1 - " + salas [1] + "- 12 anos");
        System.out.println("sala 1 - " + salas [2] + "- 14 anos");
        System.out.println("sala 1 - " + salas [3] + "- 16 anos");
        System.out.println("sala 1 - " + salas [4] + "- 18 anos");
        sala = leia.nextLine();

        // TODO: terminar o programa

    } while (idade < idadeMinima);
    

   //fecha objeto leia
   leia.close();

    }
}
