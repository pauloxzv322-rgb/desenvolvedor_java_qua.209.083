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
    String filme = "";
    int idadeMinima = 0;
    int idade;
    

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
        System.out.println("sala 2 - " + salas [1] + "- 12 anos");
        System.out.println("sala 3 - " + salas [2] + "- 14 anos");
        System.out.println("sala 4 - " + salas [3] + "- 16 anos");
        System.out.println("sala 5 - " + salas [4] + "- 18 anos");
        sala = leia.nextLine();

        switch (sala) {
            case "1":
                filme = salas[0];
                idadeMinima = 0;
                break;
            case "2":
                filme = salas[1];
                idadeMinima = 12;
                break;
             case "3":
                 filme = salas[2];
                idadeMinima = 14;
                break;
             case "4":
                filme = salas[3];
                idadeMinima = 16;
                break;
            case "5":
                filme = salas[4];
                idadeMinima = 18;
                break;
            default:
                System.out.println("Sala Inesistente");
        }

        //verificação da idade
        if (idade >= idadeMinima) {
            System.out.println("filme escolhido: " + filme);
            System.out.println("Tenha um ótimo filme, " + nome);
            System.out.println("👌");

            }

            else {
                System.out.println("Entrada não permitida");
                System.out.println("Favor escolher outro filme");


            }

            
    } while (idade < idadeMinima);
    

   //fecha objeto leia
   leia.close();

    }
}
