package com.computador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner leia = new Scanner (System.in);

        // declaração de variáveis
        int n;

        // entrada de dados
        System.out.println("Informe um número inteiro: ");
        n = leia.nextInt();

        // loop (laço de repetição)
        while (n >= 0) {
            System.out.println(n);
            n--;
        }

        // fecha objeto leia
        leia.close();
        
    }
}
