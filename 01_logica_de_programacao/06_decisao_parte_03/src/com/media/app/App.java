package com.media.app;

import java.util.Scanner;
//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // instancia a classe Scanner
     Scanner leia = new Scanner (System.in);

     // declaracao de variaveis
     String nome;
     double nota;

     //entrada de dados

     System.out.println("informe o nome");
     nome = leia.nextLine();
     System.out.println("informe a nota de 0 10:");
     nota = leia.nextDouble();

     //verifica se a nota é válida
     if (nota >=0 && nota <=10) {
        if(nota >= 7) {
            System.out.println( nome + "esta aprovado.");      
        }
        else if (nota >= 5) {
            System.out.println(nome + "está de recuperação.");
            
        }
        else {
        System.out.print(nome + "está reprovado");
        }
    }
    else{
    System.out.println("Nota invalida.");
     }

     // fecha objeto leia
     leia.close();
    }
}
