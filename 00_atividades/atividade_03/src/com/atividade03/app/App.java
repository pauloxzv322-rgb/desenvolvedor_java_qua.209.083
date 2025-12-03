package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         // instancia a Scanner
        Scanner leia = new Scanner(System.in);
        
        // declaração de variáveis
        String nome;
        String resultado;
        double peso;
        double altura;
        double imc;

        // entrada de dados
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe seu peso em kg: ");
        peso = leia.nextDouble();
        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble();

        // calcular o imc
        imc = peso/Math.pow(altura, 2);

        // exibe o imc na tela
        System.out.println(nome + ", seu IMC é " + String.format("%.2f" , imc) + ".");

        // exibe o diagnóstico
        resultado = (imc < 18.5) ? " Está abaixo do peso" :
        (imc < 25) ? nome + " Está no peso ideal" :
        (imc < 30) ? nome +" Está acima do peso" :
        (imc <35) ? nome + " Está obeso" :
        (imc < 40) ? nome + " Está com obesidade nível 2" :
        nome + " Está com obesidade mórbida";

        // exibe o resultado
        System.out.println(nome + resultado + ".");
        
          
        
        leia.close();
    }
}
