package com.atividade.models;

public class Pessoa {
    // atributos
    private String nome;
    private double peso;
    private double altura;
    private double imc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para retornar o diagnóstico
    public String getDiagnostico() {
        imc = calcularIMC();
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 24.9) return "Peso normal";
        else if (imc < 29.9) return "Sobrepeso";
        else if (imc < 34.9) return "Obesidade Grau I";
        else if (imc < 39.9) return "Obesidade Grau II";
        else return "Obesidade Grau III (mórbida)";
    }
}
