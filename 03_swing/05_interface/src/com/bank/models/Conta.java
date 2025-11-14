package com.bank.models;

import com.bank.repository.IConta;

public class Conta implements IConta {
    // atributos
    private String titula;
    private String cpf;
    private String agencia;
    private String nconta;
    private double saldo;


    public String getTitula() {
        return this.titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNconta() {
        return this.nconta;
    }

    public void setNconta(String nconta) {
        this.nconta = nconta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //construtor
    public Conta() {
    }


    public Conta(String titula, String cpf, String agencia, String nconta, double saldo) {
        this.titula = titula;
        this.cpf = cpf;
        this.agencia = agencia;
        this.nconta = nconta;
        this.saldo = saldo;
    }


    @Override
    public String consultarDados() {
         return "DADOS DA CONTA: \nNome: "+ this.titula + 
         "\ncpf:" + this.cpf + 
         "\nnumera da agencia: " +this.agencia + 
         "\nnumero da conta:" + this.nconta + 
         "\nsaldo: r$ " + String.format("%.2f", this.saldo);
         


    }

    @Override
    public double depositar(double valor) {
       this.saldo += valor;
       return this.saldo;
    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

}
