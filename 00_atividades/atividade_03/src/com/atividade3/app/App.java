package com.atividade3.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia o Scanner
        
        Scanner leia = new Scanner(System.in);

        //declaracao de variaveis
        String nome;
        String resultado;
        double peso;
        double altura;
        double imc;
        


        //entrada de dados
        System.out.println("informe o mome");
        nome = leia.nextLine();
        System.out.println("informe o peso");
        peso = leia.nextDouble();
        System.out.println("informe a altura");
        altura = leia.nextDouble();

        // calcular o imc
        imc = peso/Math.pow(altura, 2);

        //exibe o imc na tela 
        System.out.println(nome + ", seu imc é " + String.format("%.2f" , imc) + ".");

        // verifica o diagnóstico
        resultado = (imc < 18.5)? " está abaixo do peso " :
         (imc <25)?" está no peso ideal" :
         (imc <30 )?" esta acima do peso" :
         (imc <35 )?" esta no peso":
         (imc <40)?" está com obesidade nível 2":
         " está com obesidade morbida ";


        // exiba o resultado
        System.out.println(nome + resultado + " . ");

        //fecha objeto Leia
         leia.close();
    }
}
