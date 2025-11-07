package com.heranca.app;

//classe Java importda
import java.util.Scanner;

//classes criadas por min
import com.heranca.models.PessoaFisica;
import com.heranca.models.Pessoajuridica;

public class App {
    public static void main(String[] args) throws Exception {
        //instancias
        Scanner leia = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(
        null,
        null,
        0,
        null,
        null
        );
        Pessoajuridica corp = new Pessoajuridica(
        null,
        null,
        null,
        null,
        null
        );

        //entrada de dados
        System.out.println("INFORME OS DADOS DO USUARIO:\n"); 
        System.out.println("INFORME O NOME");
        usuario.nome = leia.nextLine();
        System.out.println("INFORME O CPF");
        usuario.cpf = leia.nextLine();
        System.out.println("INFORME O EMAIL");
        usuario.email = leia.nextLine();
        System.out.println("INFORME O TELEFONE");
        usuario.telefone = leia.nextLine();
        System.out.println("INFORME A IDADE");
        usuario.idade = leia.nextInt();

        //limpeza de buffer
        leia.nextLine();

        //entrada de dados da empresa
        System.out.println("\ninforme os dados da empresa:\n");
        System.out.println("informe a razao social:");
        corp.nomeFantasia = leia.nextLine();
        System.out.println("informe o nome fantasia");
        corp.razaoSocial = leia.nextLine();
        System.out.println("informe o cnpj");
        corp.cnpj = leia.nextLine();
        System.out.println("informe o email");
        corp.email = leia.nextLine();
        System.out.println("informe o telefone");
        corp.telefone = leia.nextLine();
        System.out.println("\ndados do usuario:\n");
        usuario.exibirDados();
         System.out.println("\ndados da empresa:\n");
        corp.exibirDados();

        //fecha objeto Leia
        leia.close();
        
    }
}
