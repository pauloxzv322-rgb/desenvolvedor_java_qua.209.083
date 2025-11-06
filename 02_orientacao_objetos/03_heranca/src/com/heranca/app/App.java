package com.heranca.app;


import com.heranca.models.PessoaFisica;
import com.heranca.models.Pessoajuridica;
public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        Pessoajuridica empresa = new Pessoajuridica();



        usuario.nome = "Paulo Henrique";
        usuario.cpf = "12345678978";
        usuario.email = "pauloxzv322@gmail.com";
        usuario.telefone = "(61) 98614633";
        usuario.idade = 36;

        empresa.razaoSocial = "Paulo LTDA";
        empresa.nomeFantasia = "Paulo LTDA" ;
        empresa.cnpj = "55.076.551/0004-20";
        empresa.email = "paulo@gmail";
        empresa.telefone = "6198765433";  



        System.out.println("nome do usuario: " + usuario.nome);
        System.out.println("cpf do usuario: " + usuario.cpf);
        System.out.println("email do usuario: " + usuario.email);
        System.out.println("telefone do usuario: " + usuario.telefone) ;
        System.out.println("idade do usuario: " + usuario.idade + " anos.");
        System.out.println("\n------------------------------------------\n");
        System.out.println("Razao Social Da Empresa: " + empresa.razaoSocial);
        System.out.println("Nome da Empresa "  +empresa.nomeFantasia);
        System.out.println("CNPJda Empresa "  + empresa.cnpj);
        System.out.println("Email da Empresa " +   empresa.email);
        System.out.println("telefone da Empresa " + empresa.telefone);
    }
}
