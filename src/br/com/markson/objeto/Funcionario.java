/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.markson.objeto;

/**
 *
 * @author markson.marcolino
 */
public class Funcionario extends Pessoa {
    private String cargo;
    private float salario, valorHora, quantidadeHorasTrabalhada;
    //criar um método para calcular o salario com base no valor da hora e na quantidade de horas trabalhadas

    public Funcionario(String cargo, float valorHora, float quantidadeHorasTrabalhada, String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.quantidadeHorasTrabalhada = quantidadeHorasTrabalhada;
    }

    
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQuantidadeHorasTrabalhada() {
        return quantidadeHorasTrabalhada;
    }

    public void setQuantidadeHorasTrabalhada(float quantidadeHorasTrabalhada) {
        this.quantidadeHorasTrabalhada = quantidadeHorasTrabalhada;
    }
    
    
    
}
