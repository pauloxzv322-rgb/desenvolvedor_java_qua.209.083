package com.objeto.app;

public class Pessoa {
    // atributoos
    public String nome;
    public String cpf;
    public String email;
    public int idade;
    public double altura;

    //métodos
    public void exibirDados() {
        System.out.println("DADOS DO USUÁRIO\n");
        System.out.println("NOME: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("EMAIL: " + this.email);
        System.out.println("IDADE: " + this.idade);
        System.out.println("ALTURA: " + this.altura);
        
    }
}
