package com.heranca.models;

public class Pessoa {    
    //atributos
    public String email;
    public String telefone;

    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public void exibirDados(){
        System.out.println("email: " + this.email);
        System.out.println("telefone: " + this.telefone);
        }
}
