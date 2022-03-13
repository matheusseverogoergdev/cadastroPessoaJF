/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.MCadastroPessoa.model;

/**
 *
 * @author User
 */
public class VagaEstacionamento {
    private int idVaga;
    private String tpVaga;
    private Carro c; // Exemplo de agregação
    // Falta o número da vaga

    public VagaEstacionamento() {
    
    }
    
    public VagaEstacionamento(int idVaga, String tpVaga, Carro c) {
        this.idVaga = idVaga;
        this.tpVaga = tpVaga;
        this.c = c;
    }

    public int getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }

    public String getTpVaga() {
        return tpVaga;
    }

    public void setTpVaga(String tpVaga) {
        this.tpVaga = tpVaga;
    }

    public Carro getC() {
        return c;
    }

    public void setC(Carro c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "VagaEstacionamento{" + "idVaga=" + idVaga + ", tpVaga=" + tpVaga + ", c=" + c + '}';
    }
    
}
