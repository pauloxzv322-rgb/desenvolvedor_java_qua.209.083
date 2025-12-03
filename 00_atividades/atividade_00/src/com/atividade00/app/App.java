package com.atividade00.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a Scanner
        Scanner leia = new Scanner(System.in);

        //declaracao de variaveis
        String nome;
        String dataNascimento;
        String cpf;
        String email;
        String telefone;

         //entrada de dados
        System.out.println("informe seu nome:");
        nome = leia.nextLine();
        System.out.println("informe sua data de nascimento: ");
        dataNascimento = leia.nextLine();
        System.out.println("Informe seu CPF: ");
        cpf = leia.nextLine();
        System.out.println("Informe seu email: ");
        email = leia.nextLine();
        System.out.println("Informe seu telefone: ");
        telefone = leia.nextLine();

        // saída de dados
        System.out.println("Dados Cadastrados:");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        
        // fecha objeto leia
        leia.close();
    }
}
