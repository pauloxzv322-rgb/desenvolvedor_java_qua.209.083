package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia as classes
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();


        //entrada de dados
        System.out.println("informe seu nome");
        usuario.setNome(leia.nextLine());
        System.out.println("informe seu cpf");
        usuario.setCpf(leia.nextLine());
        System.out.println("informe seu email");
        usuario.setEmail(leia.nextLine());
        System.out.println("informe seu idade");
        usuario.setIdade(leia.nextInt());

        //saida de dados
        System.out.println("\ndados do usuario:\n");
        System.out.println("nome: " + usuario.getNome());
        System.out.println("cpf:  " + usuario.getCpf());
        System.out.println("email:  " + usuario.getEmail());
        System.out.println("iddade: " + usuario.getIdade());
        
        //fecha objeto leia
        leia.close();
    }
}
