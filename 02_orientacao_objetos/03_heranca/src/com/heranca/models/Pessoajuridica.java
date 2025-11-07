package com.heranca.models;

public class Pessoajuridica extends Pessoa {


    //atributos
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;


    public Pessoajuridica(String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone) {
        super(email, telefone);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public void exibirDados(){
        System.out.println("razao social:" + this.razaoSocial);
        System.out.println("nome da empresa:" + this.nomeFantasia);
        System.out.println("cnpj:" + this.cnpj);
        super.exibirDados();
    }

}
