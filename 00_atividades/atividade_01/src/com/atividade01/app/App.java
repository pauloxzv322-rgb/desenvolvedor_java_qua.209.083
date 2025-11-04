package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     //instancia o Scanner
        Scanner leia = new Scanner(System.in);


        //declaracao de valores
        String nome;
        String datanasc;
        String cpf;
        String email;
        String telefone;

        //entrada de dados
        System.out.println("informe seu nome:");
        nome = leia.nextLine();
        System.out.println("informe sua data de nascimento:");
        datanasc = leia.nextLine();
        System.out.println("informe seu cpf:");
        cpf = leia.nextLine();
        System.out.println("informe seu e-mail:");
       email = leia.nextLine();
        System.out.println("informe seu telefone:");
       telefone = leia.nextLine();
        
        // saida de dados
        
       System.out.println("nome : "+ nome);
       System.out.println("data de nascimento : "+ datanasc);
       System.out.println("nomecpf : "+ cpf);
       System.out.println("email : "+ email);
       System.out.println("telefone : "+ telefone);


      
    }
}
