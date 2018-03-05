/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.markson.objeto;

import java.util.Date;

/**
 *
 * @author markson.marcolino
 */
public class Dependente extends Pessoa {
    private Date dataNascimento;
    private int idade; // Criar um método para calcular a idade
    private Cliente responsavel;

    public Dependente(Date dataNascimento, Cliente responsavel, String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.dataNascimento = dataNascimento;
        this.responsavel = responsavel;
    }

    
    
    public Cliente getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Cliente responsavel) {
        this.responsavel = responsavel;
    }
    
    

    
    
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
