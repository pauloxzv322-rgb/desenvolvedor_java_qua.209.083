package com.imc.app;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar peso y altura
        System.out.print("Ingrese su peso em kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura em metros: ");
        double altura = scanner.nextDouble();

        // Calcular IMC
        double imc = peso / (altura * altura);

        // Mostrar resultado
        System.out.printf("Seu IMC es: %.2f%n", imc);

        // Clasificación del IMC
        if (imc < 18.5) {
            System.out.println("Categoría: Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Categoría: Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Categoría: Sobrepeso");
        } else {
            System.out.println("Categoría: Obesidade");
        }

        scanner.close();
    }
}
